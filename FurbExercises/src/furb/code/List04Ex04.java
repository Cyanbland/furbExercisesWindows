package furb.code;

import javax.swing.JOptionPane;

/*4) Escreva um programa de permita receber, armazenar e tratar uma coleção composta
de 20 números inteiros. Os números são informados pelo usuário e armazenados num
array unidimensional (vetor). Após a carga dos números, o programa deve dizer:
A) qual a média aritmética dos números informados;
B) quantos dos números da coleção são menores que a média;
C) qual o somatório dos números que ocupam as posições ímpares do array;
D) qual o somatório dos números ímpares existentes na coleção.
Antes de encerrar ordene a coleção em ordem crescente e mostre-a ao usuário. Usar o
método bolha para ordenamento. 
*/


public class List04Ex04 {
	public static void main(String[] args) {
		String input;
		
		int numOfInputs = 10;
		int inputsTotal = 0;
		int numOfBelowAverage = 0;
		int sumOfOddIndexes = 0;
		int sumOfOdds = 0;
		
		float average;
		
		int[] inputsArray = new int[numOfInputs];
		int[] sortedArray = new int[numOfInputs];
		
		for (int i = 0; i < numOfInputs; i++) {
			input = JOptionPane.showInputDialog((i + 1) + ") Informe um número:");
			inputsArray[i] = Integer.parseInt(input);
			inputsTotal += inputsArray[i];
		}
		
		average = ((float)inputsTotal / numOfInputs);
		
		for (int n : inputsArray) {
			if (n < average) {
				numOfBelowAverage++;
			}
			else if (n % 2 == 1) {
				sumOfOddIndexes += n;
			}
		}
		
		for (int i = 1; i < inputsArray.length; i += 2) {
			sumOfOdds += inputsArray[i];
		}
		
		sortedArray = bubbleSort(inputsArray);
		
		System.out.println("A) qual a média aritmética dos números informados: " + average);
		System.out.println("B) quantos dos números da coleção são menores que a média: " + numOfBelowAverage);
		System.out.println("C) qual o somatório dos números que ocupam as posições ímpares do array: " + sumOfOddIndexes);
		System.out.println("D) qual o somatório dos números ímpares existentes na coleção: " + sumOfOdds);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(" "+ sortedArray[i]);
		}
		
	}
	
	private static int[] bubbleSort(int[] baseValues) {
		for (int loop = 1; loop < baseValues.length; loop++) {
			for (int i = 0; i < (baseValues.length - 1); i++) {
				if (baseValues[i] > baseValues[i + 1]) {
					int aux = baseValues[i];
					baseValues[i] = baseValues[i + 1];
					baseValues[i + 1] = aux;
				}
			}
		}
		return baseValues;
		

	}
}
