package furb.code;

import javax.swing.JOptionPane;

public class List03Ex03Professor 
  {public static void main(String[] args)
	  {int numSala,prof,larg,area,somArea,areaMedia,qtdSalas,numMaior,areaMaior;
	   String entra;
	   qtdSalas = 0;
	   areaMaior = -1;
	   numMaior = 0;
	   somArea = 0;
	   entra = JOptionPane.showInputDialog("INFORME O NUMERO DA PRIMEIRA SALA");
	   numSala = Integer.parseInt(entra);
	   while (numSala != 0)
	      {qtdSalas = qtdSalas + 1;
	       do {entra = JOptionPane.showInputDialog("INFORME A LARGURA DA SALA "+numSala);
	           larg = Integer.parseInt(entra);
	          } while (larg <= 0);
 	       do {entra = JOptionPane.showInputDialog("INFORME A PROFUNDIDADE DA SALA "+numSala);
 		   prof = Integer.parseInt(entra);
 		   } while (prof <=0);
		area = larg * prof;
		System.out.println("AREA DA SALA "+numSala+" = "+area);
		somArea = somArea + area;
		if (area > areaMaior)
		       {areaMaior = area;
		        numMaior = numSala;
		       }
		entra = JOptionPane.showInputDialog("INFORME O NUMERO DA SALA "+(qtdSalas+1));
		numSala = Integer.parseInt(entra);
	      }
	  if (qtdSalas > 0)
		   {areaMedia = somArea / qtdSalas;
		    System.out.println("AREA MEDIA = "+areaMedia);
		    System.out.print("MAIOR SALA EH A "+numMaior);
		    System.out.println("  ELA TEM AREA = "+areaMaior);
		   }
	  else
		   {System.out.println("PESQUISA NAO REALIZADA - ESTAGIARIO EM QUARENTENA");
		   }
       }
    }
