import java.util.Scanner;

public class Ex05_11_�̼��� {

	public static void main(String[] args) {

		//���� 2�� �Է� 
		//���ȣ�� �̿��Ͽ� a�� b�� ����ϱ�  ex)2,3=2��3��
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("a �Է�: ");
		int a= sc.nextInt();
		System.out.print("b �Է�: ");
		int b= sc.nextInt();
		System.out.println("a�� b��= "+ sub(a,b));
		
	}//main
	
	static int sub (int a, int b) {
		if(b==0) {
			return 1;
		}
		else {
			return a * sub(a,b-1);
		}
	}
	
	

}//class
