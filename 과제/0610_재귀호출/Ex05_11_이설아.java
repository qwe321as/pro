import java.util.Scanner;

public class Ex05_11_이설아 {

	public static void main(String[] args) {

		//정수 2개 입력 
		//재귀호출 이용하여 a의 b승 출력하기  ex)2,3=2의3승
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("a 입력: ");
		int a= sc.nextInt();
		System.out.print("b 입력: ");
		int b= sc.nextInt();
		System.out.println("a의 b승= "+ sub(a,b));
		
	}//main
	
	static int sub (int a, int b) {
		if(b==0) {
			return 1;
		}
		else {
			return a * sub(a,b-1);
		}
	}
	
	

}//class
