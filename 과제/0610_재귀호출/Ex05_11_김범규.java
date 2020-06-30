import java.util.Scanner;

public class Ex05_11_김범규 {

	public static void main(String[] args) {

		// 정수2개입력 

		int x;
		int y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println(result(x,y)); // 2의 3승 / 2*2*2 = 8

   


	} // main

	static int result(int x , int y) { 
		if(y == 0) {
			return 1;
		}
		else
			return x * result(x,y-1); // result(x,y-1) 곧 1을 만들거임. 
									  // 2.2
									  // 2.1
									  // 2x1 = 2 2x2 = 4 2x4 = 8
	}

} // class
