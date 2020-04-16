package furb.code;


//Quantos múltiplos de 5 tem no intervalo [1347... 28471]? E destes quantos são também múltiplos de 3?
public class multiplos {
	public static void main(String[] args) {
		int first, last;
		first = 1347;
		last = 28471;
		int divisibleBy5 = 0;
		int divisibleBy3 = 0;
		int divisibleByBoth = 0;
		
		while (first <= last) {
			if (isDivisible(first, 5)) {
				divisibleBy5++;
				
			}
			if (isDivisible(first, 3)) {
				divisibleBy3++;
			}
			if (isDivisible(first, 5) && isDivisible(first, 3)) {
				divisibleByBoth++;
			}
			first++;
		}
		showResults(divisibleBy5, divisibleBy3, divisibleByBoth);
	}
	private static boolean isDivisible(int number, int divisor) {
		return number % divisor == 0;
		
	}
	private static void showResults(int byFive, int byTree, int byBoth) {
		System.out.println("Quantidade de números múltiplos de 5: " + byFive);
		System.out.println("Quantidade de números múltiplos de 3: " + byTree);
		System.out.println("Quantidade de números múltiplos de ambos: " + byBoth);
	}
}
