import java.util.Scanner;

public class Ex04_07_����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum;		
		int[] score = null;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�н�|5.����");
			System.out.println("-----------------------");
			System.out.println("��ȣ ����>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println("�л��� �Է�>>");
				stuNum = sc.nextInt();
				
				score = new int[stuNum];			
				
			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(int i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:");
					score[i] = sc.nextInt();
				}
				
				
			}else if(num==3) {
				System.out.println("3.�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(int i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:"+score[i]);
					
				}
				
			}else if(num==4) {
				System.out.println("4.�н�");
				
				// ����, ���(�Ҽ����Ʒ� 2�ڸ�), �ִ밪, �ּҰ�
				//����33,67,22,11 => 11,22,33,67
				int sum=0;
				for(int i=0;i<score.length;i++) {
					sum+=score[i];
				}
				System.out.println("����:"+sum);
				System.out.printf("���:%.2f\n",(float)sum/score.length);

				int temp;
				for(int i=0;i<score.length-1;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp=score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				System.out.println("�ִ밪:"+score[score.length-1]);
				System.out.println("�ּҰ�:"+score[0]);
			}else if(num==5) {
				System.out.println("5.����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
			}

		} // while
		System.out.println("���α׷��� �����մϴ�.");


	}

}
