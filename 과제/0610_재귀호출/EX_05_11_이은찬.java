import java.util.Scanner;

public class EX_05_11_������ {
	public static void main(String[] args) {
		
		// ����2���Է�
		// 2�� 3�� �Է� �� 2�� 3�� = 8�� ������� ������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("1.���� �Է� ���ּ���:");
		 int number1 = sc.nextInt();
		 System.out.println();
		System.out.println("��:"+number1);
		
		System.out.println();
		System.out.print("2.����� �Է� ���ּ���:");
		int number2 = sc.nextInt();
		System.out.println();
		System.out.println("���:"+number2);
		System.out.println();
		
		fac(number1,number2);
		System.out.println(number1+"�� "+number2+"��:"+fac(number1,number2));
		
	}
	static int fac(int x, int y) {
		if(y==0)
			return 1;
		else
			return x* fac(x, y-1); // �����ϱ�
	}
}
