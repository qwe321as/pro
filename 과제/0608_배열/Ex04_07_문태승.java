import java.util.Scanner;

public class Ex04_07_���½� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum = 0,i,sum,max,min;
		double avg = 0;
		int[] score = null;
		while(true) {

			System.out.println("----------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("----------------------");
			System.out.println("��ȣ ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.�л��� �Է�>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];

			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;  // for�� => ������  while�� => ���ǽ����� �̵�
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:");
					score[i] = sc.nextInt();
				}
			}
			else if(num==3) {
				System.out.println("3.�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;  // for�� => ������  while�� => ���ǽ����� �̵�(10��°��)
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:"+score[i]);
					continue;
				}
			}
			else if(num==4) {
				System.out.println("4.�м�");
			
			// ����,���(�Ҽ����Ʒ� 2�ڸ�),�ִ밪,�ּҰ�	
			// ����33,67,22,11 => 11,22,33,67	
				sum=0;
				max = score[0];
				min = score[0];
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
					avg=(double)sum/stuNum;
						if(max < score[i]) {
							max = score[i];
						}
						if(min > score[i]) {
							min = score[i];
						}
				}
				System.out.println("����:"+sum);
				System.out.printf("���: %.2f\n1",avg);
				System.out.println("�ִ밪:"+max);
				System.out.println("�ִ밪:"+min);
				
			}
			else if(num==5) {
				System.out.println("5.����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է����ּ���.");
			}

		} //while

		System.out.println("���α׷��� �����մϴ�.");




	}

}
