package furb.code;

import javax.swing.JOptionPane;

public class switchInputImproved {
	public static void main(String[] args) {
		String inputString;
		int number = 0;
		int loops = 5;
		int option;
		int result;
		
		for(int i = 0; i < loops; i++) 
		{
			inputString = JOptionPane.showInputDialog("SISTEMA OPERACOES MATEMATICAS"+
   				    "\n\n\t1. DOBRO\n\t2. QUADRADO"+
			    "\n\t3. TRIPLO\n\t4. CUBO\n\t5. FATORIAL\n\t6. PRIMO/NaoPrimo\n\t7. PAR/ÍMPAR" +
   				    "\n\n\tINFORME O NÚMERO DA OPERAÇÃO A SER APRENDIDA: ");
			option = Integer.parseInt(inputString);

			if(option < 8) {
				inputString = JOptionPane.showInputDialog("INFORME UM NÚMERO: ");
				number = Integer.parseInt(inputString);
			}
			
			switch(option) 
			{
			case 1: 
				result = getDouble(number);
				System.out.println("DOBRO DE "+ number + " = " + result);
				break;
			case 2: 
				result = getSquare(number);
				System.out.println("QUADRADO DE " + number + " = " + result);
				break;
			case 3: 
				result = getTriple(number);
				System.out.println("TRIPLO DE "+ number + " = " + result);
				break;
			case 4: 
				result = getCube(number);
				System.out.println("CUBO DE "+ number + " = " + result);
				break;
			case 5: 
				result = getFatorial(number);
				System.out.println("FATORIAL DE "+ number + " = " + result);
				break;
			case 6: 
				boolean isPrime = checkIfPrime(number);
				if (isPrime) {
					System.out.println("O NÚMERO " + number + " É PRIMO");
				}
				else {
					System.out.println("O NÚMERO " + number + " NÃO É PRIMO");
				}
				break;
			case 7: 
				boolean isEven = checkIfEven(number);
				if (isEven) {
					System.out.println("O NÚMERO " + number + " É PAR");
				}
				else {
					System.out.println("O NÚMERO " + number + " É ÍMPAR");
				}
				break;

			default: System.out.println("OPCAO INVALIDA"); 
			}
		}
		
		
	}
	
	private static int getDouble(int num) {
		return num * 2;
	}
	
	private static int getSquare(int num) {
		return num * num;
	}
	
	private static int getTriple(int num) {
		return num * 3;
	}
	

	private static int getCube(int num) {
		return num * num * num;
	}
	
	private static int getFatorial(int num) {
		int fatorial = 1;
		while (num > 1) {
			fatorial = fatorial * num;
			num -= 1;
		}
		return fatorial;
	}
	
	private static boolean checkIfEven (int num) {
		if (num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean checkIfPrime(int num)
	{
		boolean isPrime = true;
		for (int aux = num - 1; aux > 1; aux--)
		{
			if ((num % aux) == 0)
			{
				isPrime = false;
				aux = 1;
			}
			else
			{
				isPrime = true;
			}
		}
		return isPrime;
		
	}
}

