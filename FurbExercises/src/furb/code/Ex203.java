package furb.code;

import javax.swing.JOptionPane;

//Leia pares de numeros (x,y) e calcular x**y
//O processamento termina quando x informado for maior q 20 (flag)

public class Ex203 {
	public static void main(String[] args) {
		String userInput;
		int xValue = 0, yValue;
		
		userInput = JOptionPane.showInputDialog("Informe o valor de X: ");
		xValue = Integer.parseInt(userInput);
		
		while (xValue <= 20) {
			userInput = JOptionPane.showInputDialog("Informe o valor de Y: ");
			yValue = Integer.parseInt(userInput);
			
			int result = getExponencial(xValue, yValue);
			System.out.println("O valor " + xValue + " elevado a " + yValue + " resulta em " + result);
			
			userInput = JOptionPane.showInputDialog("Informe o valor de X: ");
			xValue = Integer.parseInt(userInput);
		}
		
	}
	
	private static int getExponencial(int x, int y) {
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			result *=  x;
		}
		return result;
	}
}
