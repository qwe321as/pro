import java.util.Scanner;

public class Ex05_11_이재혁 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//정수 2개 입력
		
		System.out.print("밑:");
		int num1 = sc.nextInt();
		System.out.print("지수:");
		int num2 = sc.nextInt();
		
		System.out.println(num1+"^"+num2+"="+squ(num1,num2));
			
	}
	
	static int squ(int a, int b) {
		if(b==0) return 1;	 
		else return a*squ(a, b-1);
		


	}


}
