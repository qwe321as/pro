import java.util.Scanner;

public class Ex04_07_���� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, stuNum=0, sum=0;
		int[] score = null;
		int i, j;
		int max,min;
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("----------------------------------");
			
			System.out.print("��ȣ����>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("�л��� �Է�>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];
				
			}//if~1
			else if(num==2) {
				if(score==null) {
					System.out.println(">>�л������� �Է��ϼ���<<");
					continue;}
				System.out.println("�����Է�>>");
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"�� �л� ���� : ");
					score[i]=sc.nextInt();
				}
				
			}//if~2
			else if(num==3) {
				if(score==null) {
					System.out.println(">>�л������� �Է��ϼ���<<");
					continue;
					}
				System.out.println("3.�������");
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ���� : "+score[i]+"��");
				}
				
			}//if~3
			else if(num==4) {
				if(score==null) {
					System.out.println(">>�л������� �Է��ϼ���<<");
					continue;
					}
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
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+"�� ");
				}
				System.out.println();
				System.out.println(stuNum+"���� ���� ���� : "+sum+"��");
				System.out.printf("%d���� ���� ��� : %.2f��\n",stuNum,(float)sum/stuNum);
				System.out.printf("�ְ� ���� : %d�� / ���� ���� : %d��\n",max,min);
				
				
			}//if~4
			else if(num==5) {
				System.out.println("5.����");
				break;
			}//if~5
			else System.out.println("1~5 ������ ��ȣ�� �Է°����մϴ�.");
		}//while
		System.out.println("���α׷��� �����մϴ�.");
	}

}
