package furb.code;

//V1) Sem For
//V2) Sem While
//Primos No intervalo de [1347...25368]

public class ExIntervalo02 
{
	public static void main(String[] args) 
	{
		int firstNum = 1347;
		int lastNum = 25368;
		int firstNumBkp = firstNum;
		int numOfPrimes = 0;
		
		for(int i = firstNum; i < lastNum; i++)
		{
			if (checkIfPrime(i))
			{
				numOfPrimes += 1;
			}
		}
		System.out.println("Números primos no intervalo[" + firstNumBkp + "; " + lastNum + "]: " + numOfPrimes);
	}
	
	private static boolean checkIfPrime(int number)
	{
		boolean isPrime = true;
		for (int aux = number - 1; aux > 1; aux--)
		{
			if ((number % aux) == 0)
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
