package furb.code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*Escreva um programa que leia sucessivamente n�meros inteiros positivos, at� que um n�mero
maior que 30 seja informado. Para cada n�mero inserido diga:
a) O seu fatorial
b) Se � primo/n�o primo
c) Se � par/�mpar
Antes de encerrar diga:
a) Qual a m�dia aritm�tica dos n�meros informados
b) Qual o maior n�mero informado
c) Quantos n�meros primos foram informados
d) Quantos n�meros �mpares foram informados
e) Qual foi o maior n�mero par informado
f) Quantos dos n�meros informados eram m�ltiplos de 5 e, destes, quantos eram
tamb�m m�ltiplos de 3
g) Quantas vezes o n�mero 22 foi informado
h) Se existiu ou n�o a repeti��o da digita��o do mesmo n�mero, na sequ�ncia. 
*/

public class AvaliativeWork1 {

	public static void main(String[] args) {
		String input;
		
		boolean numIsEven, numIsPrime;
		boolean numberRepeatedInARow = false;
		int inputValue, fatorial;
		int numberOfInputs = 0;
		int inputTotalValue = 0;
		int biggestNumber = 0;
		int biggestEven = 0;
		int numberOfPrimes = 0;
		int numberOfOdds = 0;
		int numberOfEvens = 0;
		int numberOfDivisibleByFive = 0;
		int numberOfDivisibleByFiveAndThree = 0;
		int numberOfTwentyTwos = 0;
		float totalAverage = 0;
		ArrayList<Integer> allInputValues = new ArrayList<Integer>();
		ArrayList<Integer> allEvenValues = new ArrayList<Integer>();
		ArrayList<Integer> allDivisibleByFive = new ArrayList<Integer>();
		ArrayList<Integer> allDivisibleByFiveAndThree = new ArrayList<Integer>();
		
		
		
		input = JOptionPane.showInputDialog("Informe um n�mero: ");
		inputValue = Integer.parseInt(input);
		
		while(inputValue <= 30){
			//Getting the fatorial
			fatorial = getFatorial(inputValue);
			System.out.println("O fatorial de " + inputValue + " � " + fatorial + ".");
			
			//Checking if number is prime
			numIsPrime = checkIfPrime(inputValue);
			if (numIsPrime) {
				System.out.println("O n�mero " + inputValue + " � primo.");
				numberOfPrimes += 1;
			}
			else {
				System.out.println("O n�mero " + inputValue + " n�o � primo.");
			}
			
			//Checking if number is Even
			numIsEven = checkIfEven(inputValue);
			if (numIsEven) {
				System.out.println("O n�mero " + inputValue + " � par.");
				allEvenValues.add(inputValue);
				numberOfEvens += 1;
			}
			else {
				System.out.println("O n�mero " + inputValue + " � �mpar.");
				numberOfOdds += 1;
			}
			
			//Checking if number is 22
			if (inputValue == 22) {
				numberOfTwentyTwos += 1;
			}
			
			numberOfInputs += 1;
			inputTotalValue += inputValue;
			allInputValues.add(inputValue);
			
			//Getting total average
			totalAverage = ((float)inputTotalValue / (numberOfInputs));
			
			//Getting the biggest number
			for (int i = 0; i < numberOfInputs; i++) {
				if (i > 0) {
					if (allInputValues.get(i) > allInputValues.get(i - 1)) {
						biggestNumber = allInputValues.get(i);
					}
					else {
						biggestNumber = allInputValues.get(i - 1);
					}
				}
				else {
					biggestNumber = allInputValues.get(0);
				}

				
			}
			//Getting the biggest even number
			for (int i = 0; i < allEvenValues.size(); i++) {
				if (i > 0) {
					if (allEvenValues.get(i) > allEvenValues.get(i - 1)) {
						biggestEven = allEvenValues.get(i);
					}
					else {
						biggestEven = allEvenValues.get(i - 1);
					}
				}
				else {
					biggestEven = allEvenValues.get(0);
				}
			}
			
			//Getting divisible by 5
			allDivisibleByFive = getDivisibleByFive(allInputValues);
			numberOfDivisibleByFive = allDivisibleByFive.size();
			
			//Getting divisible by both
			allDivisibleByFiveAndThree = getDivisibleByThree(allDivisibleByFive);
			numberOfDivisibleByFiveAndThree = allDivisibleByFiveAndThree.size();
			
			//Checking if same number is informed twice in a row
			for (int i = 0; i < numberOfInputs; i++) {
				if (i > 0) {
					if (allInputValues.get(i) == allInputValues.get(i - 1)) {
						numberRepeatedInARow = true;
					}
				}
			}
			System.out.println();
			
			
			input = JOptionPane.showInputDialog("Informe um n�mero: ");
			inputValue = Integer.parseInt(input);
		} 
		
		if (numberOfInputs > 0) {
			System.out.println("a) A m�dia aritm�tica dos n�meros validos informados � " + totalAverage + ".");
			System.out.println("b) O maior n�mero valido informado foi " + biggestNumber + ".");
			System.out.println("c) Foram informados " + numberOfPrimes + " n�meros primos.");
			System.out.println("d) Foram informados " + numberOfOdds + " n�meros �mpares.");
			
			if (numberOfEvens > 0) {
				System.out.println("e) O maior n�mero par informado foi " + biggestEven + ".");
			}
			
			System.out.println("f) Foram informados " + numberOfDivisibleByFive + " n�meros m�ltiplos de 5 e" +
			", destes, " + numberOfDivisibleByFiveAndThree + " s�o m�ltiplos de 3.");
			System.out.println("g) O n�mero 22 foi informado " + numberOfTwentyTwos + " vezes.");
			
			if (numberRepeatedInARow) {
				System.out.println("h) Com base nos n�meros informados, houve repeti��o da digita��o " + 
				"do mesmo n�mero, na sequ�ncia.");
			}
			else {
				System.out.println("h) Com base nos n�meros informados, n�o houve repeti��o da digita��o " + 
				"do mesmo n�mero, na sequ�ncia.");
			}
			

		}
		else {
			System.out.println("a) Dados insuficientes para calcular a m�dia.");
			System.out.println("b) Nenhum n�mero v�lido foi informado, portanto � imposs�vel " +
			"informar o maior valor.");
			System.out.println("c) Nenhum n�mero v�lido foi informado, portanto � imposs�vel " +
			"informar o n�mero de primos.");
			System.out.println("d) Nenhum n�mero v�lido foi informado, portanto � imposs�vel " +
			"informar o n�mero de �mpares.");
			System.out.println("e) Nenhum n�mero par foi informado.");
			System.out.println("f) Foram informados " + numberOfDivisibleByFive + " n�meros m�ltiplos de 5 e" +
			", destes, " + numberOfDivisibleByFiveAndThree + " s�o m�ltiplos de 3.");
			System.out.println("g) O n�mero 22 foi informado " + numberOfTwentyTwos + " vezes.");
			
			
		}

	}
	
	private static int getFatorial(int baseValue) {
		int fatorial = 1;
		
		while(baseValue > 1) {
			fatorial *= baseValue;
			baseValue--;
		}
		return fatorial;
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
		return isPrime;
		
	}
	
	private static boolean checkIfEven(int baseValue) {
		boolean isEven = false;
		if (baseValue % 2 == 0) {
			isEven = true;
		}
		
		return isEven;
	}
	
	private static ArrayList<Integer> getDivisibleByFive(ArrayList<Integer> values) {
		ArrayList<Integer> divisibleByFive = new ArrayList<Integer>();
		for (int num : values) {
			if (num % 5 == 0) {
				divisibleByFive.add(num);
			}
		}
		return divisibleByFive;
	}
	
	private static ArrayList<Integer> getDivisibleByThree(ArrayList<Integer> values) {
		ArrayList<Integer> divisibleByThree = new ArrayList<Integer>();
		for (int num : values) {
			if (num % 3 == 0) {
				divisibleByThree.add(num);
			}
		}
		return divisibleByThree;	
	}
}
