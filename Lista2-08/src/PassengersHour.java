
public class PassengersHour {
	//Monts/Days/Hours
	private int[][][] matrix = new int[12][30][24];
	
	public void add(int day, int month, int hour) {
		this.matrix[month - 1][day - 1][hour]++;
	}
	
	public int getTotalOfPassengers(int day, int month) {
		int total = 0;
		//adjusting natural value to index value
		day--; 
		month--;
		
		for (int i = 0; i < this.matrix[month][day].length; i++) {
			total += this.matrix[day][month][i];
		}
		
		return total;
	}
	
	
	public int getLessPopularMonth() {
		int lowestMonth = 1; //January
		int lessPopular = this.getTotalOfPassengers(1);
		
		for (int month = 2; month < 13; month++) {
			int popularity = this.getTotalOfPassengers(month);
			if (popularity < lessPopular) {
				lessPopular = popularity;
				lowestMonth = month;
			}
		}
		
		return lowestMonth;
	}
	
	//sobrecarga de métodos (override)
	//métodos com mesmo nome, mas que se distinguem pela sua assinatura
	//assinatura = nome + parâmetros
	public int getTotalOfPassengers(int month) {
		int total = 0;
		
		for (int day = 1; day < 31; day++) {
			total += this.getTotalOfPassengers(day, month);
		}
		
		return total;
	}
	
	public int[] highestTransport() {
		int hDay, hMonth, hHour, hQuantity;
		hDay = hMonth = hHour = hQuantity = 0;
		for (int m = 0; m < this.matrix.length; m++) {
			for (int d = 0; d < this.matrix[m].length; d++) {
				for (int h = 0; h < this.matrix[m][d].length; h++) {
					if (this.matrix[m][d][h] > hQuantity) {
						hQuantity= this.matrix[m][d][h];
						hMonth = m;
						hDay = d;
						hHour = h;
					}
				}
			}
		}
		
		int[] ret = {hDay + 1, hMonth + 1, hHour, hQuantity};
		return ret;
	}
	
	
	
}
