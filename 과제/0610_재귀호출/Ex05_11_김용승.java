import java.util.Scanner;

public class Ex05_11_���� {
	public static void main(String[] args) {
		
		// ���� 2�� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1:");
		int num1 = sc.nextInt();
		System.out.print("���� 2:");
		int num2 = sc.nextInt();
		
		System.out.println(squ(num1,num2));
		
	}
	
	static int squ(int n1, int n2) {
		
		if(n2==0)return 1;
		else return n1*squ(n1,n2-1);
	}
}
