package furb.code;

import javax.swing.JOptionPane;

/*Escreva um programa que permita armazenar e manipular uma cole��o de
n�mero inteiros. Inicialmente o usu�rio vai dizer o tamanho que ele quer a
cole��o. Em seguida, o programa deve mostrar o seguinte menu:
Menu
1. Inserir
2. Mostrar
3. Esta Crescente
4. Fatorial Menor
5. Inverte
6. Tem repetido
99. Vazar
Se a op��o 1 for selecionada, o programa pede ao usu�rio que informe todos os
elementos da cole��o. Se a op��o 2 for selecionada o programa mostra todos os
elementos da cole��o. Se a op��o 3 for selecionada o programa diz se a cole��o
est� ordenada em ordem crescente (apenas sim ou n�o). Se a op��o 4 for
selecionada o programa mostra o fatorial do menor elemento da cole��o. Se a
op��o 5 for selecionada o programa inverte a ordem da cole��o, de tal forma que o
primeiro passe a ser o �ltimo, o segundo o pen�ltimo, e assim sucessivamente. Se a
op��o 6 for selecionada o programa diz se existem elementos repetido na cole��o
(apenas sim ou n�o). A op��o 99 termina.
Observa��es:
1- Implemente, para as op��es de 2, 3, 4 e 6 um m�todo espec�fico para cada uma
delas.
2- O programa s� dever� utilizar 1 �nico array.
3- Apenas o m�todo principal faz opera��es de entrada e sa�da de dados (I/O)
*/

//S� pode usar op��es 2-6 dps de ter inserido


public class AvaliativeTest3 {

	public static void main(String[] args) {
		String input;
		int numberOfInputs, option;
		boolean arrayIsPopulated = false;

		
		input = JOptionPane.showInputDialog("Informe o tamanho da cole��o: ");
		numberOfInputs = Integer.parseInt(input);
		
		int[] inputsCollection = new int[numberOfInputs];
		
		do {
			input = JOptionPane.showInputDialog("1. Inserir\r\n" + 
					"2. Mostrar\r\n" + 
					"3. Est� Crescente\r\n" + 
					"4. Fatorial Menor\r\n" + 
					"5. Inverte\r\n" + 
					"6. Tem Repetido\r\n" + 
					"99. VAZAR ");
			option = Integer.parseInt(input);
			
			switch(option) {
				case 1: 
					for (int i = 0; i < numberOfInputs; i++) {
						input = JOptionPane.showInputDialog((i + 1) + ") Informe o elemento da cole��o: ");
						inputsCollection[i] = Integer.parseInt(input);
						arrayIsPopulated = true;
					}
					break;
					
				case 2:
					if (arrayIsPopulated) {
						showCollection(inputsCollection);
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da cole��o para poder acessar outras op��es");
					}
					break;
					
				case 3:
					if (arrayIsPopulated) {
						if (checkIfAscendingOrder(inputsCollection)) {
							System.out.println("A cole��o est� em ordem crescente.");
						}
						else {
							System.out.println("A cole��o n�o est� em ordem crescente.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da cole��o para poder acessar outras op��es");
					}
					break;
				case 4: 
					if (arrayIsPopulated) {
						int lowestNumber = getLowestNumber(inputsCollection);
						int fatorial = getFatorial(lowestNumber);
						System.out.println("O menor n�mero da cole��o � " + lowestNumber + " e possui fatorial = " + fatorial);
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da cole��o para poder acessar outras op��es");
					}
					break;
					
				case 5:
					if (arrayIsPopulated) {
						for (int i = 0; i < numberOfInputs / 2; i++) {
							int element = inputsCollection[i];
							inputsCollection[i] = inputsCollection[inputsCollection.length - i - 1];
							inputsCollection[inputsCollection.length - i - 1] = element;
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da cole��o para poder acessar outras op��es");
					}
					break;
					
				case 6:
					if (arrayIsPopulated) {
						if (checkIfRepeatedElementExists(inputsCollection)) {
							System.out.println("Existem elementos repetidos na cole��o.");
						}
						else {
							System.out.println("N�o existem elementos repetidos na cole��o.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da cole��o para poder acessar outras op��es");
					}
					break;
					
			}	
		} while(option != 99 || option <= 10);
		

	}
	
	private static void showCollection(int[] collection) {
		for (int i = 0; i < collection.length; i++) {
			System.out.println((i + 1) + ") " + collection[i]);
		}
	}
	
	private static boolean checkIfAscendingOrder(int[] collection) {
		boolean isAscendent = false;
		int greatestNumber = -9999;
		for (int i = 0; i < collection.length; i++) {
			if (collection[i] > greatestNumber) {
				greatestNumber = collection[i];
				isAscendent = true;
			}
			else {
				return false;
			}
		}
		return isAscendent;
	}
	
	private static int getLowestNumber(int[] collection) {
		int lowestNumber = 9999;
		for (int i = 0; i < collection.length; i++) {
			if (collection[i] < lowestNumber) {
				lowestNumber = collection[i];
			}
		}
		return lowestNumber;
	}
	
	private static int getFatorial(int baseValue) {
		int fatorial = 1;
		
		while(baseValue > 1) {
			fatorial *= baseValue;
			baseValue--;
		}
		return fatorial;
	}
	
	private static boolean checkIfRepeatedElementExists(int[] collection) {
		boolean repeatedElementExists = false;
		for (int i = 0; i < collection.length; i++) {
			for (int j = 0; j < collection.length; j++) {
				if (collection[i] == collection[j] && i != j) {
					repeatedElementExists = true;
				}
			}
		}
		return repeatedElementExists;
	}
	
	
}
