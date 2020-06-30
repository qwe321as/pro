import java.util.Scanner;

public class EX_05_11_이은찬 {
	public static void main(String[] args) {
		
		// 정수2개입력
		// 2와 3을 입력 시 2의 3승 = 8의 결과값이 나오게 작성
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("1.밑을 입력 해주세요:");
		 int number1 = sc.nextInt();
		 System.out.println();
		System.out.println("밑:"+number1);
		
		System.out.println();
		System.out.print("2.배수를 입력 해주세요:");
		int number2 = sc.nextInt();
		System.out.println();
		System.out.println("배수:"+number2);
		System.out.println();
		
		fac(number1,number2);
		System.out.println(number1+"의 "+number2+"승:"+fac(number1,number2));
		
	}
	static int fac(int x, int y) {
		if(y==0)
			return 1;
		else
			return x* fac(x, y-1); // 질문하기
	}
}
