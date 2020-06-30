import java.util.Scanner;

public class Ex05_11_권현 {
	public static void main(String[] args) {

		//정수 2개 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력1:");
		int num1 =sc.nextInt();
		System.out.print("숫자입력2:");
		int num2 =sc.nextInt();
		
		System.out.println(p(num1,num2));
	}
	static int p(int num1,int num2) {
		int result;
		if(num2==0)
			return result=1;
		else
			result=num1*p(num1,(num2-1));
		return result;
		
	}
}
