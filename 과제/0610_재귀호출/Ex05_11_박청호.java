import java.util.Scanner;

public class Ex05_11_��ûȣ {

	public static void main(String[] args) {
		
		
		//���� 2�� �Է�
		//2�� 3���� ����°�, ��� ȣ��� �����
		//5 6 
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("�����Է�:");
		int num1 = sc.nextInt();
		System.out.println("������ �Է�");
		int num2 = sc.nextInt();
		
		fac(num1, num2);
		System.out.println(num1 + "��" + num2 + "����=" + fac(num1,num2));
	}
		static int fac(int a, int b)	{
			if(b==0)
			return 1;
			else
				return a*fac(a,b-1);
			
			
		}
	
	
}
