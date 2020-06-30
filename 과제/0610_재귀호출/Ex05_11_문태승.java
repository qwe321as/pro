import java.util.Scanner;

public class Ex05_11_문태승 {

	public static void main(String[] args) {

	//정수 2개 입력
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("정수1입력:");
		num1 = sc.nextInt();
		System.out.print("정수2입력:");
		num2 = sc.nextInt();
		System.out.println(+num1+"의"+num2+"승="+fact(num1,num2));
	}

	static int fact(int num1,int num2) {
		if(num2==0)
			return 1;
		else
			return num1 * fact(num1,num2-1);
		

	}
	
	
}
