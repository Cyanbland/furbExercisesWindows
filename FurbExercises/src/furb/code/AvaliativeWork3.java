package furb.code;

import javax.swing.JOptionPane;

/*Escreva um programa que permita implementar, inserir e manipular os dados dos alunos de BCC
da primeira fase. Devem ser lidos e armazenados em dois arrays as matrículas e as idades de 20
alunos. O programa não deve permitir que as matrículas dos alunos sejam repetidas na digitação
(cada matrícula só aprece uma única vez).
Após a finalização da entrada dos dados dos funcionários, o programa deve apresentar o
seguinte menu:
1. MOSTRAR
2. ORDENAR CRESCENTE
3. INVERTER
4. PROCURAR MATRICULA
5. PROCURAR IDADE
6. MEDIA
7. MAIS JOVEM
8. ANIVERSARIO
9. REPETE
10. POPULAR
99. VAZAR
Se a opção 1 for selecionada, o programa mostra as matrículas e as idades de todos os
alunos, e reapresenta o menu. Se 2 for selecionada o programa ordena os dados dos
alunos por matrícula, em ordem crescente e reapresenta o menu. Se a opção 3 for
selecionada, o programa inverte os dados nos arrays, de forma que o último passe a ser
o primeiro, o penúltimo o segundo, e assim sucessivamente; e então e reapresenta o
menu. Se a opção 4 for selecionada, o programa pede um número de matrícula, diz se
este aluno existe ou não, e reapresenta o menu. Se a opção 5 for selecionada, o
programa pede um número de matrícula, diz a idade deste aluno, e reapresenta o menu.
Se a opção 6 for selecionada, o programa calcula e mostra a média de idade dos alunos.
Se a opção 7 for selecionada, o programa mostra a matrícula do aluno mais jovem do
BCC. Se opção 8 for selecionada, o programa pede a matrícula de um aluno e
incrementa sua idade (já que ele fez aniversário) e reapresenta o menu. Se a opção 9 for
selecionada, o programa diz se existem ou não idades repetidas no array
correspondente e reapresenta o menu. Se a opção 10 for selecionada o programa
solicita que todos os dados dos alunos sejam novamente digitados e os coloca nos arrays
(sobrepõe os dados anteriores). O programa não deve permitir que as matrículas dos
alunos sejam repetidas na digitação (cada matrícula só aprece uma única vez). A opção
99 encerra.
OBS.: Quanto aos arrays, o programa somente pode declarar dois: um para armazenar as
idades e outro para armazenar as matrículas. 
*/

public class AvaliativeWork3 {
	static int numOfStudents = 5;
	static int ageCount = 0;
	
	static int[] registrations = new int[numOfStudents];
	static int[] ages = new int[numOfStudents];
	
	static String input;
	
