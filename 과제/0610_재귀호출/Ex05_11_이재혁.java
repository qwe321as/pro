import java.util.Scanner;

public class Ex05_11_������ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//���� 2�� �Է�
		
		System.out.print("��:");
		int num1 = sc.nextInt();
		System.out.print("����:");
		int num2 = sc.nextInt();
		
		System.out.println(num1+"^"+num2+"="+squ(num1,num2));
			
	}
	
	static int squ(int a, int b) {
		if(b==0) return 1;	 
		else return a*squ(a, b-1);
		


	}


}
