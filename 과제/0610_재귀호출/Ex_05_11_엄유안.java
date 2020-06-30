import java.util.Scanner;

public class Ex_05_11_엄유안 {
	public static void main(String[] args) {
		//정수 2개 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		System.out.println("(a, b):" +cal(a,b));
	}
	 static int cal (int a , int b){
		if(b==0)
			return 1;
		return a*cal(a,b-1);
	}
}
