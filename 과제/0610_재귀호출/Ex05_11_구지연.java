import java.util.Scanner;

public class Ex05_11_������ {
	public static void main(String[] args) {
		
		//���� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1:");
		int num1 = sc.nextInt();
		System.out.print("num2:");
		int num2 = sc.nextInt();
		

System.out.println(num1 + "�� " + num2 + "�� = " + power(num1,num2));
	}	
		
	static int power(int x, int y) {
		if(y==0) {
			return 1;}
		else {
			return x*power(x,y-1);}	
	

	}
}
