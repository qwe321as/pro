import java.util.Scanner;

public class Ex04_07_������ {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num, stuNum, i, j, sum=0, max=0, min=0, temp;
		double avg=0;
		int[] score = null; //null ���� �־��  else if���� ������ �ȳ�
		while(true) {


			System.out.println("-----------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("-----------------------------------");
			System.out.print("��ȣ����>>");
			num=sc.nextInt();

			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum=sc.nextInt();
				score=new int[stuNum];
			}

			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue;
				}


				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:");

					score[i]=sc.nextInt();
				}


			}
			else if(num==3) {
				System.out.println("3.�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue;
				}

				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:"+score[i]);
				}

			}
			else if(num==4) {
				System.out.println("4.�м�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue;
				}
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp=score[j];
							score[j]=score[i];
							score[i]=temp;
						}
					}
				}


				max=max+score[0];
				min=min+score[0];







				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
					avg=sum/(double)score.length;



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
				System.out.print("����:");
				for(i=0;i<score.length;i++) {

					System.out.print(score[i]+" ");
				}

				System.out.println();


			}

			else if(num==5) {

				System.out.println("5.����");
				break;
			}
			else {

				System.out.println("1~5������ ��ȣ�� �Է� �����մϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
