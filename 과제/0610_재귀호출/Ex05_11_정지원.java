import java.util.Scanner;

public class Ex05_11_������ {

	public static void main(String[] args) {
		//���� 2�� �Է�
		//2,3 2�� 3�� ����� ��������
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("power"+power(c,d));
	}

	static int power (int n,int a) {
		if(a==0)

		return  1;
		else 
			return n * power (n ,a-1);
	}



}


