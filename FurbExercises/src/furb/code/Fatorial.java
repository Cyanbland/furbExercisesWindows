package furb.code;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {	
		String choice = null;
		Scanner scanner;
		do {
			int inputInt, fatorial, value;
			scanner = new Scanner(System.in);
			System.out.println("Informe um número: ");
			inputInt = scanner.nextInt();
			fatorial = 1;
			value = inputInt;
			try {
				if (inputInt <= 33) {
					while (inputInt > 1) {
						fatorial = fatorial * inputInt;
						inputInt -= 1;
						
					}
					System.out.println("O fatorial de " + value + " é " + fatorial);
					System.out.println("Você deseja calcular outro número?");
					choice = scanner.next();
					
					
				}
				else {
					System.out.println("Valor não calculável!");
					System.out.println("Você deseja calcular outro número?");
					choice = scanner.next();
					
				}
			} catch(Exception e) {
				System.out.println("Erro no dado informado");
				System.out.println("Você deseja calcular outro número?");
				choice = scanner.next();
			
			}
		}
		while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Sim") || choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("S"));
		scanner.close();
	}
}




