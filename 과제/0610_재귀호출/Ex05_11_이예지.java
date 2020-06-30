import java.util.Scanner;

public class Ex05_11_ÀÌ¿¹Áö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(je(a,b));

	}
	static int je(int a1, int b1) {
		if (b1==1) {
			return a1;
		}
		else {
			return a1*je(a1, (b1-1));
		}
	}

}
