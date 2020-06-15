package furb.code;

import javax.swing.JOptionPane;

/*05) Uma empresa de ônibus pretende fazer uma avaliação da ocupação de seus
ônibus. Cinco deles foram avaliados e para cada um anotou-se:
a) O número do ônibus;
b) O número inicial da catraca (antes de começar a viagem;
c) O número final da catraca.
Faça um programa que leia estas informações e diga:
a) Quantas pessoas são transportadas em média pela empresa a cada
viagem;
b) Qual o número do ônibus que andou mais lotado e quantas pessoas
transportou;
*/


public class List02Ex05 {

	public static void main(String[] args) {
		
		String idInput, initialNumInput, finalNumInput;
		
		int numberOfBuses = 5;
		int[] busIds = new int[numberOfBuses];
		int[] initialNumbers = new int[numberOfBuses];
		int[] finalNumbers = new int[numberOfBuses];
		int[] passengers = new int[numberOfBuses];
		
		int transportedPeopleTotal = 0;
		int busIdWithMostPeople = 0;
		int passengersOfBusWithMostPeople = 0;
		float transportedPeopleAverage;
		
		for (int i = 0; i < numberOfBuses; i++) {
			idInput = JOptionPane.showInputDialog("Informe o número do ônibus: ");
			busIds[i] = Integer.parseInt(idInput);
			
			initialNumInput = JOptionPane.showInputDialog("Informe o número inicial da catraca do ônibus " + busIds[i] + ": ");
			initialNumbers[i] = Integer.parseInt(initialNumInput);
			
			finalNumInput = JOptionPane.showInputDialog("Informe o número final da catraca do ônibus + " + busIds[i] + ": ");
			finalNumbers[i] = Integer.parseInt(finalNumInput);
			
			passengers[i] = (finalNumbers[i] - initialNumbers[i]);
			
			transportedPeopleTotal += (passengers[i]);
			
			if (i > 0) {
				if (passengers[i] > passengers[i - 1]) {
					busIdWithMostPeople = busIds[i];
					passengersOfBusWithMostPeople = passengers[i];
				}
			}

		}
		
		transportedPeopleAverage = (float)(transportedPeopleTotal / numberOfBuses);
		System.out.println("Quantas pessoas são transportadas em média pela empresa a cada viagem: " + transportedPeopleAverage);
		System.out.println("O ônibus " + busIdWithMostPeople + " foi o mais lotado, totalizando " + passengersOfBusWithMostPeople + " passageiros");
		
		
		
		
		
	}

}
