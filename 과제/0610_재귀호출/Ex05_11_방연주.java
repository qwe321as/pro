import java.util.Scanner;

public class Ex05_11_�濬�� {
	public static void main(String[] args) {
		int a,b;
		//���� 2�� �Է�...?
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		a= sc.nextInt();
		System.out.println("������ �Է��ϼ���");
		b= sc.nextInt();
		
		System.out.printf("%d��%d�� =",a,b);
		System.out.print(dd(a,b));
		
		
	}
	static int dd(int a,int b) {
		if(b==0) {
			return 1;
		}else
			
			return a*dd(a,b-1);
			
			
	}
}
