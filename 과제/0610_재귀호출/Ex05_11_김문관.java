import java.util.Scanner;

public class Ex05_11_김문관 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("x의 제곱값 구하기.");
		System.out.println("x값을 입력하세요.");
		int x = scan.nextInt();
		System.out.println("y값을 입력하세요.");
		int y = scan.nextInt();

		System.out.println("값은 : " + pro(x,y));
	}

	static int pro(int x, int y) {
		if(y == 0) {
			return 1;
		}else {
			return x * pro(x,y-1);
		}
		
		
	}
}
