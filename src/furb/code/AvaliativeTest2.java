package furb.code;

import javax.swing.JOptionPane;

/*
 * A FURB pretende fazer um estudo sobre a origem dos alunos do curso de BCC. Para tanto, 10 alunos foram ouvidos e para cada um deles perguntou-se o seu n�mero de matr�cula, 
 * seu ano de nascimento e o seu estado de origem. Considerando que foi usada uma codifica��o para o estado de origem 
 * (um n�mero inteiro para cada estado: 1 = SC, 2 = PR, 3 = RS, ...27 = TO), escreva um programa que leia estas informa��es e diga:

a)      Qual a idade m�dia dos alunos do BCC ? (1 ponto) ;

b)      Mostre o n�mero de matr�cula e o ano de nascimento daqueles alunos que s�o mais jovens do que a m�dia de idade dos alunos pesquisados (2 pontos);

c)      Qual a matr�cula, a idade e o estado de origem do aluno mais velho? (1 ponto)

d)      Entre os entrevistados, havia alunos origin�rios de um mesmo estado (origem repetida)?  (3 pontos)

Antes de encerrar, apresente uma listagem com a matr�cula e a idade de todos os alunos por ordem crescente de idade (3 pontos). 
 */


public class AvaliativeTest2 {
	
	static int numOfInputs = 10;
	public static void main(String[] args) {
		int[] registrations = new int[numOfInputs];
		int[] birthYears = new int[numOfInputs];
		int[] ages = new int[numOfInputs];
		int[] originStates = new int[numOfInputs];
		
		int currentYear = 2020;
		float averageAge;
		
		String input;
		
		for (int i = 0; i < numOfInputs; i++) {
			input = JOptionPane.showInputDialog((i + 1) + ") Informe a matr�cula do aluno: ");
			registrations[i] = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog((i + 1) + ") Informe o ano de nascimento do aluno: ");
			birthYears[i] = Integer.parseInt(input);
			ages[i] = currentYear - birthYears[i];
			
			input = JOptionPane.showInputDialog((i + 1) + ") Informe o ID do estado de origem do aluno (1 = SC, 2 = PR, 3 = RS, ...27 = TO): ");
			originStates[i] = Integer.parseInt(input);		
		}
		
		averageAge = getAverageAge(ages);
		System.out.println("\na) Idade m�dia dos alunos do BCC: " + averageAge + " anos de idade.");

		System.out.println("\nb) Mostre o n�mero de matr�cula e o ano de nascimento daqueles alunos que s�o mais jovens do que a m�dia de idade dos alunos pesquisados");
		printDataFromStudentsUnderAgeAverage(averageAge, registrations, birthYears, ages);
		
		System.out.println("\nc) Qual a matr�cula, a idade e o estado de origem do aluno mais velho?");
		printDataFromOldestStudent(registrations, ages, originStates);
		
		System.out.println("\nd) Entre os entrevistados, havia alunos origin�rios de um mesmo estado (origem repetida)?");
		if (checkIfStatesRepeated(originStates)) {
			System.out.println("Sim, havia alunos origin�rios de um mesmo estado.");
		}
		else {
			System.out.println("N�o, todos os alunos s�o origin�rios de estados diferentes.");
		}
		
		System.out.println("\nOrganizando os alunos em ordem crescente de idade: ");
		printDataBasedOnCrescentAge(registrations, ages);
		

	}
	
	private static float getAverageAge(int[] agesArr) {
		float average;
		int ageTotal = 0;
		for (int i = 0; i < agesArr.length; i++) {
			ageTotal += agesArr[i];
		}
		average = ((float)ageTotal / agesArr.length);
		return average;
	}
	
	private static void printDataFromStudentsUnderAgeAverage(float average, int[] regsArr, int[] birthYearsArr, int[] agesArr) {
		System.out.println("Rela��o de alunos com idade menor que a m�dia:");
		for (int i = 0; i < regsArr.length; i++) {
			if (agesArr[i] < average) {
				System.out.println("Matr�cula: " + regsArr[i] + " | Ano de nascimento: " + birthYearsArr[i] + ".");
			}
		}
	}
	
	private static void printDataFromOldestStudent(int[] regsArr, int[] agesArr, int[] originStatesArr) {
		int oldestAge = 0;
		int oldestStudentIndex = 0;
		for (int i = 0; i < agesArr.length; i++) {
			if (agesArr[i] > oldestAge) {
				oldestAge = agesArr[i];
				oldestStudentIndex = i;
			}
		}
		
		for (int i = 0; i < agesArr.length; i++) {
			if (i == oldestStudentIndex) {
				System.out.println("Matr�cula: " + regsArr[i] + " | Idade: " + agesArr[i] + " | ID do estado de origem: " + originStatesArr[i] + ".");
			}
		}
	}
	
	private static boolean checkIfStatesRepeated(int[] originStatesArr) {
		boolean repeatedState = false;
		for (int i = 0; i < originStatesArr.length; i++) {
			for (int j = 0; j < originStatesArr.length; j++) {
				if (originStatesArr[i] == originStatesArr[j] && i != j) {
					repeatedState = true;
				}
			}
		}
		return repeatedState;
	}
	
	private static void printDataBasedOnCrescentAge(int[] regsArr, int[] agesArr) {
		//Ordering registration and age arrays to be crescent
		for (int loop = 1; loop <= agesArr.length; loop++) {
			for (int i = 0; i < (agesArr.length - 1); i++) {
				if (agesArr[i] > agesArr[i + 1]) {
					int aux = agesArr[i];
					agesArr[i] = agesArr[i + 1];
					agesArr[i + 1] = aux;
					
					int regsAux = regsArr[i];
					regsArr[i] = regsArr[i + 1];
					regsArr[i + 1] = regsAux;
				}
			}
		}

		//Printing data
		for (int i = 0; i < agesArr.length; i++) {
			System.out.println((i + 1) + ") Matr�cula: " + regsArr[i] + " | Idade: " + agesArr[i] + " anos.");
		}
	}
}
