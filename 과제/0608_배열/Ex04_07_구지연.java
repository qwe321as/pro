import java.util.Scanner;

public class Ex04_07_������ {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i, num, stuNum, sum=0, max, min, j, temp;
		int[]score = null; //null: "�ƹ��͵� ����"��� ��. int �� �׳� 0�� ���� ������, int[]�� �ּ��̱� ������  null�� �����. "null"�ƴ� ����!
		
		
		
		while(true) {
			System.out.println("----------------");
			System.out.println("1.�л���| 2.�����Է� | 3.�������| 4.�м� |5.����");
			System.out.println("----------------");
			System.out.print("��ȣ����>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];   //���� �������
			}
			else if(num==2 ) {
				System.out.print("�����Է�>>");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue; //������ ����������
					}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ����:");
					score[i] = sc.nextInt();  //score�� ���� �߰�ȣ���� �����ϸ� ���⼭ �ν��� ���� -> ������ int[] score; �� �ٽ� �����
				}
			}
			else if(num==3) {
				System.out.println("�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����: "+score[i]);
//					score[i] = sc.nextInt();
				}
			}
			else if(num==4) {
				System.out.println("�м�");
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
				}
				System.out.println("����:"+ sum);
				
				System.out.printf("%d/%d=%.2f",sum,score.length,(double)sum/score.length);
				
				max=score[0];
				for(i=1;i<score.length;i++) {
					if(max<score[i]) {
						max=score[i];
					}
				}
				System.out.println();
				System.out.println("�ִ밪 :" + max);
				
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(min>score[i]) {
						min = score[i];
					}
				}
				System.out.println("�ּҰ�:" +min);
				
				for(i=0;i<score.length;i++){
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] =score[i]; 
							score[i] = temp;
						}
						
					}
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i] + " ");
				}
				
				
				
				//����,���(�Ҽ����Ʒ� 2�ڸ�), �ִ밪, �ּҰ�
				//���ĵ� �ϱ�
			}
			else if(num==5) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("1~5������ ��ȣ�� �Է� �����մϴ�.");
			}
		
		
		}
			System.out.println("���α׷��� �����մϴ�.");  //break; ������ ����� ��
		
		
		
		
		
		
		
		
		
	}

}
