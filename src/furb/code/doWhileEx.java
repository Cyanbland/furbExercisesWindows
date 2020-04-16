package furb.code;

import javax.swing.JOptionPane;

public class doWhileEx {

	public static void main(String[] args) 
	 {/* Este programa serve para mostrar o funcionamento do comando
             do-while */
		
	    int numero,opcao,aux,giro,fatorial,ehPrimo;
	    String entra;
	    	   
	    do {entra = JOptionPane.showInputDialog("SISTEMA OPERACOES MATEMATICAS"+
                   				    "\n\n\t1. DOBRO\n\t2. QUADRADO"+
						    "\n\t3. TRIPLO\n\t4. CUBO\n\t5. VAZAR\n\n\tQUAL A OPERACAO VOCE QUER APRENDER ");
	        opcao  = Integer.parseInt(entra);
	        numero = 0;
	        if (opcao <= 4)
	       	     {entra = JOptionPane.showInputDialog("AGORA INFORME UM NUMERO");
	              numero = Integer.parseInt(entra);
	       	     } 
	       	switch (opcao)
	       		{case 1: aux = numero * 2;
	       				 System.out.println("DOBRO DE "+numero+" = "+aux);
	       				 break;
	       		 case 2: aux = numero * numero;
	       		         System.out.println("QUADRADO DE "+numero+" = "+aux);
	       		         break;
	       		 case 3: aux = numero * 3;
	       		 		 System.out.println("TRIPLO DE "+numero+" = "+aux);
	       		 		 break;
	       		 case 4: aux = numero * numero * numero;
	       		 		 System.out.println("CUBO DE "+numero+" = "+aux);
	       		}	 		 
	       } while (opcao != 5);		 		 
	   
	    System.out.println("OBRIGADO POR USAR O SISMIM - SISTEMA FEITO POR MIM  :-) ");
	 }
	}