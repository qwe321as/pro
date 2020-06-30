import java.util.Scanner;

public class Ex05_11_허용석 {
	public static void main(String[] args) {
		// 정수2개 입력  a의 b승
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		
		System.out.println(a+"의"+b+"승= "+square(a,b));
		sc.close();
	}
	static int square(int a, int b) {
		if(b==1) {
			return a;
		} else {
			return a * square(a, --b);
		}
	}

}
