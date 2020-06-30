import java.util.Scanner;

public class Ex05_11_김용승 {
	public static void main(String[] args) {
		
		// 정수 2개 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1:");
		int num1 = sc.nextInt();
		System.out.print("숫자 2:");
		int num2 = sc.nextInt();
		
		System.out.println(squ(num1,num2));
		
	}
	
	static int squ(int n1, int n2) {
		
		if(n2==0)return 1;
		else return n1*squ(n1,n2-1);
	}
}
