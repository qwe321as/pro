import java.util.Scanner;

public class Ex04_07_�̼��� {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num, stuNum, i,j, max, min, temp;
		int sum=0;
		int[] score = null;  //�ƹ��͵� �ƴ� ���� �־��ְڴ�. �ʱⰪ ���ٰ� ������ �߸�~ �ʱⰪ�� �־��ִ� ��
		
		while(true) {

			System.out.println("---------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("---------------------------------------");
			System.out.print("��ȣ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();
				score = new int [stuNum];  //�Է��� ���ڸ�ŭ ���� �������
			}
			else if(num==2) {
				System.out.println("���� �Է�>>");
				if(score==null) {     //score ���� ������  null �� �ִٸ�
					System.out.println("1�� �л������� �Է��ϼ���"); //score���� ������~
					continue;                                 //�Ʒ� for���� �ȸ����� �ؾ���
				}
				for(i=0; i<score.length ; i++) {
					System.out.print(i+1+"�� �л� ����: ");
					score[i]=sc.nextInt();
				}//for
			}
			else if(num==3) {
				System.out.println("�������>>");
			    if(score==null) {
			    	System.out.println("1�� �л������� �Է��ϼ���");
			    	continue;
			    }
				for(i=0;i<score.length;i++) {
					System.out.printf("%d�� �л� ����: %d\n",i+1,score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.�м�");
				//����, ���(�Ҽ���2), �ִ밪, �ּҰ�
				//����; ��������
				
				for(i=0;i<score.length;i++) {
					sum= sum+ score[i];
				}
				System.out.println("����:" + sum);
				System.out.printf("���:%.2f\n",(double)sum/score.length);
				
				max= score[0];
				min= score[0];
				for(i=0;i<score.length;i++) {
					
					if(max<score[i]) {
						max=score[i];
					}//if
					if(min>score[i]) {
						min=score[i];
					}//if
					
				}//for
				System.out.println("�ִ밪:"+max);
				System.out.println("�ּҰ�:"+min);
				
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<=score.length-1;j++) {
						if(score[i] > score[j]) {
							temp=score[j];
							score[j]=score[i];
							score[i]=temp;
						}//if
						
					}//ifor
				}//ofor
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				System.out.println();
				
				
			}//elseif
			else if(num==5) {
				System.out.println("5.����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է��� �����մϴ�.");
			}
		}//break������ while�� 
		System.out.println("���α׷��� �����մϴ�.");



	}//main

}
