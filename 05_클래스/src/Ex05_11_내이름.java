import java.util.Scanner;

public class Ex05_11_���̸� {
	public static void main(String[] args) {

		// ���� 2��(a,b) �Է� => a�� b�� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����1:");
		int num1 = sc.nextInt();
		System.out.print("����2:");
		int num2 = sc.nextInt();
		
		int result =recursive(num1, num2);
		System.out.println(num1+"�� "+num2+"���� "+ result);
	}

	static int recursive(int a,int b) {
		
		if(b==0)
			return 1;
		else
			return a*recursive(a,b-1);
	}
	
}












