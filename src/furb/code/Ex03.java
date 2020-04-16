package furb.code;

import java.util.*;
import furb.code.Ex03Driver;
	/*
	3) O Departamento de Trânsito do estado anotou dados de acidentes de trânsito
	no ultimo ano. Para cada um dos 20 motoristas envolvidos em acidentes, tem-
	se as seguintes informações:
	• Ano de nascimento;
	• Sexo (1=Masculino, 2=Feminino)
	Elaborar um algoritmo que :
	• Calcule e escreva a porcentagem de motoristas com menos de 21 anos;
	• Calcule e escreva o percentual de motoristas mulheres em relação ao total ;
	• Calcule e escreva quantos motoristas tem idade maior que 60 anos;
	• Determine e escreva quantas mulheres têm idade maior que 60 anos;
	 */
public class Ex03 {

static Scanner scanner = new Scanner(System.in);
static List <Ex03Driver> totalList = new ArrayList<Ex03Driver>();

public static void main(String[] args) {
	int totalDrivers = 20;
	short birthYear;
	char gender;
	
	for(int i = 0; i < totalDrivers; i++)
	{
		System.out.println("Informe o ano de nascimento do motorista " + (i+1) + " : ");
		birthYear = scanner.nextShort();
		System.out.println("Informe o sexo do motorista(M ou F): ");
		gender = scanner.next().toCharArray()[0];

		totalList.add(new Ex03Driver(birthYear, gender));
	}
	
	List <Ex03Driver> under21 = Ex03Driver.getUnder21(totalList);
	int numOfUnder21 = under21.size();
	System.out.println("Calcule e escreva a porcentagem de motoristas com menos de 21 anos: " + numOfUnder21);
	
	List <Ex03Driver> females = Ex03Driver.getFemales(totalList);
	int numOfFemales = females.size();
	float femalePercentage = ((float)numOfFemales/totalDrivers) * 100;
	System.out.println("Calcule e escreva o percentual de motoristas mulheres em relação ao total: " + femalePercentage);
	
	List <Ex03Driver> over60 = Ex03Driver.getOver60(totalList);
	int numOfOver60 = over60.size();
	System.out.println("Calcule e escreva quantos motoristas tem idade maior que 60 anos: " + numOfOver60);
	
	List <Ex03Driver> femalesOver60 = Ex03Driver.getOver60(females);
	int numOfFemalesOver60 = femalesOver60.size();
	System.out.println("Determine e escreva quantas mulheres têm idade maior que 60 anos: " + numOfFemalesOver60);
}
}
