import java.util.Scanner;

public class Ex05_11_정주원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 //정수 2개 입력 (a,b)a의 b승 출력
		System.out.println("a: ");
		int num1=sc.nextInt();
		System.out.println("n: ");
		int num2=sc.nextInt();
		
		
	
		System.out.println("aⁿ="+power(num1,num2));          
	}
	
	static int power(int a,int n) {
		if(n==0)
			
			return 1;
		
		else 
			return a *power(a,n-1);
		
	}
	
	
}
