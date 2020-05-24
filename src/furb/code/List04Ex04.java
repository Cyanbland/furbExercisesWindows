package furb.code;

import javax.swing.JOptionPane;

/*4) Escreva um programa de permita receber, armazenar e tratar uma cole��o composta
de 20 n�meros inteiros. Os n�meros s�o informados pelo usu�rio e armazenados num
array unidimensional (vetor). Ap�s a carga dos n�meros, o programa deve dizer:
A) qual a m�dia aritm�tica dos n�meros informados;
B) quantos dos n�meros da cole��o s�o menores que a m�dia;
C) qual o somat�rio dos n�meros que ocupam as posi��es �mpares do array;
D) qual o somat�rio dos n�meros �mpares existentes na cole��o.
Antes de encerrar ordene a cole��o em ordem crescente e mostre-a ao usu�rio. Usar o
m�todo bolha para ordenamento. 
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
			input = JOptionPane.showInputDialog((i + 1) + ") Informe um n�mero:");
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
		
		System.out.println("A) qual a m�dia aritm�tica dos n�meros informados: " + average);
		System.out.println("B) quantos dos n�meros da cole��o s�o menores que a m�dia: " + numOfBelowAverage);
		System.out.println("C) qual o somat�rio dos n�meros que ocupam as posi��es �mpares do array: " + sumOfOddIndexes);
		System.out.println("D) qual o somat�rio dos n�meros �mpares existentes na cole��o: " + sumOfOdds);
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
