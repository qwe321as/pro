import java.util.Scanner;

import java.util.Scanner;

public class Ex04_07_������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, stuNum, i, t, j, sum=0, temp;
		int[] score = null; //unll �ƹ��͵� �ƴ� ��
		while(true) {

			System.out.println("----------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("----------------------------------");
			System.out.print("��ȣ�Է�>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];
			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue; // for�������� ������, ���Ͽ��� ���ǽ����� ����
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
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.�м�");
				if(score==null){
					System.out.println("1�� �л��� ���� �Է��ϼ���.");	
					continue; 
				}
				//����, ���(�Ҽ����Ʒ� 2�ڸ�),�ִ밪,�ּҰ�
				//���� ��������
				//				======
				for (i = 0; i < score.length; i++) {
					sum+=score[i];					
					System.out.println("����: "+sum);
					System.out.printf("�����: %.2f\n",(double)sum/score.length);
					int max = score[0];
					int min = score[0];
					for(i=1;i<score.length;i++) {
						if(max < score[i]) 
							max = score[i];
						if(min > score[i]) 
							min = score[i];
					}
					System.out.println("�ִ밪:"+max);
					System.out.println("�ּҰ�:"+min);
					
					for(i = 0; i < score.length; i++) {
						for(j = i+1; j< score.length; j++) {
							if(score[i]>score[j]) {
								temp = score[j];
								score[j]=score[i];
								score[i]=temp;
							}
						}
					}
					
					System.out.print("���� ����:");
					for(i=0;i<score.length;i++) {
						System.out.print(score[i]+" ");
					}
					System.out.println();

				}
			}//else if4

			else if(num==5) {
				System.out.println("5.����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
			}

		}//while

		System.out.println("���α׷��� �����մϴ�.");









	}//main
}//class
	



