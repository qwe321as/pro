import java.util.Scanner;

public class Ex05_11_����ȣ {

	public static void main(String[] args) {
		
		//���� 2�� �Է�  ���� ����Լ��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���. : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���. : ");
		num2 = sc.nextInt();
		
		
		System.out.println(num1 + "�� " + num2 + "�� = " + aa(num1, num2));
	}
	
	static int aa(int x, int y) {
		
		if(y == 0) {
			
			return 1;
		}
		
		return x * aa(x, y - 1);
	}

}
