import java.util.Scanner;

public class Ex05_11_���½� {

	public static void main(String[] args) {

	//���� 2�� �Է�
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("����1�Է�:");
		num1 = sc.nextInt();
		System.out.print("����2�Է�:");
		num2 = sc.nextInt();
		System.out.println(+num1+"��"+num2+"��="+fact(num1,num2));
	}

	static int fact(int num1,int num2) {
		if(num2==0)
			return 1;
		else
			return num1 * fact(num1,num2-1);
		

	}
	
	
}
