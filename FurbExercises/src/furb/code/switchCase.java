package furb.code;

import javax.swing.JOptionPane;

public class switchCase {
	public static void main(String[] args) {
		String idInput, fabInput;
		int students = 5;
		int validStundets = students;
		int brandId;
		int fabricationYear;
		int numberOfVw = 0, numberOfGm = 0, numberOfFiat = 0, numberOfFord = 0, numberOfOthers = 0;
		int vehiclesAgeTotal = 0;
		int vwFrom2020 = 0;
		for (int i = 0; i < students; i++) {
			System.out.println("1 = VW, 2 = GM, 3 = Fiat, 4 = Ford, 5 = Outros");
			idInput = JOptionPane.showInputDialog("Informe o Id do carro:");
			brandId = Integer.parseInt(idInput);
			
			fabInput = JOptionPane.showInputDialog("Informe o ano de fabricação do veículo:");
			fabricationYear = Integer.parseInt(fabInput);
			
			int vehicleAge = 2020 - fabricationYear;
			
			
			switch(brandId) {
				case 1:
					numberOfVw += 1;
					if (vehicleAge == 0) {
						vwFrom2020 += 1;
					}
					break;
				case 2:
					numberOfGm += 1;
					break;
				case 3:
					numberOfFiat += 1;
					break;
				case 4:
					numberOfFord += 1;
					break;
				case 5:
					numberOfOthers += 1;
					break;
				default: 
					System.out.println("Erro no valor inserido");
					validStundets -= students;
			}
			
			vehiclesAgeTotal += vehicleAge;
			
		}
	System.out.println("Número de veículos VW: " + numberOfVw);
	System.out.println("Número de veículos GM: " + numberOfGm);
	System.out.println("Número de veículos Fiat: " + numberOfFiat);
	System.out.println("Número de veículos Ford: " + numberOfFord);
	System.out.println("Número de veículos de outras marcas: " + numberOfOthers);
	
	System.out.println("Idade média da frota: " + vehiclesAgeTotal/validStundets);
	System.out.println("Número de VW fabricados em 2020: " + vwFrom2020);
	
	}
  }
