import java.util.Scanner;

public class Ex05_11_�輱�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 2�� �Է�
		//
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("����:");
		num1 = sc.nextInt();
		System.out.print("����:");
		num2 = sc.nextInt();
		
		int result=recursive (num1,num2);
		System.out.println(num1+"��"+num2+"����"+result);
	}
//	static int fact(int x,int y) {
//		if(y==0) {
//			return x;
//		}
//		else
//			return fact(x,y-1);
		static int recursive(int a, int b) {
			if(b==0)
				return 1;
			else
				return a*recursive(a,b-1);
		}
		
}
