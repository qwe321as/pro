import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_07_�����Է� {
	public static void main(String[] args) {

		//		double d = Math.random();
		//		System.out.println("d:"+d);
		//		(int)(0*100)+1 <= (int)(x*100)+1 < (int)(1*100)+1 

		int answer = (int)(Math.random() * 100) + 1;
		int input=0;
		int count=0;
		System.out.println("answer:"+answer);
		do {
			count++;
			System.out.print("\n1~100������ �������� �Է��ϼ���:");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt(); // 
			}catch(InputMismatchException e){
				System.out.println("��ȿ���� ���� ���Դϴ�.���ڷ� �ٽ� �Է��ϼ���");
				continue; // while�� ���ǽ����� ����.
			}
			if(answer>input) {
				System.out.println("�� ū���� �Է��ϼ���.");
			}
			else if(answer<input) {
				System.out.println("�� �������� �Է��ϼ���.");
			}
			else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ��� Ƚ��:"+count+"�� �Դϴ�.");
				break;
			}
		}while(true);

		System.out.println("���α׷��� �����մϴ�.");
	}

}







