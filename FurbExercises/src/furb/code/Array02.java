package furb.code;

import javax.swing.JOptionPane;

/*A furb vai estudar seu espaço físico. Dez salas foram visitadas e para cada uma anotou-se o 
 * número da sala, a profundidade e a largura.
   Leia estas informações e diga:
   1) o número de cada sala e sua área; 
   2) a área média das salas; 
   3) o número das salas que são maiores que a média,
*/

public class Array02 {
	public static void main(String[] args) {
		String inputString;
		
		int numberOfRooms = 5;
		int areaTotal = 0;
		float areaAverage = 0;
		
		int[] roomNumbers = new int[numberOfRooms];
		int[] roomWidths = new int[numberOfRooms];
		int[] roomDepths = new int[numberOfRooms];
		int[] roomAreas = new int[numberOfRooms];
		int[] roomAreasGreaterThanAverageIndex = new int[numberOfRooms];
		
		for (int i = 0; i < numberOfRooms; i++) {
			inputString = JOptionPane.showInputDialog("Informe o número da sala: ");
			roomNumbers[i] = Integer.parseInt(inputString);
			inputString = JOptionPane.showInputDialog("Informe a largura da sala: ");
			roomWidths[i] = Integer.parseInt(inputString);
			inputString = JOptionPane.showInputDialog("Informe a profundidade da sala: ");
			roomDepths[i] = Integer.parseInt(inputString);
			
			roomAreas[i] = getArea(roomWidths[i], roomDepths[i]);
			areaTotal += roomAreas[i];
			
		}
		areaAverage = ((float)areaTotal/numberOfRooms);
		roomAreasGreaterThanAverageIndex = getRoomsGreaterThanAverageIndex(roomAreas, areaAverage);
		
		
		printRoomNumbersAndArea(roomNumbers, roomAreas);
		System.out.println("A área média das salas: " + areaAverage);
		System.out.println("##" + roomAreasGreaterThanAverageIndex[0]);
		for (int i : roomAreasGreaterThanAverageIndex) {
			System.out.println("A sala " + roomNumbers[i] + " possui área maior que a média");
		}
		
		
		
	}
	
	private static int getArea(int width, int depth) {
		return width * depth;
	}
	
	private static void printRoomNumbersAndArea(int[] numbers, int[] areas) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("A sala de número " + numbers[i] + " tem área = " + areas[i]);
		}
	}
	
	private static int[] getRoomsGreaterThanAverageIndex(int[] baseValues, float average) {
		int[] roomsGreaterThanAverageIndex = new int[baseValues.length];
		
		for (int i = 0; i < baseValues.length; i++) {
			for (int v : baseValues) {
				if (v > average) {
					roomsGreaterThanAverageIndex[i] = i;
				}
			}
		}
		return roomsGreaterThanAverageIndex;

	}
	
}
