import java.util.Scanner;

public class Ex_05_11_������ {
	public static void main(String[] args) {
		//���� 2�� �Է�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		System.out.println("(a, b):" +cal(a,b));
	}
	 static int cal (int a , int b){
		if(b==0)
			return 1;
		return a*cal(a,b-1);
	}
}
