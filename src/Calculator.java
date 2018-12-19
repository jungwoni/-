import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù ��° �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("�� ��° �Է� ��: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	static int calculate(int first, String symbol, int second) {
		int result = first;
		if(symbol.equals("+")) {
			result=result+second;
			System.out.println("����: " + result);
		} else if(symbol.equals("-")) {
			result=result - second;
			System.out.println("����: " + result);
		} else if(symbol.equals("*")) {
			result = result*second;
			System.out.println("����: " + result);
		} else if(symbol.equals("/")) {
			result = result/second;
			System.out.println("������: " + result);
		} else {
			System.out.println("��Ģ���� ��ȣ�� �ƴմ�.");
		}
		return result;
	}
	static void print(int result) {
		System.out.println("���� ��� �� : "+ result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = getFirstValue(scanner);
		
		int result=first;
		while(true) {
			
			String symbol = getSymbol(scanner);
			
			if(symbol.equals("quit")) {
				print(result);
				break;
			}
		
			int second = getSecondValue(scanner);
			
			result = calculate(result, symbol, second);
		}
	}
}
