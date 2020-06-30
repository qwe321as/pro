import java.util.Scanner;

public class Ex03_02_ifelse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.println("name=" + name);

		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt(); 
		System.out.println("kor="+kor);

		System.out.print("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("eng="+eng);

		System.out.print("�������� �Է� : ");
		int math = sc.nextInt();
		System.out.println("math="+math);

		int total = kor + eng + math;
		System.out.println("����:" + total);

		//��� �Ҽ����Ʒ� 2�ڸ� ���
		double avg = (double)total/3; 
		//149.0/3=49  double(8)/int(4) => double(8)/double(8) => 149.0/3.0

		System.out.printf("avg=%f\n",avg);
		System.out.printf("avg=%.2f\n",avg);

		String hakjum="";

		if(avg>=90) { 
			hakjum = "A����";
		}
		else if(avg>=80) { // 80~89.XXXX
			hakjum = "B����";
			if(avg>=85) {
				hakjum=hakjum+"+";
			}
			else { // 80~84
				hakjum=hakjum+"-";
			}
		}
		else if(avg>=70) {
			hakjum = "C����";
			
		}
		else if(avg>=60) {
			hakjum = "D����";
		}
		else {
			hakjum = "F����";
		}

		System.out.println("hakjum:"+hakjum);
		System.out.println("============");

		if(avg>=90) {
			hakjum="A����";
		}

		if(avg>=80 && avg<90) {
			hakjum="B����";
		}

		if(avg>=70 && avg<80) {
			hakjum="C����";
		}

		if(avg>=60 && avg<70) {
			hakjum="D����";
		}

		if(avg<70) {
			hakjum="F����";
		}

		System.out.println("hakjum:"+hakjum);

		System.out.println();




		// switch~case
		switch((int)avg/10) { // 93.2=>93/10
		case 10: 
		case 9: hakjum="A����"; break;// 90~99
		case 8: hakjum="B����"; break; // 80~89
		case 7: hakjum="C����"; break;
		case 6: hakjum="D����"; break;
		default : hakjum="F����";break;
		}
		System.out.println("����:"+hakjum);


		if(kor%5==0) {
			System.out.println("5�� ���");
		}
		if(kor%10==0) {
			System.out.println("10�� ���");
		}
	}

}

//1.������ �Է�
//2.��� �Ҽ� �Ʒ� 2�ڸ� ���
//3.��տ� ���� ���� if switch~case







