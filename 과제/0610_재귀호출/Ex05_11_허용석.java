import java.util.Scanner;

public class Ex05_11_��뼮 {
	public static void main(String[] args) {
		// ����2�� �Է�  a�� b��
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		
		System.out.println(a+"��"+b+"��= "+square(a,b));
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
