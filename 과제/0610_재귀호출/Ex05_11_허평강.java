import java.util.Scanner;

public class Ex05_11_허평강 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자1: ");
	int num1 = sc.nextInt();
	System.out.print("숫자2: ");
	int num2 = sc.nextInt();
	
	System.out.println(sum(num1,num2));
	
	
	
	
	//정수2개입력
	
	
	
}

static int sum(int a,int b) {
if(b==0) return 1;
else return a*sum(a,b-1);
	


}
}
