package furb.code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AvaliativeTest1 {

	public static void main(String[] args) {
		String input;
		
		int numberOfInputs = 100;
		int inputValue;
		int numberOfPrimes = 0;
		int biggestPrime = 0;
		int lowerValue = 0;
		int lowerValueFatorial = 0;
		int divisibleByThreeTotal = 0;
		int divisibleByThreeAndEvenTotal = 0;
		
		ArrayList<Integer> inputsArray = new ArrayList<Integer>();
		ArrayList<Integer> divisibleByThreeArray = new ArrayList<Integer>();
		ArrayList<Integer> divisibleByThreeAndEvenArray = new ArrayList<Integer>();

		
		boolean numberRepeatedInARow = false;
		
		
		for (int i = 0; i < numberOfInputs; i++) {
			input = JOptionPane.showInputDialog((i + 1) + ".Informe o número desejado:");
			inputValue = Integer.parseInt(input);
			inputsArray.add(inputValue);
			
			//Checking if number is prime 
			if (checkIfPrime(inputValue)) {
				numberOfPrimes += 1;
				if (inputValue > biggestPrime) {
					biggestPrime = inputValue;
				}
			}
		}
		
		//Divisible by 3 and, from these, get even numbers
		divisibleByThreeArray = getDivisibleByThree(inputsArray);
		divisibleByThreeTotal = divisibleByThreeArray.size();
		
		divisibleByThreeAndEvenArray = getEvenNumbers(divisibleByThreeArray);
		divisibleByThreeAndEvenTotal = divisibleByThreeAndEvenArray.size();
		
		//Getting the lower value fatorial
		for (int i = 0; i < inputsArray.size(); i++) {
			if (i > 0) {
				if (inputsArray.get(i) < lowerValue) {
					lowerValue = inputsArray.get(i);
				}
			}
			else {
				lowerValue = inputsArray.get(0);
			}
		}
		lowerValueFatorial = getFatorial(lowerValue);
		
		//Checking if user repeated input value in a row
		for (int i = 0; i < inputsArray.size(); i++) {
			if(i > 0) {
				if (inputsArray.get(i) == inputsArray.get(i - 1)) {
					numberRepeatedInARow = true;
				}
			}
		}
		
		
		System.out.println("Foram informados " + numberOfPrimes + " números primos.");
		if (biggestPrime == 0) {
			System.out.println("Não foram informados números primos.");
		}
		else {
			System.out.println("O maior número primo informado foi: " + biggestPrime + ".");
		}
			
		System.out.println("Foram informados " + divisibleByThreeTotal + " números múltiplos de 3" + 
		" e, destes, " + divisibleByThreeAndEvenTotal + " são pares.");
		System.out.println("O menor número informado foi " + lowerValue + " e este possui fatorial " +
		lowerValueFatorial + ".");
		
		if (numberRepeatedInARow) {
			System.out.println("Houve repetição de números na sequência.");
		}
		else {
			System.out.println("Não houve repetição de números na sequência.");
		}
		

	}
	
	private static boolean checkIfPrime(int baseValue) {
		boolean isPrime = true;
		int aux = baseValue - 1;
		
		while(aux > 1) {
			if (baseValue % aux == 0) {
				isPrime = false;
				aux = 0;
			}
			else {
				aux--;
			}
			
		}
		if (baseValue < 2) {
			isPrime = false;
		}
		return isPrime;
		
	}
	
	private static ArrayList<Integer> getDivisibleByThree(ArrayList<Integer> baseValues) {
		ArrayList<Integer> divisibleByThree = new ArrayList<Integer>();
		for (int num : baseValues) {
			if (num % 3 == 0 && num != 0) {
				divisibleByThree.add(num);
			}
		}
		return divisibleByThree;	
	}
	
	private static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> baseValues) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (int num : baseValues) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			}
		}
		
		return evenNumbers;
	}
	
	private static int getFatorial(int baseValue) {
		int fatorial = 1;
		
		while(baseValue > 1) {
			fatorial *= baseValue;
			baseValue--;
		}
		return fatorial;
	}

}
