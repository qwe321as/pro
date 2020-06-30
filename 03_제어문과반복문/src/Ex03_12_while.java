import java.util.Scanner;

public class Ex03_12_while {
	public static void main(String[] args) {

		//while 1~5까지 출력
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println();

		i=1;
		while(true) {
			System.out.println(i);
			if(i==5)
				break; // 반복문을 빠져나가는 기능
			i++;
		}

		// break만나면 여기로 온다.

		System.out.println();

		Scanner sc = new Scanner(System.in); // ctrl+shift+알파벳O 
		int num,sum=0;
		while(true) {
			System.out.print("숫자입력:");
			num = sc.nextInt();
			
			if(num<0)
				break;
			
			sum = sum+num;
		}
		// 여기
		System.out.println("sum="+sum);
		
	}

}

//숫자입력:3
//숫자입력:23
//숫자입력:1
//숫자입력:-2
//총합:27










