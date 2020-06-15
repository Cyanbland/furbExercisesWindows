/* V1
package furb.code;

import javax.swing.JOptionPane;

public class MethodsExercise01 {

	public static void main(String[] args) {
		String input;
		int numOfUsers = 4;
		int primeSum = 0;
		int divisibleByFiveSum = 0;
		int[] inputsArr = new int[numOfUsers];

		
		for (int i = 0; i < numOfUsers; i++) {
			input = JOptionPane.showInputDialog((i+1) + ") Informe o número: ");
			inputsArr[i] = Integer.parseInt(input);
			if (checkIfPrime(inputsArr[i])) {
				primeSum += inputsArr[i];
			}
			else if (checkIfDivisibleByFive(inputsArr[i])) {
				divisibleByFiveSum += inputsArr[i];
			}
		}
		
		System.out.println("A) O SOMATÓRIO DOS NÚMEROS PRIMOS: " + primeSum);
		System.out.println("B) O SOMATÓRIO DOS MÚLTIPLOS DE 5: " + divisibleByFiveSum);
		

	}
	
	private static boolean checkIfPrime(int num) {
		int aux = num - 1;
		boolean isPrime = true;
		
		while (aux > 1) {
			if (num % aux == 0) {
				isPrime = false;
				aux = 0;
			}
			else {
				aux--;
			}
		}
		if (num < 2) {
			isPrime = false;
		}
		return isPrime;
	}
	
	private static boolean checkIfDivisibleByFive(int num) {
		if (num % 5 == 0) {
			return true;
		}
		return false;
	}

}
*/ 
//V2
package furb.code;

import javax.swing.JOptionPane;

public class MethodsExercise01 {

	public static void main(String[] args) {
		String input;
		int numOfUsers = 4;
		int primesSum = 0;
		int divisibleByFiveSum = 0;
		int[] inputsArr = new int[numOfUsers];

		
		for (int i = 0; i < numOfUsers; i++) {
			input = JOptionPane.showInputDialog((i+1) + ") Informe o número: ");
			inputsArr[i] = Integer.parseInt(input);
		}
		
		primesSum = getPrimesSum(inputsArr);
		divisibleByFiveSum = getDivisibleByFiveSum(inputsArr);
		
		System.out.println("A) O SOMATÓRIO DOS NÚMEROS PRIMOS: " + primesSum);
		System.out.println("B) O SOMATÓRIO DOS MÚLTIPLOS DE 5: " + divisibleByFiveSum);
		

	}
	
	private static int getPrimesSum(int[] arr) {
		int primesSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int aux = arr[i] - 1;
			boolean isPrime = true;
			
			while (aux > 1) {
				if (arr[i] % aux == 0) {
					isPrime = false;
					aux = 0;
				}
				else {
					aux--;
				}
			}
			
			if (arr[i] < 2) {
				isPrime = false;
			}
			
			if (isPrime) {
				primesSum += arr[i];
			}
		}
		return primesSum;
	}
		
	
	private static int getDivisibleByFiveSum(int[] arr) {
		int divisibleByFiveSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				divisibleByFiveSum += arr[i];
			}
		}
		return divisibleByFiveSum;

	}

}

