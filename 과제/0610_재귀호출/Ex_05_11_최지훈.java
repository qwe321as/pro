import java.util.Scanner;

public class Ex_05_11_������ {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		//���� 2�� �Է¹ް� 2 5 �� 2 �� 5��
		
		System.out.println("����2���� �Է� �ϼ���");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+"��"+b+"�� = "+num(a,b) );
		
		

	}
		static int num(int x, int y) {
			if (y==0) {
				return 1;
			}
			else {
				return x * num(x,y-1);
			}
			
			
			
		}

}
