import java.util.Scanner;

public class Ex05_11_���� {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("����1: ");
	int num1 = sc.nextInt();
	System.out.print("����2: ");
	int num2 = sc.nextInt();
	
	System.out.println(sum(num1,num2));
	
	
	
	
	//����2���Է�
	
	
	
}

static int sum(int a,int b) {
if(b==0) return 1;
else return a*sum(a,b-1);
	


}
}
