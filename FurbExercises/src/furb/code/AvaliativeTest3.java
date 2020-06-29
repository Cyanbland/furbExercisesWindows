package furb.code;

import javax.swing.JOptionPane;

/*Escreva um programa que permita armazenar e manipular uma coleção de
número inteiros. Inicialmente o usuário vai dizer o tamanho que ele quer a
coleção. Em seguida, o programa deve mostrar o seguinte menu:
Menu
1. Inserir
2. Mostrar
3. Esta Crescente
4. Fatorial Menor
5. Inverte
6. Tem repetido
99. Vazar
Se a opção 1 for selecionada, o programa pede ao usuário que informe todos os
elementos da coleção. Se a opção 2 for selecionada o programa mostra todos os
elementos da coleção. Se a opção 3 for selecionada o programa diz se a coleção
está ordenada em ordem crescente (apenas sim ou não). Se a opção 4 for
selecionada o programa mostra o fatorial do menor elemento da coleção. Se a
opção 5 for selecionada o programa inverte a ordem da coleção, de tal forma que o
primeiro passe a ser o último, o segundo o penúltimo, e assim sucessivamente. Se a
opção 6 for selecionada o programa diz se existem elementos repetido na coleção
(apenas sim ou não). A opção 99 termina.
Observações:
1- Implemente, para as opções de 2, 3, 4 e 6 um método específico para cada uma
delas.
2- O programa só deverá utilizar 1 único array.
3- Apenas o método principal faz operações de entrada e saída de dados (I/O)
*/

//Só pode usar opções 2-6 dps de ter inserido


public class AvaliativeTest3 {

	public static void main(String[] args) {
		String input;
		int numberOfInputs, option;
		boolean arrayIsPopulated = false;

		
		input = JOptionPane.showInputDialog("Informe o tamanho da coleção: ");
		numberOfInputs = Integer.parseInt(input);
		
		int[] inputsCollection = new int[numberOfInputs];
		
		do {
			input = JOptionPane.showInputDialog("1. Inserir\r\n" + 
					"2. Mostrar\r\n" + 
					"3. Está Crescente\r\n" + 
					"4. Fatorial Menor\r\n" + 
					"5. Inverte\r\n" + 
					"6. Tem Repetido\r\n" + 
					"99. VAZAR ");
			option = Integer.parseInt(input);
			
			switch(option) {
				case 1: 
					for (int i = 0; i < numberOfInputs; i++) {
						input = JOptionPane.showInputDialog((i + 1) + ") Informe o elemento da coleção: ");
						inputsCollection[i] = Integer.parseInt(input);
						arrayIsPopulated = true;
					}
					break;
					
				case 2:
					if (arrayIsPopulated) {
						showCollection(inputsCollection);
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da coleção para poder acessar outras opções");
					}
					break;
					
				case 3:
					if (arrayIsPopulated) {
						if (checkIfAscendingOrder(inputsCollection)) {
							System.out.println("A coleção está em ordem crescente.");
						}
						else {
							System.out.println("A coleção não está em ordem crescente.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da coleção para poder acessar outras opções");
					}
					break;
				case 4: 
					if (arrayIsPopulated) {
						int lowestNumber = getLowestNumber(inputsCollection);
						int fatorial = getFatorial(lowestNumber);
						System.out.println("O menor número da coleção é " + lowestNumber + " e possui fatorial = " + fatorial);
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da coleção para poder acessar outras opções");
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
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da coleção para poder acessar outras opções");
					}
					break;
					
				case 6:
					if (arrayIsPopulated) {
						if (checkIfRepeatedElementExists(inputsCollection)) {
							System.out.println("Existem elementos repetidos na coleção.");
						}
						else {
							System.out.println("Não existem elementos repetidos na coleção.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro! Insira os valores da coleção para poder acessar outras opções");
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
