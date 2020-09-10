
public class RealArray {
	private double[] array;
	
	public RealArray(int size) {
		array = new double[size];
	}
	
	public void setValue(double value, int pos) {
		this.array[pos] = value;	
	}
	
	public double getValue(int pos) {
		return this.array[pos];
	}
	
	public int getEvenQuantity() {
		int counter = 0;
		for (int i = 0; i < this.array.length; i++) {
			int number = (int) this.array[i];
			if (number % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public RealArray division(RealArray other) {
		if (other == null || this.getSize() != other.getSize()) {
			return null; 			//not possible to calculate
		}
		RealArray newRA = new RealArray(this.array.length);
		
		double temp;
		for (int i = 0; i < this.array.length; i++) {
			temp = this.array[i] / other.getValue(i);
			newRA.setValue(temp, i);
		}
		
		return newRA;
	}
	
	public int getSize() {
		return this.array.length;
	}
	
	public double multiplication(RealArray other) {
		// M = (A[1] * B[n]) + (A[2] * B[n-1]) + ...
		if (other == null || this.getSize() != other.getSize()) {
			return 0; 			//not possible to calculate
		}
		
		double m = 0;
		
		for (int i = 0, j = other.getSize() - 1; i < this.array.length; i++,  j--) {
			m += (this.array[i] * other.getValue(j));
			
		}
		
		return m;
	}
	
	public void reverseArray() {
		double aux;
		for (int i = 0; i < this.array.length/2; i++) {
			aux = this.array[i];

			this.array[i] = this.array[this.array.length - i - 1];
			this.array[this.array.length - i - 1] = aux;
		}
	}
	
	public double getGreatestConsecutiveDifference() {
		double greatestDifference = Double.MIN_VALUE;
		double difference;
		
		for (int i = 1; i <= this.array.length - 1; i++) {
			difference = this.array[i] - this.array[i - 1];
			if (difference < 0) {
				difference *= -1;
			}
			if (difference > greatestDifference) {
				greatestDifference = difference;
			}
		}
		
		return greatestDifference;
	}
	
	public String toString() {
		String str = "[";
		for (int i = 0; i < this.array.length; i++) {
			str += this.array[i] + ", ";
		}
		
		str = str.substring(0, str.length() - 2) + "]"; //removes last comma
		return str;
	}
}
	
