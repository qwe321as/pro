import java.util.Scanner;

public class Ex05_11_정지원 {

	public static void main(String[] args) {
		//정수 2개 입력
		//2,3 2의 3승 결과가 나오도록
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("power"+power(c,d));
	}

	static int power (int n,int a) {
		if(a==0)

		return  1;
		else 
			return n * power (n ,a-1);
	}



}


