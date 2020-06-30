import java.util.Scanner;

public class Ex05_11_박근주 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("첫번째 숫자 입력: ");
		 num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 :");
		 num2 = sc.nextInt();
		fact(num1,num2);
		System.out.print("결과:"+fact(num1,num2));
		

	}
	static int fact(int num1,int num2) {
		if(num2==0)
			return 1;
		else
			return num1*fact(num1, num2-1);
		
		
	}
	

}
