package furb.code;

import javax.swing.JOptionPane;

public class Ex03Professor 
  {public static void main(String[] args) 
	  {int acidente,anoNasc,idade,sexo,menor21,mulher,qtidadeM60,qtidadeM60Mulher,percentual;
	   String entra;
	   menor21 = 0;
	   mulher = 0;
	   qtidadeM60=0;
	   qtidadeM60Mulher = 0;
	   for(acidente=1; acidente <= 10; acidente=acidente + 1)
	        {entra = JOptionPane.showInputDialog("INFORME O ANO DE NASCIMENTO DO ACIDENTE "+acidente);
	         anoNasc = Integer.parseInt(entra);
	         idade = 2020 - anoNasc;
	         entra = JOptionPane.showInputDialog("INFORME O SEXO DO MOTORISTA (1=H  2=M) ");
		     sexo = Integer.parseInt(entra);
		     if (idade < 21)
		        {menor21 = menor21 + 1;
		        }
		     if (sexo == 2)
		        {mulher = mulher + 1;
		        }
		     if (idade > 60)
		        {qtidadeM60 = qtidadeM60 + 1;
		         if (sexo == 2)
		             {qtidadeM60Mulher = qtidadeM60Mulher + 1;
		             }
		        }
	        }
	   percentual = menor21 * 100 / 10;
	   System.out.println("PERCENTUAL DE MOTORISTAS C/ MENOS DE 21 = " + percentual + " %");
	   percentual = mulher * 100 / 10;
	   System.out.println("PERCENTUAL DE MOTORISTAS MULHERES = " + percentual + " %");
	   System.out.println("QTIDADE DE MOTORISTAS C/ MAIS DE 60 = " + qtidadeM60);
	   System.out.println("QTIDADE DE MOTORISTAS MULHER C/ MAIS DE 60 = " + qtidadeM60Mulher);
	}
  }