import java.util.Scanner;

public class Ex04_07_������ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i, v, temp, sum=0, max=0, min=0;
		int[] score = null;

		while(true) {


			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.print("��ȣ ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];

			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue; 
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
					System.out.println(i+1+"�� �л� ����:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.�м�");

				// ����, ���(�Ҽ����Ʒ� 2�ڸ�),�ִ밪, �ּҰ�
				// ���� 33,67,22,11 => 11,22,33,67
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���");
					continue; }

				for(i=0;i<score.length; i++) {
					sum=sum+score[i];
				}
				System.out.println("sum: "+sum);
				System.out.printf("avg: %.2f\n", (double)sum/score.length);

				for(i=0; i<score.length; i++) {
					max=score[0];
					min=score[0];
					if(max<score[i]) {max=score[i];}
					if(min>score[i]) {min=score[i];}
				}
				System.out.println("max: " +max);
				System.out.println("min: " +min);
				
				for(i=0; i<score.length; i++) {
					for(v=i+1; v<score.length-1; i++)
					if(score[i]>score[v]) {
						temp=score[i];
						score[v]=temp;
						score[i]=score[v];		
					}
					
				}//����for�ٱ���
				for(i=0;i<score.length;i++) {
					System.out.print(score[i] +" ");
				System.out.println();
				}
				
			} //else if4 �ٱ���
			
			else if(num==5) {
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