	public static void main(String[] args) {

		int option, id;

		populateArrays();
		
		do {
			input = JOptionPane.showInputDialog("1. MOSTRAR\r\n" + 
					"2. ORDENAR CRESCENTE\r\n" + 
					"3. INVERTER\r\n" + 
					"4. PROCURAR MATRICULA\r\n" + 
					"5. PROCURAR IDADE\r\n" + 
					"6. MEDIA\r\n" + 
					"7. MAIS JOVEM\r\n" + 
					"8. ANIVERSARIO\r\n" + 
					"9. REPETE\r\n" + 
					"10. POPULAR\r\n" + 
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
					for (int i = 0; i < registrations.length / 2; i++) {
						int r = registrations[i];
						int a = ages[i];
						registrations[i] = registrations[registrations.length - i - 1];
						registrations[registrations.length - i - 1] = r;
						
						ages[i] = ages[ages.length - i - 1];
						ages[ages.length - i - 1] = a;
					}
					break;
					
				case 4: 
					input = JOptionPane.showInputDialog("Informe um número de matrícula para verificar a sua existência: ");
					id = Integer.parseInt(input);
					
					if (checkRegistration(id, registrations)) {
						System.out.println("O estudante consta nos registros.");
					}
					else {
						System.out.println("O estudante não consta nos registros.");
					}
					break;
					
				case 5:
					input = JOptionPane.showInputDialog("Informe um número de matrícula para obter a idade do estudante: ");
					id = Integer.parseInt(input);
					int age = getAgeByRegistration(id, registrations, ages);
					if (age != 0) {
						System.out.println("O estudante " + id + " possui " + age + " anos de idade.");
					}
					else {
						System.out.println("Não foi possível encontrar essa matrícula!");
					}
					break;
					
				case 6:
					float average = ((float)ageCount/numOfStudents);
					System.out.println("A média de idade da turma de BCC é: " + average);
					break;
					
				case 7:
					int youngestStudentRegistration = getYoungestStudentRegistration(registrations, ages);
					if (youngestStudentRegistration != 0) {
						System.out.println("O estudante " + youngestStudentRegistration + " é o mais jovem da turma de BCC.");
					}
					else {
						System.out.println("Erro!");
					}
					break;
				
				case 8:
					input = JOptionPane.showInputDialog("Informe um número de matrícula para indicar o aniversáio do estudante: ");
					id = Integer.parseInt(input);
					
					boolean isValid = false;
					for (int i = 0; i < registrations.length; i++) {
						if (id == registrations[i]) {
							ages[i] += 1;
							isValid = true;
							System.out.println("O estudante " + registrations[i] + " agora possui " + ages[i] + " anos de idade.");
						}
					}
					if (!isValid) {
						System.out.println("Não foi possível encontrar o estudante.");
					}
					break;
				
				case 9: 
					boolean ageRepeated = false;
					for (int i = 0; i < ages.length; i++) {
							for (int j = 0; j < ages.length; j++) {
								if (ages[i] == ages[j] && i != j) {
									ageRepeated = true;
								}
							}
						}
					if (ageRepeated) {
						System.out.println("Há estudantes com a mesma idade na empresa.");
					}
					else {
						System.out.println("Não há estudantes com a mesma idade na empresa.");
					}
					break;
					
				case 10:
					for (int i = 0; i < registrations.length; i++) {
						registrations[i] = 0;
					}
					System.out.println("Favor inserir todos os dados novamente");
					populateArrays();
					
			
			}	
		} while(option != 99 || option <= 10);
	}
	
	private static void showData(int[] regsArr, int[] agesArr) {
		System.out.println("");
		for (int i = 0; i < regsArr.length; i++) {
			System.out.println((i+1) + ") Matrícula: " + regsArr[i] + " | Idade: " + agesArr[i]);
		}
	}
	
	private static boolean checkRegistration(int regId, int[] regArr) {
		boolean isRegistered = false;
		for (int i = 0; i < regArr.length; i++) {
			if (regId == regArr[i]) {
				isRegistered = true;
			}
		}
		return isRegistered;
	}
	
	private static int getAgeByRegistration(int regId, int[] regsArr, int[] agesArr) {
		int studentAge = 0;
		for (int i = 0; i < regsArr.length; i++) {
			if (regId == regsArr[i]) {
				studentAge = agesArr[i];
			}
		}
		return studentAge;
	}
	
	private static int getYoungestStudentRegistration(int[] regsArr, int[] agesArr) {
		int youngestAge = 999;
		int youngestStudentRegistration = 0;
		for (int i = 0; i < agesArr.length; i++) {
			if (agesArr[i] < youngestAge) {
				youngestAge = agesArr[i];
				youngestStudentRegistration = regsArr[i];
			}
		}
		return youngestStudentRegistration;
	}
	
	private static void populateArrays() {

		for (int i = 0; i < numOfStudents; i++) {
			boolean registrationIsValid = true;
			String input = JOptionPane.showInputDialog((i+1) + ") Informe a matrícula do aluno: ");
			int registration = Integer.parseInt(input);
			for (int j = 0; j < ages.length; j++) {
				if (registration == registrations[j]) {
					registrationIsValid = false;
				}
			}
			if (registrationIsValid) {
				registrations[i] = registration;
				input = JOptionPane.showInputDialog((i+1) + ") Informe a idade do aluno: ");
				ages[i] = Integer.parseInt(input);
				ageCount += ages[i];
			}
			else {
				i--;
				System.out.println("Matrícula já registrada, tente novamente!");
			}
		}
	}

}
