import java.util.Scanner;

public class Ex04_07_�ڱ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, stuNum;
		int i;
		int[] score= null;
		while(true) {
		
		
		System.out.println("----------------------------------");
		System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
		System.out.println("----------------------------------");
		System.out.print("��ȣ ����:");
		num = sc.nextInt();
		if(num==1) {
			System.out.print("1.�л��� �Է�:");
			stuNum = sc.nextInt();
			 score = new int[stuNum];
			
			
			
		}
		else if(num==2) {
			System.out.println("2.�����Է�");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է��ϼ���");
				continue; // ��Ƽ�� ������ for������ ������
						  // for������ ���������� ���� while�������� while([���ǽ�]true) �� ��
			}
			for(i=0;i<score.length;i++) {
				System.out.print(i+1+"�� �л� ����:");
				score[i] = sc.nextInt();
			}
		}
		else if(num==3) {
			System.out.println("3.�������");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է��ϼ���");
				continue;
			
			}
			for(i=0;i<score.length;i++) {
				System.out.println(i+1+"�� �л�����:"+score[i]);
			}
		}else if(num==4) {
			System.out.println("4.�м�");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է��ϼ���");
				continue;
				// ����, ���(�Ҽ����Ʒ� 2�ڸ�), �ִ밪, �ּҰ� , ����
			}
				int sum = 0;
				for(i=0;i<score.length;i++) {
				sum += score[i];
				}
				System.out.println("����:"+sum);
				double avg;
				avg = sum/(double)score.length;
				System.out.printf("���:%.2f\n",avg );
				int max=score[0];
				int min=score[0];
				for(i=1;i<score.length;i++) {// for
					if(max<score[i]) {
						max = score[i];
					}
					
					if(min>score[i]) {
						min = score[i];
					}
				}//for��
				System.out.println("�ִ밪:"+max);
				System.out.println("�ּҰ�:"+min);
				int temp;
				int j;
				for(i=0;i<score.length;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				System.out.println();
				System.out.print("����:");
				for(i=0;i<score.length;i++) {
				System.out.print(score[i]+" ");
				}
				System.out.println();
		}else if(num==5) {
			System.out.println("5.����");
			break;
		}
		else {
			System.out.println("1~5������ ��ȣ�� �����մϴ�.");
		}
		}//while
		System.out.println("���α׷��� �����մϴ�.");
		

	}

}
