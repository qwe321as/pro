import java.util.Scanner;

public class Ex04_07_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,stuNum,i,j,sum=0,max,min;
		int[] score = null;
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("-------------------------------------------------");
			System.out.println("��ȣ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.println("1.�л���");

				stuNum = sc.nextInt();
				score = new int[stuNum];			
			} 

			else if(num==2) {
				System.out.println("2.�����Է�");	
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ���� : ");
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
					System.out.println(i+1+"�� �л� ����: "+score[i]);

				}
			}

			else if(num==4) {
				System.out.println("4.�м�");
				max=score[0];
				min=score[0];
				for(i=0;i<score.length;i++) {
					
					sum += score[i]; 
					if(max<score[i]) max = score[i];
					if(min>score[i]) min = score[i];


			}
			for(j=0;j<score.length-1;j++) {	
				for(i=j+1;i<score.length;i++) {
					
				
				int temp;
				if(score[j]<score[i]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp; 
					
				}
				}
			}
				
				System.out.println("�հ�:"+sum);
				System.out.printf("���:%.2f\n",(float)sum/score.length);
				System.out.println("�ִ밪:"+max);
				System.out.println("�ּҰ�:"+min);
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
				System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
			}






		}
	}
}
