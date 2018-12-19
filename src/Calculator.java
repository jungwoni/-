import java.util.Scanner;

public class Calculator {
	
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = Input.getFirstValue(scanner);
		
		int result=first;
		while(true) {
			
			String symbol = Input.getSymbol(scanner);
			
			if(symbol.equals("quit")) {
				Output.print(result);
				break;
			}
		
			int second = Input.getSecondValue(scanner);
			
			result = calculate(result, symbol, second);
		}
	}
}
