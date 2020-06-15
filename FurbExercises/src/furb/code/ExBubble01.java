package furb.code;

import javax.swing.JOptionPane;

/*Fazer um programa para administrar uma cole��o de 20 n�meros inteiros informados pelo usu�rio.
Ap�s a digita��o dos n�meros estar encerrada o programa deve apresentar o seguinte menu:
1.MOSTRAR  2. ORDENAR CRESCENTE  3. ORDENAR DECRESCENTE  4. INVERTER  5. VAZAR

OBS. O PROGRAMA S� PODE DECLARAR E USAR UM �NICO ARRAY
*/

public class ExBubble01 {

	public static void main(String[] args) {
		String input;
		
		int numOfInputs = 20;
		int option;
		
		int[] inputsArray = new int[numOfInputs];

		for (int i = 0; i < numOfInputs; i++) {
			input = JOptionPane.showInputDialog((i+1) + ") Informe o n�mero: ");
			inputsArray[i] = Integer.parseInt(input);
		}
		
		do {
			input = JOptionPane.showInputDialog("Escolha uma op��o: 1.MOSTRAR  2. ORDENAR CRESCENTE  3. ORDENAR DECRESCENTE  4. INVERTER  5. VAZAR");
			option = Integer.parseInt(input);
			
			switch(option) {
				case 1:
					System.out.println("\n");
					for (int i = 0; i < inputsArray.length; i++) {
						System.out.print(" "+ inputsArray[i]);
					}
					break;
				case 2:
					inputsArray = getCrescentArray(inputsArray);
					break;
				case 3:
					inputsArray = getDecrescentArray(inputsArray);
					break;
				case 4:
					inputsArray = getInvertedArray(inputsArray);
					break;
					
			}
		} while(option < 5 && option > 0);

	}
	
	private static int[] getCrescentArray(int[] arr) {
		for (int loop = 1; loop <= arr.length; loop++) {
			for (int i = 0; i < (arr.length - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					int aux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = aux;
				}
			}
		}
		return arr;
	}
	
	private static int[] getDecrescentArray(int[] arr) {
		for (int loop = 1; loop <= arr.length; loop++) {
			for (int i = 0; i < (arr.length - 1); i++) {
				if (arr[i] < arr[i + 1]) {
					int aux = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = aux;
				}
			}
		}
		return arr;
	}
	
	private static int[] getInvertedArray(int[] arr) {
		int[] invertedArray = new int[arr.length];
		int j = 0;
		for (int i = (arr.length - 1); i > - 1; i--) {
			invertedArray[j] = arr[i];
			j++;
		}
		return invertedArray;

	}

}
