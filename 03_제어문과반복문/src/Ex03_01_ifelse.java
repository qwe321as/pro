import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {

		int a=1,b;

		Scanner sc = new Scanner(System.in);
		System.out.print("����1:");
		a = sc.nextInt();
	
		System.out.print("����2:");
		b = sc.nextInt();
		System.out.println(a + "," + b);

		if(a>b) {
			System.out.println("a�� b���� ũ��.");
			System.out.println("������");
		}
		
		else if(a<b) {
			System.out.println("b�� a���� ũ��.");
			System.out.println("ȣȣȣ");
		}
		
		else /* if(a==b) */ {
			System.out.println("b�� a�� ����.");
			System.out.println("������");
		}
		
		System.out.println("if~else�����ϴ� ��..");
	}

}





