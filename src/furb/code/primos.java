package furb.code;

import java.util.Scanner;

public class primos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int inputInt = scanner.nextInt();
		scanner.close();
		
		if (isPrime(inputInt)) {
			System.out.println("É primo!");
		} else {
			System.out.println("Não é primo!");
		}
	}
	
	private static boolean isPrime(int number) {
		boolean prime = true;
		int aux = number - 1;
		while (aux > 1) {
			if ((number % aux) == 0) {
				prime = false;
				aux = 1;
				
			} else {
				aux = aux -1;
			}
		
		}
		return (prime);

	}
}