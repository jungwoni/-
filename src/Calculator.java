import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		int result=first;
		while(true) {
			
			System.out.println("��Ģ���� ��ȣ: ");
			String symbol = scanner.next();
			System.out.println(symbol);
			
			if(symbol.equals("quit")) {
				System.out.println("���� ��� �� : "+ result);
				break;
			}
		
			System.out.println("�� ��° �Է� ��: ");
			int second = scanner.nextInt();
			System.out.println(second);
			
		
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
		}
	}
}
