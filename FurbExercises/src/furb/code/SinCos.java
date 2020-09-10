package furb.code;

import java.util.Scanner;

public class SinCos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inform the angle in degrees: ");
		double angle = scanner.nextDouble();
		double angleInRads = convertDegToRad(angle);
		
		double sin = Math.sin(angleInRads);
		double cos = Math.cos(angleInRads);
		
		System.out.println("The input angle is " + angle + ". It´s sine is " + sin + 
				" and it´s cossine is " + cos + ".");
		
		scanner.close();
		
	}
	
	private static double convertDegToRad(double deg) {
		return (deg * Math.PI) / 180;
	}
}
