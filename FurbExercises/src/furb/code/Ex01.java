package furb.code;

import java.util.*;
import furb.code.Ex01Person;
	/*
	1) Uma empresa decidiu fazer um levantamento em relação aos candidatos que
	se apresentaram para preenchimento de vagas no seu quadro de funcionários.
	Fazer um algoritmo que leia o conjunto de informações de cada candidato,
	contendo:
	- Idade(em anos)
	- Sexo (1=M / 2=F)
	- Experiência no serviço (1=S / 2=N).
	O algoritmo deve calcular:
	A) Quantidade de candidatos do sexo feminino,
	B) Quantidade de candidatos do sexo masculino,
	C) Idade media dos homens com experiência no serviço,
	D) Porcentagem dos homens com mais de 45 anos, em relação ao total de
	homens,
	E) Quantidade de mulheres com idade inferior a 35 anos e com experiência no
	serviço.
	OBS.: Existem 20 candidatos inscritos.
	 */
public class Ex01 {
	static Scanner scanner = new Scanner(System.in);
	static List <Ex01Person> totalList = new ArrayList<Ex01Person>();
	
	public static void main(String[] args) {
	
		for(int i = 0; i < 20; i++)
		{
			System.out.println("Informe a idade do usuário " + (i + 1) + ": ");
			int age = scanner.nextInt();
			System.out.println("Informe o sexo do usuário(M ou F): ");
			char gender = scanner.next().toCharArray()[0];
			System.out.println("Informe se o usuário possui experiência(S ou N): ");
			char exp = scanner.next().toCharArray()[0];
			boolean hasExperience = false;
			if (exp == "S".toCharArray()[0])
			{
				hasExperience = true;
			}
			
			totalList.add(new Ex01Person(age, gender, hasExperience));
			}
		
		List<Ex01Person> females = Ex01Person.getFemale(totalList);
		int numOfFem = females.size();
		System.out.println("Quantidade de candidatos do sexo feminino: " + numOfFem);
		
		List<Ex01Person> males = Ex01Person.getMale(totalList);

		
		int numOfMale = males.size();
		System.out.println("Quantidade de candidatos do sexo masculino: " + numOfMale);
		
		
		
		List<Ex01Person> experiencedMale = Ex01Person.getExperiencedMale(totalList);
		int totalMaleAge = getTotalAge(experiencedMale);
		
		int totalMaleAgeAverage = totalMaleAge/experiencedMale.size();
		System.out.println("Idade media dos homens com experiência no serviço: " + totalMaleAgeAverage);
		
		int malesOver45 = Ex01Person.getMaleOver45(males).size();
		float malesOver45Percentage = ((float)malesOver45/numOfMale) * 100;
		System.out.println("Porcentagem dos homens com mais de 45 anos, em relação ao total de homens: " + malesOver45Percentage);
		
		int experiencedFemalesUnder35 = Ex01Person.getExperiencedFemaleUnder35(females).size();
		System.out.println("Quantidade de mulheres com idade inferior a 35 anos e com experiência no serviço: " + experiencedFemalesUnder35);
		
	}
	private static int getTotalAge(List<Ex01Person> list)
	{
		int totalAge = 0;
		
		for (Ex01Person p : list)
		{
			totalAge += p.age;
		}
		return totalAge;
	}
}
