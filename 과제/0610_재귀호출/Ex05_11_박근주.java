import java.util.Scanner;

public class Ex05_11_�ڱ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("ù��° ���� �Է�: ");
		 num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� :");
		 num2 = sc.nextInt();
		fact(num1,num2);
		System.out.print("���:"+fact(num1,num2));
		

	}
	static int fact(int num1,int num2) {
		if(num2==0)
			return 1;
		else
			return num1*fact(num1, num2-1);
		
		
	}
	

}
