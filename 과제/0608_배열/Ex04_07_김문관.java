import java.util.Scanner;

public class Ex04_07_�蹮�� {

	public static void main(String[] args) {
		//		����, ���(�Ҽ����Ʒ� 2�ڸ�), �ִ밪,�ּҰ�,����
		Scanner scan = new Scanner(System.in);
		int num,stuNum,sum,max,min,temp;
		sum = 0;
		int[] score = null;
		double avg = 0;


		while(true) {

			System.out.println("======================");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("======================");
			System.out.print("��ȣ ����>>");

			num = scan.nextInt();

			if(num == 1) {
				System.out.print("�л��� �Է� :");
				stuNum = scan.nextInt();

				score = new int[stuNum];

			}else if(num == 2) {
				System.out.println("�����Է� :");
				if(score == null) {
					System.out.println("1�� �׸� �л����� ���� �Է��ϼ���");
				}else {
					for(int i = 0; i < score.length; i++) {
						System.out.print(i + 1 + "�л� ���� :");
						score[i] = scan.nextInt();
						if(score[i] > 100) {
							System.out.println("������ 100���� ���� �� �����ϴ�. �Ѵ� ���� 0�� ó��. �ٽ� �Է�.");
							score[i] = 0;
							break;
						}
					}
				}
			}else if(num == 3) {
				System.out.println("������� :");
				if(score == null) {
					System.out.println("1�� �׸� �л����� ���� �Է��ϼ���");
				}else {
					for(int i = 0; i < score.length; i++) {
						System.out.println(i + 1 + "�л� ���� :" +score[i]);
					}
				}

			}else if(num == 4) {
				System.out.println("4.�м�");
				if(score == null) {
					System.out.println("1�� �׸� �л����� ���� �Է��ϼ���");
				}else {


					max = score[0];
					min = score[0];


					for(int i = 0; i < score.length; i++) {
						sum += score[i];
						avg = (double)sum / score.length;

						if(max < score[i]) {
							max = score[i];
						}
						if(min > score[i]) {
							min = score[i];
						}

					}
					System.out.printf("��� : %.2f\n" ,avg);
					System.out.println("�հ� :" + sum);
					System.out.println("�ִ����� :" + max);
					System.out.println("�ּ����� :" + min);


					for(int i = 0; i < score.length; i++) {
						for(int j = i+1; j < score.length; j++) {
							if(score[i] > score[j]) {
								temp = score[j];
								score[j] = score[i];
								score[i] = temp;
							}

						}
						
						System.out.print(score[i] + " ");

					}
					System.out.println();
				}
			}else if(num == 5) {
				System.out.println("5.����");
				break;
			}else {
				System.out.println("1~5������ ��ȣ�� �Է� ����");
			}
		}

		System.out.println("���α׷��� ���� �մϴ�.");

	}

}
