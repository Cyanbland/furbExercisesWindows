package furb.code;

import javax.swing.JOptionPane;

/*2) Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus
clientes. Trinta deles foram ouvidos e para cada perguntou-se:
a) Sexo (1=feminino 2=masculino)
b) Uma nota para a casa (vai de zero até dez);
c) A idade;

O programa deve ler estas informações e dizer;
a) Qual a nota média recebida pelo cinema;
b) Qual a nota média atribuída pelos homens;
c) Qual a nota atribuída pela mulher mais jovem;
d) Quantas das mulheres com mais de 50 anos deram nota superior a média.
*/


public class List04Ex02 {
	public static void main(String[] args) {
		String input;
		
		int numberOfInputs = 3;
		int femalesOver50WithGradeOverAverage = 0;
		int lowerFemaleAgeIndex;
		int lowerFemaleGrade;


		float gradeAverage, maleGradeAverage;
		
		int[] clientsSex = new int[numberOfInputs];
		int[] grades = new int[numberOfInputs];
		int[] ages = new int[numberOfInputs];
		int[] maleIndex = new int[numberOfInputs];
		int[] femaleIndex = new int[numberOfInputs];
		int[] maleGrades = new int[numberOfInputs];
		int[] femaleGrades = new int[numberOfInputs];
		int[] femaleAges = new int[numberOfInputs];
		int[] femalesOver50Index = new int[numberOfInputs];
		
		
		
		for (int i = 0; i < numberOfInputs; i++) {
			input = JOptionPane.showInputDialog("Informe o sexo do cliente: (1=feminino 2=masculino)");
			clientsSex[i] = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog("Informe uma nota para a casa: (0-10)");
			grades[i] = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog("Informe a idade do cliente: ");
			ages[i] = Integer.parseInt(input);
			
		}
		gradeAverage = getAverage(grades);
		System.out.println("a) Qual a nota média recebida pelo cinema: " + gradeAverage);
		
		maleIndex = getMaleIndex(clientsSex);
		for (int i = 0; i < maleIndex.length; i++) {
			if (maleIndex[i] == 2) {
				maleGrades[i] = grades[i];
			}
		}
		maleGradeAverage = getMaleGradeAverage(maleGrades);
		System.out.println("b) Qual a nota média atribuída pelos homens: " + maleGradeAverage);
		
		femaleIndex = getFemaleIndex(clientsSex);
		for (int i = 0; i < femaleIndex.length; i++) {
			if (femaleIndex[i] == 1) {
				femaleGrades[i] = grades[i];
				femaleAges[i] = ages[i];
			}
		}
		lowerFemaleAgeIndex = getLowerAgeIndex(femaleAges);
		lowerFemaleGrade = grades[lowerFemaleAgeIndex];
		System.out.println("c) Qual a nota atribuída pela mulher mais jovem: " + lowerFemaleGrade);
		
		femalesOver50Index = getFemalesOverFiftyIndex(ages);
		for (int i = 0; i < femalesOver50Index.length; i++) {
			//50 is the index that tells it´s a female over 50
			if (femalesOver50Index[i] == 50) {
				if (femaleGrades[i] > gradeAverage) {
					femalesOver50WithGradeOverAverage += 1;
				}
			}
		}
		System.out.println("d) Quantas das mulheres com mais de 50 anos deram nota superior a média: "
				+ femalesOver50WithGradeOverAverage);
		
		
	}
	
	private static float getAverage(int[] baseValues) {
		int total = 0;
		float average;
		for (int v : baseValues) {
			total += v;
		}
		average = ((float) total / baseValues.length);
		return average;
	}
	
	private static float getMaleGradeAverage(int[] baseValues) {
		int total = 0;
		int validMaleInputs = 0;
		float average;
		for (int v : baseValues) {
			if (v != 0) {
				total += v;
				validMaleInputs += 1;
			}
		}
		average = ((float) total / validMaleInputs);
		return average;
	}
	
	private static int[] getMaleIndex(int[] baseValues) {
		int[] maleIndex = new int[baseValues.length];
		
		for (int i = 0; i < baseValues.length; i++) {
			if (baseValues[i] == 2) {
				maleIndex[i] = 2;
			}
		}
		return maleIndex;
	}
	
	private static int[] getFemaleIndex(int[] baseValues) {
		int[] femaleIndex = new int[baseValues.length];
		
		for (int i = 0; i < baseValues.length; i++) {
			if (baseValues[i] == 1) {
				femaleIndex[i] = 1;
			}
		}
		return femaleIndex;
	}
	
	private static int getLowerAgeIndex(int[] baseValues) {
		int lowerValue = 999;
		int lowerValueIndex = 0;
		
		for (int i = 0; i < baseValues.length; i++) {
			if (baseValues[i] < lowerValue) {
				lowerValue = baseValues[i];
				lowerValueIndex = i;
			}
		}
		return lowerValueIndex;
	}
	
	private static int[] getFemalesOverFiftyIndex(int[] baseValues) {
		int[] femalesOverFiftyIndex = new int[baseValues.length];
		
		for (int i = 0; i < baseValues.length; i++) {
			if (baseValues[i] > 50) {
				femalesOverFiftyIndex[i] = 50;
			}
		}
		return femalesOverFiftyIndex;
	}
}


