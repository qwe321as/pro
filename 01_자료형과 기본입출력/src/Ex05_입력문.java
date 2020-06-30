import java.util.Scanner;

public class Ex05_입력문 {
	public static void main(String[] args) {
		int a;
		a = 10;
		System.out.println("a=" + a);
		
		a = 20;
		System.out.println("a=" + a);
		
		Scanner sc = new Scanner(System.in); // 
		
		System.out.print("이름 입력 : ");
		String name = sc.next(); // 문자열 입력
		System.out.println("name=" + name);
		
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt(); // 입력한 정수를 scanner를 통해 읽어들인다.
		System.out.println("kor="+kor);
		
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("eng="+eng);
		
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.println("math="+math);
		
		int total = kor + eng + math;
		System.out.println("총점:" + total);

		//평균 소수점아래 2자리 출력
		double avg = (double)total/3; 
		//149.0/3=49  double(8)/int(4) => double(8)/double(8) => 149.0/3.0
		
		System.out.printf("avg=%f\n",avg);
		System.out.printf("avg=%.2f",avg);
	}
}







