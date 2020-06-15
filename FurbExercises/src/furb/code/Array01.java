package furb.code;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.JOptionPane;

public class Array01 {
/*O usu�rio vai informar 10 n�meros inteiros 
 * qualquer para compor uma cole��o. Guarde os n�meros num vetor e:
    1) diga a m�dia dos n�meros informados; 
    2) Quantos n�meros da cole��o s�o maiores que a m�dia;
    3) Qual o somat�rio dos n�meros �mpares da cole��o; 
    4) qual o somat�rio dos n�meros que ocupam as posi��es �mpares do array/vetor
    5) mostre os n�meros da cole��o na ordem em que foi informada; 
    6) mostre os n�meros da cole��o na ordem inversa da qual foram informados.
*/

	
	static int numberOfInputs = 10;
	public static void main(String[] args) {
		String inputString;

		int inputsTotal = 0;
		int sumOfOdds = 0;
		int sumOfOddIndexes = 0;
		float average = 0;
		
		int[] inputs = new int[numberOfInputs];
		int[] reversedInputs = new int[numberOfInputs];
		int[] greaterValues = new int[numberOfInputs];
		
		for (int i = 0; i < numberOfInputs; i++) {
			inputString = JOptionPane.showInputDialog((i + 1) + ")Informe um n�mero inteiro: ");
			inputs[i] = Integer.parseInt(inputString);
			inputsTotal += inputs[i];
		}
		
		
		average = ((float)inputsTotal/numberOfInputs);
		greaterValues = getGreaterThanAverage(inputs, average);
		sumOfOdds = getSumOfOdds(inputs);
		sumOfOddIndexes = getSumOfOddIndexes(inputs);
		reversedInputs = reverseArray(inputs);
		
		System.out.println("1) diga a m�dia dos n�meros informados: " + average);
		System.out.println("2) Quantos n�meros da cole��o s�o maiores que a m�dia: " + greaterValues);
		System.out.println("3) Qual o somat�rio dos n�meros �mpares da cole��o: " + sumOfOdds);
		System.out.println("4) qual o somat�rio dos n�meros que ocupam as posi��es �mpares do array/vetor: "
				+ sumOfOddIndexes);
		System.out.println("5) mostre os n�meros da cole��o na ordem em que foi informada: ");
		printArray(inputs);
		System.out.println("6) mostre os n�meros da cole��o na ordem inversa da qual foram informados: ");
		printArray(reversedInputs);

	}
	
	private static int[] getGreaterThanAverage(int[] baseValues, float average) {
		int[] greaterValuesArray = new int[numberOfInputs];
		for (int i = 0; i < baseValues.length; i++) {
			for (int v : baseValues) {
				if (v > average) {
					greaterValuesArray[i] = v;
				}
			}
		}
		return greaterValuesArray;
	}
	
	private static int getSumOfOdds(int[] baseValues) {
		int sumOfOdds = 0;
		for (int v : baseValues){
			if (v % 2 == 1) {
				sumOfOdds += v;
			}
		}
		return sumOfOdds;
	}
	
	private static int getSumOfOddIndexes(int[] baseValues) {
		int sumOfOddIndexes = 0;
		for (int i = 0; i < baseValues.length; i++) {
			if (i % 2 == 1) {
				sumOfOddIndexes += baseValues[i];
			}
		}
		return sumOfOddIndexes;
	}

	private static int[] reverseArray(int[] baseValues) {
		int[] reversedArray = new int[baseValues.length];
		int j = 0;
		for (int i = baseValues.length - 1; i >= 1; i--) {
			reversedArray[j] = baseValues[i];
			j++;
		}
		return reversedArray;
	}

	private static void printArray(int[] baseValues) {
		for (int i = 0; i < baseValues.length; i++) {
			System.out.println("O valor no index " + i + " � " + baseValues[i]);
		}
	}

}
