package furb.code;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/*3) A Furb pretende fazer um estudo do seu espaço físico. Para tanto várias salas foram
visitadas e para cada delas anotou-se:
a) O número da sala;
b) a largura da sala;
c) a profundidade da sala.
Escreva um algoritmo que leia estas informações e diga:
a) O número e a área de cada sala;
b) A área média das salas da Furb;
c) O número e a área da maior sala.
OBS.: a entrada de dados termina quando for digitado o número zero para sendo o número da sala.
*/
public class List03Ex03 {

	public static void main(String[] args) {
		int roomsTotal = 0;
		int roomsAreaTotal = 0;
		int biggestRoom = 0;
		int biggestArea = 0;
		int roomNum, roomWidth, roomDepth, roomArea;
		ArrayList<Integer> roomsNum = new ArrayList<Integer>();
		ArrayList<Integer> roomsWidth = new ArrayList<Integer>();
		ArrayList<Integer> roomsDepth = new ArrayList<Integer>();
		ArrayList<Integer> roomsArea = new ArrayList<Integer>();
		
		
		String input;
		
		input = JOptionPane.showInputDialog("Informe o número da sala: ");
		roomNum = Integer.parseInt(input);
		roomsNum.add(roomNum);
		do {
			input = JOptionPane.showInputDialog("Informe a largura da sala (em metros): ");
			roomWidth = Integer.parseInt(input);
			roomsWidth.add(roomWidth);
			
			input = JOptionPane.showInputDialog("Informe a profundidade da sala (em metros): ");
			roomDepth = Integer.parseInt(input);
			roomsDepth.add(roomDepth);
			
			roomArea = roomWidth * roomDepth;
			roomsArea.add(roomArea);
			roomsAreaTotal += roomArea;
			
			System.out.println("Cadastro da sala " + roomNum + " efetuado.");
			
			
			
			
			roomsTotal += 1;
			input = JOptionPane.showInputDialog("Informe o número da sala: ");
			roomNum = Integer.parseInt(input);
			roomsNum.add(roomNum);
		} while (roomNum != 0);
		
		for (int i = 0; i < roomsTotal; i++) {
			System.out.println("A sala " + roomsNum.get(i) + " possui " + roomsArea.get(i) + " metros quadrados" );
			
			
			if (i > 0) {
				if (roomsArea.get(i) > roomsArea.get(i - 1)) {
					biggestArea = roomsArea.get(i);
					biggestRoom = roomsNum.get(i);
				}
			}
		}
		System.out.println("A área média das salas da Furb: " + roomsAreaTotal / roomsTotal);
		System.out.println("A sala " + biggestRoom + " possui a maior área: " + biggestArea + " metros quadrados");

	}

}
