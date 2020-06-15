package furb.code;

import java.util.*;

public class Caesar2 {
	private static int encryptKey = 0;
	static int[] values;
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a palavra a ser encriptada: ");
		String myString = scanner.nextLine();
		System.out.println("Informe a chave: ");
		encryptKey = scanner.nextInt();
		scanner.close();


		char[] characters = getCharArray(myString);
		int[] valuesSrc = {};
		values = Arrays.copyOf(valuesSrc, valuesSrc.length + 1);

		values = getAlphaNum(characters);
		int[] encryptedArray = encryptArray(values, encryptKey);
		int[] rests = getRests(encryptedArray);
		char[] restsToChar = buildLettersArrayByIntArray(rests);
		String encryptedOutput = buildStringByLettersArray(restsToChar);

		System.out.println("A palavra " + myString + " encriptada pela chave " + encryptKey + " resulta: "	+ encryptedOutput);

		//a = 10; z = 35;
	}
	private static char[] getCharArray(String str)
	{
		return str.toCharArray();
	}
	private static int[] getRests(int[] arr)
	{
		int[] rests = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			int rest = 0;
			if(arr[i] > 35)
			{
				rest = (arr[i] % 35) - 1;
				rests[i] = rest + 10;

			}
			else
			{
				rests[i] = arr[i];
			}
		}
		return rests;
		}
		private static int convertLetterToId(char ch)
		{
			return Character.getNumericValue(ch);
		}

		private static int[] getAlphaNum(char[] arrayToConvert)
		{
			int[] newArray = new int[arrayToConvert.length];
			for (int i = 0; i < arrayToConvert.length; i++)
			{
				int charPos = getCharPos(arrayToConvert[i]);
				//Checa para não encriptar o Espaço " "
				if (charPos < 36) 
				{
					newArray[i] = charPos + 10;

				}
				else 
				{
					newArray[i] = 404;
					System.out.println("Retornou erro");
				}
			}
			return newArray;

		}

		private static boolean checkInputLength(int pos)
		{
			return pos < 26;
		}

		private static char[] getAlphabet()
		{
			return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		}
		private static int getCharPos(char letter)
		{
			char[] alphabetCharacters = getAlphabet();

			for (int i = 0; i < alphabetCharacters.length; i++)
			{
				letter = Character.toUpperCase(letter);
				if (alphabetCharacters[i] == letter)
				{
					return i;
				}
			}
			return 355;
		}

		private static char getChar(int number)
		{
			char[] alphabetCharacters = getAlphabet();
			for(char c : alphabetCharacters)
			{
				c = Character.toUpperCase(c);
			}
			for (int i = 0; i < alphabetCharacters.length; i++)
			{
				if (i == number - 10) 
				{
					return alphabetCharacters[i];
				}
			}
			return ".".toCharArray()[0];
		}

		private static int[] encryptArray(int[] arr, int key)
		{
			int[] arrayFinished = new int[arr.length];
			int newKey = getNewKey(key);
			for(int i = 0; i < arr.length; i++)
			{
				if (arr[i] < 36)
				{
					arrayFinished[i] = arr[i] + newKey;
				}
				else
				{
					arrayFinished[i] = 404;
				}
			}
			return arrayFinished;
		}

		private static char[] buildLettersArrayByIntArray(int[] arr)
		{
			char[] finalCharArray = new char[arr.length];		
			for (int i = 0; i < arr.length; i++)
			{
				char c = getChar(arr[i]);
				if (c != "#".toCharArray()[0] || c != "".toCharArray()[0]) 
				{
					finalCharArray[i] = c;
			
				}
			}
			return finalCharArray;
		}
		private static String buildStringByLettersArray(char[] charArray)
		{
			String str = String.valueOf(charArray);
			str = str.replace(".", "#");
			char[] stringArray = str.toCharArray();
			char[] newArray = new char[stringArray.length]; 
			int index = 0;
			for (char c : stringArray) 
			{
				c = Character.toLowerCase(c);
				newArray[index] = c;
				index++;
			}
			String finalStr = String.valueOf(newArray);
			return finalStr;
		}
		private static int getNewKey(int k)
		{
			if (k > 25) 
			{
				int key = k % 26;
				return key;
			}
			else {
				return k;
			}
		}

	}
