import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_07_숫자입력 {
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
			System.out.print("\n1~100사이의 정수값을 입력하세요:");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt(); // 
			}catch(InputMismatchException e){
				System.out.println("유효하지 않은 값입니다.숫자로 다시 입력하세요");
				continue; // while의 조건식으로 간다.
			}
			if(answer>input) {
				System.out.println("더 큰수를 입력하세요.");
			}
			else if(answer<input) {
				System.out.println("더 작은수를 입력하세요.");
			}
			else {
				System.out.println("정답입니다.");
				System.out.println("시도한 횟수:"+count+"번 입니다.");
				break;
			}
		}while(true);

		System.out.println("프로그램을 종료합니다.");
	}

}







