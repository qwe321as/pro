import java.util.Scanner;

public class Ex05_11_박시양 {
	
	static int sum(int a, int b) {
		
		if(b == 0) {
			return  1;
		}
		else {
			return a * sum(a, b-1);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력:");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자 입력:");
		int b = sc.nextInt();
		System.out.println(sum(a,b));
	}
}




//정수 2개 입력
// 2 3 



