package furb.code;

import javax.swing.JOptionPane;

/*ESCREVA UM PROGRAMA QUE PERMITA LER E MANIPULAR UMA 
COLEÇÃO DE 10 NÚMEROS INTEIROS.

O PROGRAMA DEVE INICIALMENTE LER OS NÚMEROS INFORMADOS
PELO E USUÁRIO, GUARDÁ-LOS NUM VETOR, E:

1) MOSTRAR A COLEÇÃO NA ORDEM EM QUE FOI INFORMADA
2) ORDENAR A COLEÇÃO EM ORDEM CRESCENTE
3) MOSTRAR A COLEÇÃO NA NOVA ORDEM
4) INVERTER A COLEÇÃO, DE FORMA QUE O PRIMEIRO PASSE A SER O
   ÚLTIMO, O SEGUNDO O PENÚLTIMO E ASSIM SUCESSIVAMENTE
5) MOSTRAR A COLEÇÃO NA NOVA ORDEM
6) DIZER QUANTOS NÚMEROS PRIMOS EXISTEM NA COLEÇÃO
7) CALCULAR E MOSTRAR O FATORIAL DE CADA ELEMENTO DA COLEÇÃO.
*/

public class MethodsExercise {

	public static void main(String[] args) {
		int numOfInputs = 3;
		int numOfPrimes = 0;
		String input;
		int[] inputsArr = new int[numOfInputs];
		
		for (int i = 0; i < numOfInputs; i++) {
			input = JOptionPane.showInputDialog((i+1) + ") Informe o número: ");
			inputsArr[i] = Integer.parseInt(input);
		}
		
		System.out.println("1) MOSTRAR A COLEÇÃO NA ORDEM EM QUE FOI INFORMADA");
		printArray(inputsArr);
		
		System.out.println("2) ORDENAR A COLEÇÃO EM ORDEM CRESCENTE");
		int[] crescentArray = getCrescentArray(inputsArr);
		
		System.out.println("3) MOSTRAR A COLEÇÃO NA NOVA ORDEM");
		printArray(crescentArray);
		
		System.out.println("4) INVERTER A COLEÇÃO, DE FORMA QUE O PRIMEIRO PASSE A SER O ÚLTIMO, O SEGUNDO O PENÚLTIMO E ASSIM SUCESSIVAMENTE");
		int[] reverseArray = getInvertedArray(inputsArr);
		
		System.out.println("5) MOSTRAR A COLEÇÃO NA NOVA ORDEM");
		printArray(reverseArray);
		
		System.out.println("6) DIZER QUANTOS NÚMEROS PRIMOS EXISTEM NA COLEÇÃO");
		for (int i = 0; i < inputsArr.length; i++) {
			if (checkIfPrime(inputsArr[i])) {
				numOfPrimes++;
			}
		}
		System.out.println("A coleção contém " + numOfPrimes + " números primos");
		
		System.out.println("7) CALCULAR E MOSTRAR O FATORIAL DE CADA ELEMENTO DA COLEÇÃO");
		for (int i = 0; i < inputsArr.length; i++) {
			System.out.println("O fatorial de " + inputsArr[i] + " é " + getFatorial(inputsArr[i]));
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				System.out.println(arr[i] + "");
			}
			else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	private static int[] getCrescentArray(int[] arr) {
		for (int loop = 1; loop <= arr.length; loop++) {
			for (int i = 0; i < (arr.length - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					int aux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = aux;
				}
			}
		}
		return arr;
	}
	
	private static int[] getInvertedArray(int[] arr) {
		int[] invertedArray = new int[arr.length];
		int j = 0;
		for (int i = (arr.length - 1); i > -1; i--) {
			invertedArray[j] = arr[i];
			j++;
		}
		return invertedArray;
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
	
	private static int getFatorial(int num) {
		int fatorial = 1;
		while (num > 1) {
			fatorial *= num;
			num--;
		}
		return fatorial;
	}

}
