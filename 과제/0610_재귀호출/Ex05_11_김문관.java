import java.util.Scanner;

public class Ex05_11_�蹮�� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("x�� ������ ���ϱ�.");
		System.out.println("x���� �Է��ϼ���.");
		int x = scan.nextInt();
		System.out.println("y���� �Է��ϼ���.");
		int y = scan.nextInt();

		System.out.println("���� : " + pro(x,y));
	}

	static int pro(int x, int y) {
		if(y == 0) {
			return 1;
		}else {
			return x * pro(x,y-1);
		}
		
		
	}
}
