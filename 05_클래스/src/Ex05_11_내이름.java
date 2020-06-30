import java.util.Scanner;

public class Ex05_11_내이름 {
	public static void main(String[] args) {

		// 정수 2개(a,b) 입력 => a의 b승 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		
		int result =recursive(num1, num2);
		System.out.println(num1+"의 "+num2+"승은 "+ result);
	}

	static int recursive(int a,int b) {
		
		if(b==0)
			return 1;
		else
			return a*recursive(a,b-1);
	}
	
}












