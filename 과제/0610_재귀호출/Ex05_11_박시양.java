import java.util.Scanner;

public class Ex05_11_�ڽþ� {
	
	static int sum(int a, int b) {
		
		if(b == 0) {
			return  1;
		}
		else {
			return a * sum(a, b-1);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է�:");
		int a = sc.nextInt();
		System.out.println("�� ��° ���� �Է�:");
		int b = sc.nextInt();
		System.out.println(sum(a,b));
	}
}




//���� 2�� �Է�
// 2 3 



