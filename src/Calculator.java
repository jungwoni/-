import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ã¹ ¹øÂ° ÀÔ·Â °ª: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("»çÄ¢¿¬»ê ±âÈ£: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		System.out.println("µÎ ¹øÂ° ÀÔ·Â °ª: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		if(symbol.equals("+")) {
			System.out.println("µ¡¼À: " + (first + second));
		} else if(symbol.equals("-")) {
			System.out.println("»¬¼À: " + (first - second));
		} else if(symbol.equals("*")) {
			System.out.println("°ö¼À: " + (first * second));
		} else if(symbol.equals("-*")) {
			System.out.println("³ª´°¼À: " + (first / second));
		} else {
			System.out.println("»çÄ¢¿¬»ê ±âÈ£°¡ ¾Æ´Õ´Ù.");
		}
		
		System.out.println("µ¡¼À: " + (first + second));
		System.out.println("»¬¼À: " + (first - second));
		System.out.println("°ö¼À: " + (first * second));
		System.out.println("³ª´°¼À: " + (first / second));
	}
}
