import java.util.Scanner;

public class Ex04_07_�輱�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,stuNum,i=0,j=0,sum=0,max=0,min=0,temp;
		int[] score = null;
		double avg=0;
		while(true) {

			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.print("��ȣ ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.�л��� �Է�>>");
				stuNum=sc.nextInt();
				score=new int[stuNum];			
			}
			else if(num==2) {
				System.out.print("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:");
					score[i]=sc.nextInt();
				}
			}
			else if(num==3) {
				System.out.print("3.�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println((i+1)+"�� �л� ����:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.print("4.�м�\n");
				//����, ���(�Ҽ����Ʒ�2�ڸ�),�ִ밪,�ּҰ�
				//���� 33,67,22,11=>11,22,33,,67
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
					avg = (double)sum/score.length;
				}
				max=score[0];
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(max<score[i]) {
						max=score[i];
					}
					if(min>score[i]) {
						min=score[i];
					}
				}


				System.out.println("����:"+sum);
				System.out.printf("���:%.2f\n",avg);				
				System.out.println("max:"+max);
				System.out.println("min:"+min);

				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");		
				}
			}


			else if(num==5) {
				System.out.print("5.����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է� �����մϴ�.");
			}

		}
		System.out.println("���α׷��� �����մϴ�.");
	}  
}



