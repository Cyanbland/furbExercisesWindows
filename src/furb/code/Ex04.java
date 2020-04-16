package furb.code;

import java.util.*;
import furb.code.Ex04Employee;

/*
	4) Uma empresa irá conceder aumento de salário aos seus 321 funcionários de
	acordo com a categoria de cada empregado. O aumento seguirá a seguinte
	regra:
	1. Funcionários das categorias A e C ganharão 2% de aumento sobre o salário;
	2. Funcionários das categorias B, D e E ganharão 3% de aumento sobre o salário;
	3. Funcionários das categorias F e G ganharão 5% de aumento sobre o salário;
	Elaborar um algoritmo que: 
	a) leia para cada funcionário: o seu número/código, a categoria e o salário atual; 
	b) calcule o novo salário e escreva para cada um, o número/código, o salário 
	atual e o novo salário; 
	c) forneça também o valor total dos salários atuais e o valor total dos novos salários
*/
public class Ex04 {
	static Scanner scanner = new Scanner(System.in);
	static List <Ex04Employee> totalList = new ArrayList<Ex04Employee>();
	static List <Ex04Employee> updatedList = new ArrayList<Ex04Employee>();
	static int numberOfEmployees = 3;
	static int id;
	static char category;
	static double salary;
	static double newSalary;
	static double baseSalaryTotal = 0;
	static double newSalaryTotal = 0;

	public static void main(String[] args) 
	{
		for (int i = 0; i < numberOfEmployees; i++)
		{
			id = i + 1;
			
			System.out.println("Informe a categoria do funcionário " + id + ": ");
			System.out.println("(A, B, C, D, E, F, G)");
			category = scanner.next().toCharArray()[0];
			
			System.out.println("Informe o salário do funcionário: ");
			salary = scanner.nextFloat();
			baseSalaryTotal += salary;
			
			totalList.add(new Ex04Employee(id, category, salary));
			newSalary = Ex04Employee.getSalaryRaise(totalList);
			newSalaryTotal += newSalary;
			updatedList.add(new Ex04Employee(id, category, newSalary));
			
			System.out.println("Id do usuário: " + id);
			System.out.println("Salário atual: " + salary);
			System.out.println("Novo salário: " + newSalary);
		}
		
		System.out.println("Valor total dos salários atuais: R$" + baseSalaryTotal);
		System.out.println("Valor total dos salários atualizados: R$" + newSalaryTotal);
		
		
	}
}
