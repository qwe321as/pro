import java.util.Scanner;

public class Ex05_11_송정호 {

	public static void main(String[] args) {
		
		//정수 2개 입력  제곱 재귀함수로 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫번째 숫자를 입력하세요. : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");
		num2 = sc.nextInt();
		
		
		System.out.println(num1 + "의 " + num2 + "승 = " + aa(num1, num2));
	}
	
	static int aa(int x, int y) {
		
		if(y == 0) {
			
			return 1;
		}
		
		return x * aa(x, y - 1);
	}

}
