import java.util.Scanner;

public class Ex03_02_ifelse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("name=" + name);

		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt(); 
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
		System.out.printf("avg=%.2f\n",avg);

		String hakjum="";

		if(avg>=90) { 
			hakjum = "A학점";
		}
		else if(avg>=80) { // 80~89.XXXX
			hakjum = "B학점";
			if(avg>=85) {
				hakjum=hakjum+"+";
			}
			else { // 80~84
				hakjum=hakjum+"-";
			}
		}
		else if(avg>=70) {
			hakjum = "C학점";
			
		}
		else if(avg>=60) {
			hakjum = "D학점";
		}
		else {
			hakjum = "F학점";
		}

		System.out.println("hakjum:"+hakjum);
		System.out.println("============");

		if(avg>=90) {
			hakjum="A학점";
		}

		if(avg>=80 && avg<90) {
			hakjum="B학점";
		}

		if(avg>=70 && avg<80) {
			hakjum="C학점";
		}

		if(avg>=60 && avg<70) {
			hakjum="D학점";
		}

		if(avg<70) {
			hakjum="F학점";
		}

		System.out.println("hakjum:"+hakjum);

		System.out.println();




		// switch~case
		switch((int)avg/10) { // 93.2=>93/10
		case 10: 
		case 9: hakjum="A학점"; break;// 90~99
		case 8: hakjum="B학점"; break; // 80~89
		case 7: hakjum="C학점"; break;
		case 6: hakjum="D학점"; break;
		default : hakjum="F학점";break;
		}
		System.out.println("학점:"+hakjum);


		if(kor%5==0) {
			System.out.println("5의 배수");
		}
		if(kor%10==0) {
			System.out.println("10의 배수");
		}
	}

}

//1.국영수 입력
//2.평균 소수 아래 2자리 출력
//3.평균에 따른 학점 if switch~case







