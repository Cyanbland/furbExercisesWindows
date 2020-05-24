package furb.code;

import javax.swing.JOptionPane;

/*Escreva um programa que permita implementar, inserir e manipular os dados dos funcionários
de uma empresa. Devem ser lidos e armazenados em dois arrays as matrículas e as idades de 20
funcionários.
Após a finalização da entrada dos dados dos funcionários, o programa deve apresentar o
seguinte menu:
1. MOSTRAR
2. ORDENAR CRESCENTE (matrículuas)
3. ORDENAR DESCRESCENTE
4. INVERTER
5. PROCURAR MATRICULA
6. PROCURAR IDADE
7. MEDIA
8. MAIS IDOSO
9. ANIVERSARIO
10. REPETE
99. VAZAR 

SOMENTE 2 ARRAYS
*/


public class AvaliativeWork2 {

	static int numberOfEmployees = 20;
	
	public static void main(String[] args) {
		String input;
		
		int option, id;
		int ageCount = 0;
		
		int[] registrations = new int[numberOfEmployees];
		int[] ages = new int[numberOfEmployees];
		
		for (int i = 0; i < numberOfEmployees; i++) {
			input = JOptionPane.showInputDialog((i+1) + ") Informe a matrícula do funcionário: ");
			registrations[i] = Integer.parseInt(input);
			input = JOptionPane.showInputDialog((i+1) + ") Informe a idade do funcionário: ");
			ages[i] = Integer.parseInt(input);
			ageCount += ages[i];
		}
		
		do {
			input = JOptionPane.showInputDialog("1. MOSTRAR\r\n" + 
					"2. ORDENAR CRESCENTE\r\n" + 
					"3. ORDENAR DESCRESCENTE\r\n" + 
					"4. INVERTER\r\n" + 
					"5. PROCURAR MATRICULA\r\n" + 
					"6. PROCURAR IDADE\r\n" + 
					"7. MEDIA\r\n" + 
					"8. MAIS IDOSO\r\n" + 
					"9. ANIVERSARIO\r\n" + 
					"10. REPETE\r\n" + 
					"99. VAZAR ");
			option = Integer.parseInt(input);
			
			switch(option) {
				case 1: 
					showData(registrations, ages);
					break;
					
				case 2:
					for (int loop = 1; loop <= registrations.length; loop++) {
						for (int i = 0; i < (registrations.length - 1); i++) {
							if (registrations[i] > registrations[i + 1]) {
								int aux = registrations[i];
								registrations[i] = registrations[i + 1];
								registrations[i + 1] = aux;
								
								int ageAux = ages[i];
								ages[i] = ages[i + 1];
								ages[i + 1] = ageAux;
							}
						}
					}
					break;
					
				case 3:
					for (int loop = 1; loop <= registrations.length; loop++) {
						for (int i = 0; i < (registrations.length - 1); i++) {
							if (registrations[i] < registrations[i + 1]) {
								int aux = registrations[i + 1];
								registrations[i + 1] = registrations[i];
								registrations[i] = aux;
								
								int ageAux = ages[i + 1];
								ages[i + 1] = ages[i];
								ages[i] = ageAux;
							}
						}
					}
					break;
					
				case 4: 
					for (int i = 0; i < registrations.length/2; i++) {
						int r = registrations[i];
						int a = ages[i];
						registrations[i] = registrations[registrations.length - i - 1];
						registrations[registrations.length - i - 1] = r;
						
						ages[i] = ages[ages.length - i - 1];
						ages[ages.length - i - 1] = a;
					}
					break;
					
				case 5:
					input = JOptionPane.showInputDialog("Informe um número de matrícula para verificar a sua existência: ");
					id = Integer.parseInt(input);
					
					if (checkRegistration(id, registrations)) {
						System.out.println("O funcionário consta nos registros.");
					}
					else {
						System.out.println("O funcionário não consta nos registros.");
					}
					break;
					
				case 6:
					input = JOptionPane.showInputDialog("Informe um número de matrícula para obter a idade do funcionário: ");
					id = Integer.parseInt(input);
					int age = getAgeByRegistration(id, registrations, ages);
					if (age != 0) {
						System.out.println("O funcionário " + id + " possui " + age + " anos de idade.");
					}
					else {
						System.out.println("Não foi possível encontrar essa matrícula!");
					}
					break;
					
				case 7:
					float average = ((float)ageCount/numberOfEmployees);
					System.out.println("A média de idade da empresa é: " + average);
					break;
				
				case 8:
					int oldestEmployeeRegistration = getOldestEmployeeRegistration(registrations, ages);
					if (oldestEmployeeRegistration != 0) {
						System.out.println("O funcionário " + oldestEmployeeRegistration + " é o mais idoso da empresa.");
					}
					else {
						System.out.println("Erro!");
					}
					break;
				
				case 9: 
					input = JOptionPane.showInputDialog("Informe um número de matrícula para indicar o aniversáio do funcionário: ");
					id = Integer.parseInt(input);
					
					boolean isValid = false;
					for (int i = 0; i < registrations.length; i++) {
						if (id == registrations[i]) {
							ages[i] += 1;
							isValid = true;
							System.out.println("O funcionário " + registrations[i] + " agora possui " + ages[i] + " anos de idade.");
						}
					}
					if (!isValid) {
						System.out.println("Não foi possível encontrar o fucionário.");
					}
					break;
					
				case 10:
					boolean ageRepeated = false;
					for (int i = 0; i < ages.length; i++) {
							for (int j = 0; j < ages.length; j++) {
								if (ages[i] == ages[j] && i != j) {
									ageRepeated = true;
								}
							}
						}
					if (ageRepeated) {
						System.out.println("Há funcionários com a mesma idade na empresa.");
					}
					else {
						System.out.println("Não há funcionários com a mesma idade na empresa.");
					}
			}
			
		} while(option != 99 || option <= 10);

	}
	
	
	private static void showData(int[] regsArr, int[] agesArr) {
		System.out.println("");
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.println((i+1) + ") Matrícula: " + regsArr[i] + " | Idade: " + agesArr[i]);
		}
	}

	
	private static boolean checkRegistration(int regId, int[] regArr) {
		boolean isRegistered = false;
		for (int i = 0; i < numberOfEmployees; i++) {
			if (regId == regArr[i]) {
				isRegistered = true;
			}
		}
		return isRegistered;
	}
	
	private static int getAgeByRegistration(int regId, int[] regsArr, int[] agesArr) {
		int employeeAge = 0;
		for (int i = 0; i < regsArr.length; i++) {
			if (regId == regsArr[i]) {
				employeeAge = agesArr[i];
			}
		}
		return employeeAge;
	}
	
	private static int getOldestEmployeeRegistration(int[] regsArr, int[] agesArr) {
		int oldestAge = 0;
		int oldestEmployeeRegistration = 0;
		for (int i = 0; i < agesArr.length; i++) {
			if (agesArr[i] > oldestAge) {
				oldestAge = agesArr[i];
				oldestEmployeeRegistration = regsArr[i];
			}
		}
		return oldestEmployeeRegistration;
	}

}
