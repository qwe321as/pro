import java.util.Scanner;

class Calculator{
	//���� �����ϴ� �޼��� ���� 
	int sum(int x,int y){
		return x + y;
	}
	//ū ���� �����ϴ� �޼���
	static int max(int x,int y){
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	//���� ���� �����ϴ� �޼���
	static int min(int x,int y){
		if(x>y) {
			return y;
		}
		else {
			return x;
		}
	}
}

public class Ex05_05_�޼��� {
	public static void main(String[] args) {

		// ���� 2�� �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1:");
		int num1 = sc.nextInt();
		System.out.print("����2:");
		int num2 = sc.nextInt();
		
		Calculator calc = new Calculator();
		int sumResult = calc.sum(num1,num2);
		System.out.println("sumResult:"+sumResult);
		
	
		int maxResult = calc.max(num1, num2);
//		int maxResult = Calculator.max(num1, num2);
		System.out.println("maxResult:"+maxResult);
		
		int minResult = calc.min(num1, num2);
//		int minResult = Calculator.min(num1, num2);
		System.out.println("minResult:"+minResult);
		
		System.out.println();
	}

}





