import java.util.Scanner;

public class Ex_05_11_최지훈 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		//정수 2개 입력받고 2 5 면 2 의 5승
		
		System.out.println("정수2개를 입력 하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+"의"+b+"승 = "+num(a,b) );
		
		

	}
		static int num(int x, int y) {
			if (y==0) {
				return 1;
			}
			else {
				return x * num(x,y-1);
			}
			
			
			
		}

}
