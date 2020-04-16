package furb.code;
//
//public class ForFatorial {
//	public static void main(String[] args) {
//		int aux;
//		int fatorial = 1;
//		
//		for (int i = 1; i <= 10; i++)
//		{
//			aux = i;
//			fatorial *= aux;
//			aux -= 1;
//			System.out.println("O fatorial de " + i + " é: " + fatorial);
//		}
//	
//	}
//}

//public class ForFatorial
//{
//	public static void main(String[] args)
//    {int numero,fatorial,aux;
//     for(numero=0; numero <= 10; numero=numero+1)
//          {fatorial = 1;
//           for(aux=numero; aux >1; aux=aux-1)
//           {
//        	   fatorial = fatorial * aux;
//           }
//           System.out.println("FATORIAL DE " + numero + " = " + fatorial);
//          }
//       }
//}

//Remover o For
public class ForFatorial
{
	public static void main(String[] args) 
	{
		int numero = 0;
		int aux;
		int fatorial;
		
		while (numero <= 10)
		{
			fatorial = 1;
			aux = numero;

			while (aux > 1)
			{
				fatorial *= aux;
				aux--;
			}
			System.out.println("O fatorial de " + numero + " = " + fatorial);
			numero++;
		}
	}
}

