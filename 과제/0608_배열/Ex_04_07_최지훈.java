import java.util.Scanner;

public class Ex_04_07_������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i,j,num,sum=0,avar=0,max,min,temp=0;
		int[] score=null;

		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.�л��� �� 2.�����Է� �� 3.������� �� 4.�м� �� 5.����");
			System.out.println("--------------------------");
			System.out.println("��ȣ�Է�");
			num = sc.nextInt();

			if(num==1) {
				System.out.println("1.�л���  �Է� : ");
				int stuNum = sc.nextInt();
				score = new int[stuNum];


			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1������ �Է����ּ���.");
					continue;
				}

				for(i=0;i<score.length;i++) { 
					System.out.println(i+1+"�� �л� ����");
					score[i] = sc.nextInt();
				}

			}

			else if(num==3) {
				System.out.println("3.�������");
				if(score==null) {
					System.out.println("1������ �Է����ּ���.");
					continue;
				}
				for(i=0;i<score.length;i++) { 

					System.out.println(i+1+"���� �л� ����"+score[i]+" ");

				}
			}

			else if(num==4) {
				System.out.println("4.�м�");
				System.out.println("***********");
				if(score==null) {
					System.out.println("1������ �Է����ּ���.");
					continue;
				}

				for(i=0;i<score.length;i++) { 

					sum = sum +score[i];

				}
				System.out.println("���� :"+sum);
				System.out.println("***********");

				avar = sum/score.length;
				System.out.println("��� :"+avar);
				System.out.println("***********");		

				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++) {
					if (max<score[i]) {
						max = score[i];
					}
					if (min>score[i]) {
						min=score[i+1];
					}

				}


				System.out.println("�ִ밪 :"+max);
				System.out.println("***********");
				System.out.println("�ּҰ� :"+min);
				System.out.println("***********");

				for(i=0;i<score.length; i++) {
					for(j=i+1;j<5;j++){

						{
							if(score[i]>=score[j]) {
								temp = score[j];
								score[j] = score[i];
								score[i] =temp;		

							}

						}
					}
				}
				for(i=0;i<score.length; i++) 
				{System.out.print(score[i]+" ");

				}

			}



			else if(num==5) {
				System.out.println("5.����");
				break;
			}

			else {
				System.out.println("1~5���� �־��ּ���");
			}








		} System.out.println("���α׷� ���� �մϴ�.");






































	}

}
