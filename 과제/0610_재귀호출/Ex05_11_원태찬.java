import java.util.Scanner;

public class Ex05_11_������ {

	public static void main(String[] args) {
		// ���� 2�� �Է�
		// ���ȣ��� a�� b��
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		suv(i,j);
		System.out.println(suv(i,j));
	}
	static int suv(int x,int y) {
		if(y==0) {
			return 1;
		}
		else {
			return x*suv(x,y-1);
		}
	}
}
