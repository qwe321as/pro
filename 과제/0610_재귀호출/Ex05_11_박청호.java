import java.util.Scanner;

public class Ex05_11_박청호 {

	public static void main(String[] args) {
		
		
		//정수 2개 입력
		//2의 3승을 만드는것, 재귀 호출로 만들것
		//5 6 
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("정수입력:");
		int num1 = sc.nextInt();
		System.out.println("제곱근 입력");
		int num2 = sc.nextInt();
		
		fac(num1, num2);
		System.out.println(num1 + "의" + num2 + "제곱=" + fac(num1,num2));
	}
		static int fac(int a, int b)	{
			if(b==0)
			return 1;
			else
				return a*fac(a,b-1);
			
			
		}
	
	
}
