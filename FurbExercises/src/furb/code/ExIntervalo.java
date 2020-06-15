package furb.code;

//V1) Sem For
//V2) Sem While
//Primos No intervalo de [1347...25368]

public class ExIntervalo {
	public static void main(String[] args)
	{
		int firstNum = 1347;
		int firstNumBkp = firstNum;
		int lastNum = 25368;
		int numOfPrimes = 0;
		
		while(firstNum <= lastNum)
		{
			if (checkIfPrime(firstNum))
			{
				numOfPrimes += 1;
			}
			firstNum++;
		}
		System.out.println("Números primos no intervalo[" + firstNumBkp + "; " + lastNum + "]: " + numOfPrimes);
	}
	private static boolean checkIfPrime(int num)
	{
		int aux = num - 1;
		boolean isPrime = false;
		
		while (aux > 1)
		{
			if ((num % aux) == 0)
			{
				isPrime = false;
				aux = 1;
			}
			else
			{
				isPrime = true;
				aux--;
			}
		}
		return isPrime;
	}
}


