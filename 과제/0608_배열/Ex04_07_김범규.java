import java.util.Scanner;

public class Ex04_07_����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,total = 0,j,max,min,temp;
		int[] score = null; // �ƹ��͵� �ƴѰ��� �־��ְڴ�. �迭���� null
		while(true) {
			

			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.println("��ȣ ����>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];
			}
			
			else if(num==2) {
				System.out.print("2. �����Է�\n");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue; // while������ ���ǽ� for�������� ������.
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����: ");
					score[i] = sc.nextInt(); 
				}
			}
			
			else if(num==3) {
				System.out.println("3. �������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:" +score[i]+"�� ");	
				}
			}
			//����, ���(�Ҽ����Ʒ� 2�ڸ�), �ִ밪, �ּҰ� 
			//���� 33,67,22,11 => 11,22,33,67
			else if(num==4) {
				System.out.println("4. �м�");
				for(i=0;i<score.length;i++) {
					total += score[i];				
				}
				
				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++) {
					if(max < score[i]){
						max = score[i];
					}
					else if(min > score[i]) {
						min = score[i];
					}
				}
				System.out.println("����: "+total);
				System.out.printf("���: %.2f\n",(double)total/score.length);
				System.out.println("�ִ밪: "+max);
				System.out.println("�ּҰ�: "+min);
				
				
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
					System.out.println();
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				
			}
			
			else if(num==5) {
				System.out.println("5. ����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
			}
		}//while
		System.out.println("���α׷��� �����մϴ�.");




	}//main

}//class
