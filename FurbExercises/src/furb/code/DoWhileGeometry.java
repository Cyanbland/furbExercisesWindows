package furb.code;

import javax.swing.JOptionPane;

public class DoWhileGeometry {

	public static void main(String[] args) {
		int firstMeasure = 0;
		int secondMeasure = 0;
		int thirdMeasure = 0;
		
		int option, area, perimeter;
		
		String input, numInput1, numInput2, numInput3;
		
		
		do {
			input = JOptionPane.showInputDialog("SISTEMA DE CÁLCULO GEOMÉTRICO"+
   				    "\n\n\t1. ÁREA DO QUADRADO\n\t2. ÁREA DO RETÂNGULO"+
		    "\n\t3. ÁREA DO TRIÂNGULO RETÂNGULO\n\t4. PERÍMETRO DO QUADRADO"  + 
   				    "\n\t5. PERÍMETRO DO RETÂNGULO\n\t6. PERÍMETRO DO TRIÂNGULO\n\t7. SAIR \n\n\tQUAL CÁLCULO GEOMÉTRICO VOCE QUER APRENDER? ");
			option = Integer.parseInt(input);
			
			switch(option) {
				case 1:
					numInput1 = JOptionPane.showInputDialog("Informe a medida do lado do quadrado: ");
					firstMeasure = Integer.parseInt(numInput1);
					area = firstMeasure * firstMeasure;
					System.out.println("ÁREA DO QUADRADO DE MEDIDA " +  firstMeasure + " É " + area);
					break;
					
				case 2:
					numInput1 = JOptionPane.showInputDialog("Informe a medida da altura: ");
					numInput2 = JOptionPane.showInputDialog("Informe a medida da largura: ");
					firstMeasure = Integer.parseInt(numInput1);
					secondMeasure = Integer.parseInt(numInput2);
					area = firstMeasure * secondMeasure;
					System.out.println("ÁREA DO RETÂNGULO É " + area);
					break;
					
				case 3:
					numInput1 = JOptionPane.showInputDialog("Informe a medida do primeiro cateto: ");
					numInput2 = JOptionPane.showInputDialog("Informe a medida do segundo cateto: ");
					numInput3 = JOptionPane.showInputDialog("Informe a medida da hipotenusa: ");
					firstMeasure = Integer.parseInt(numInput1);
					secondMeasure = Integer.parseInt(numInput2);
					thirdMeasure = Integer.parseInt(numInput3);
					area = (firstMeasure * secondMeasure)/2;
					System.out.println("ÁREA DO TRIÂNGULO É " + area);
					break;

				case 4:
					numInput1 = JOptionPane.showInputDialog("Informe a medida do lado do quadrado: ");
					firstMeasure = Integer.parseInt(numInput1);
					perimeter = firstMeasure * 4;
					System.out.println("PERÍMETRO DO QUADRADO DE MEDIDA " +  firstMeasure + " É " + perimeter);
					break;
					
				case 5:
					numInput1 = JOptionPane.showInputDialog("Informe a medida da altura: ");
					numInput2 = JOptionPane.showInputDialog("Informe a medida da largura: ");
					firstMeasure = Integer.parseInt(numInput1);
					secondMeasure = Integer.parseInt(numInput2);
					perimeter = (firstMeasure * 2) + (secondMeasure * 2);
					System.out.println("PERÍMETRO DO RETÂNGULO É " + perimeter);
					break;
				
				case 6:
					numInput1 = JOptionPane.showInputDialog("Informe a medida do primeiro cateto: ");
					numInput2 = JOptionPane.showInputDialog("Informe a medida do segundo cateto: ");
					numInput3 = JOptionPane.showInputDialog("Informe a medida da hipotenusa: ");
					firstMeasure = Integer.parseInt(numInput1);
					secondMeasure = Integer.parseInt(numInput2);
					thirdMeasure = Integer.parseInt(numInput3);
					perimeter = firstMeasure + secondMeasure + thirdMeasure;
					System.out.println("PERÍMETRO DO TRIÂNGULO É " + perimeter);
			}
			
		} while(option < 7);
	}

}
