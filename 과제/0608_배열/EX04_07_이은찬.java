import java.util.Scanner;

public class EX04_07_������{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,sum=0,max,min;
		
		
		
		int[] score = null; // score ����, null = �ƹ��͵� ������ ���ϴ� �ܾ��̹Ƿ� ���ڰ� �ƴϴ� ���� ""����
		while(true) {
			
	
		System.out.println("------------------------------------");
		System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
		System.out.println("------------------------------------");
		System.out.print("��ȣ ����>>");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.print("�л��� �Է�>>");
			stuNum = sc.nextInt();
			
			score = new int[stuNum]; //������ score�� ���� �����ϴ� ���̸� score �տ� int ����� ���� �߻� ���� ������ �ۼ�
			
		}
		else if(num==2) {
			System.out.println("2.�����Է�");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է����ּ���.");
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
				System.out.println("1�� �л��� ���� �Է����ּ���.");
				continue;
			}
			for(i=0;i<score.length;i++) {
			System.out.println(i+1+"�� �л� ����:"+score[i]);
			}
		}
		else if(num==4) {
			System.out.println("4.�м�");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է����ּ���.");
				continue;
			}
				
				for(i=0;i<score.length;i++) {
					sum += score[i];
				}
					System.out.println("����:"+sum);
					
					double avg = (double)sum/3;
					System.out.printf("���:%.2f",avg);
			
					max = score[0];
			        min = score[0];
					
			        for(i=1;i<score.length;i++) {
			        	
			        	if(max < score[i]) {
			        		max = score[i];
			        	}
			        	
			        	if(min > score[i]) {
			        		min = score[i];
			            }
			        }
					 
			        int temp;
					for(i=0;i<score.length-1;i++) {
						for(int j=i+1;j<score.length;j++) {
							if(score[i]>score[j]) {
								temp=score[i];
								score[i]=score[j];
								score[j]=temp;
							}
						}
					}
			        System.out.println("�ִ�����:" +max);
			        System.out.println("�ּ�����:" +min);
			        
				// ����, ��� (�Ҽ����Ʒ� 2�ڸ�), �ִ밪, �ּҰ�
				// ���� 33,67,22,11 => 11,22,33,67
			
		}
		else if(num==5) {
			System.out.println("5.����");
			break;
		}
		else {
			System.out.println("1~5 ������ ��ȣ�� �Է� �����մϴ�.");
		}
	}//while
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}

}
