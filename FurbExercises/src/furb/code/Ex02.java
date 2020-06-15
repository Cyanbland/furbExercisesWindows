package furb.code;

import java.util.*;
/*
2) Um cinema deseja saber a opinião dos espectadores sobre o filme que está
sendo exibido. Cada espectador, respondeu a um questionário, contendo sua
idade e sua opinião sobre o filme: (1)ótimo, (2)bom, (3)regular, (4)ruim,
(5)péssimo. Elaborar um algoritmo que, lendo estes dados, calcule e escreva:
- a quantidade de respostas Ótimo,
- a diferença de votos entre respostas Bom e Regular,
- a média de idade das pessoas que responderam ruim,
- a percentagem de respostas Péssimo
Obs: Foram ouvidos 20 clientes.
 */
public class Ex02 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] ages = new int[20];
		int ageTotal = 0;
		int greatReviews = 0;
		int goodReviews = 0;
		int regularReviews = 0;
		int badReviews = 0;
		int awfulReviews = 0;
		int ageTotalOfBadReviews = 0;
		int differenceBetweenGoodAndRegular;	
		double awfulPercentage;

		System.out.println("(1)ótimo, (2)bom, (3)regular, (4)ruim, (5)péssimo");
		for (int i = 0; i < 20; i++)
		{
			System.out.println("Qual a idade do usuário " + (i + 1) + ": ");
			int age = getAge();
			ages[i] = age;
			ageTotal += age;
			System.out.println("Informe a opinião sobre o filme(1-5): ");
			int reviewInput = getReview();
			switch(reviewInput)
			{
				case 1: 
					greatReviews += 1;
					break;
				case 2: 
					goodReviews += 1;
					break;
				case 3: 
					regularReviews += 1;
					break;
				case 4: 
					badReviews += 1;
					ageTotalOfBadReviews += age;
					break;
				case 5: 
					awfulReviews += 1;
					break;
			}
		}
		if (goodReviews > regularReviews)
		{
			differenceBetweenGoodAndRegular = goodReviews - regularReviews;
		}
		if (regularReviews > goodReviews)
		{
			differenceBetweenGoodAndRegular = regularReviews - goodReviews;
		}
		else
		{
			differenceBetweenGoodAndRegular = 0;
		}
		awfulPercentage = ((float)awfulReviews/20) * 100;
		
		System.out.println("A quantidade de respostas Ótimo: " + greatReviews);
		System.out.println("A diferença de votos entre respostas Bom e Regular: " + differenceBetweenGoodAndRegular);
		if (badReviews == 0) 
		{
			System.out.println("Não há média de idade de pessoas que respoderam ruim.");
		}
		else 
		{
			System.out.println("A média de idade das pessoas que responderam ruim: " + ageTotalOfBadReviews/badReviews);
		}
		System.out.println("A porcentagem de respostas Péssimo: " + awfulPercentage + "%.");
	}

	private static int getAge()
	{
		return scanner.nextInt();
	}

	private static int getReview()
	{
		int review = scanner.nextInt();

		if(review > 5 || review < 1) 
		{
			System.out.println("Erro no valor inserido");
			return 0;
		}
		else
		{
			return review;
		}
	}
}
