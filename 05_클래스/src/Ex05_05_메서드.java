import java.util.Scanner;

class Calculator{
	//합을 리턴하는 메서드 정의 
	int sum(int x,int y){
		return x + y;
	}
	//큰 값을 리턴하는 메서드
	static int max(int x,int y){
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	//작은 값을 리턴하는 메서드
	static int min(int x,int y){
		if(x>y) {
			return y;
		}
		else {
			return x;
		}
	}
}

public class Ex05_05_메서드 {
	public static void main(String[] args) {

		// 정수 2개 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1:");
		int num1 = sc.nextInt();
		System.out.print("정수2:");
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





