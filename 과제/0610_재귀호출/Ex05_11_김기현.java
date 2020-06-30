import java.util.Scanner;

public class Ex05_11_김기현 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1:");
		a =sc. nextInt();
		System.out.print("숫자2:");
		b =sc. nextInt();
				
		System.out.println("숫자1의 숫자2 제곱값:"+jj(a,b));
	}
	
	
	static int jj(int a, int b) {
		if(b==0)
			return 1;
		else
			return a * jj(a,b-1);
	}

}
