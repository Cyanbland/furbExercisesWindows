package furb.code;

//Teacher´s code

public class BubbleMethod 
  {public static void main(String[] args) 
	  {int colecao[],i,aux,voltas;
	   colecao = new int[10];
	   
	   for(i=0; i < 10; i++)
		   colecao[i] = 100 - i;
	   
	   System.out.print("VEJA A COLECAO ORGINAL: ");
	   for(i=0; i < 10; i++)
		   System.out.print(" "+colecao[i]);
	   
	   for(voltas=1; voltas <= 9; voltas++)
	       {for(i=0; i < 9; i++)
	           {if (colecao[i] > colecao[i+1])
	                {aux = colecao[i] ;
	                 colecao[i] = colecao[i+1];
	                 colecao[i+1]=aux;
	                }
	           }
	       }
	   
	   System.out.print("\nVEJA A COLECAO FINAL: ");
	   for(i=0; i < 10; i++)
		   System.out.print(" "+colecao[i]);
	 }
  }