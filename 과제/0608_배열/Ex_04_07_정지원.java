import java.util.Scanner;

public class Ex_04_07_������ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,stuNum,i;//2��° �ܾ� ù��°�� �빮�ڸ� �̿���
		int[] score=null;//�ƹ��͵��ƴ� ���� �־���
		int max,min,j,temp;
		int sum=0;
		while(true) {


			System.out.println("----------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("----------------------------");
			System.out.println("��ȣ����>>");
			num =sc.nextInt();
			if(num==1) {
				System.out.print("1.�л��� �Է�");
				stuNum=sc.nextInt();
				score=new int[stuNum];





			}
			else if(num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;//while �Ŀ����� ���ǽ����� ����.
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:");
					score[i]=sc.nextInt();
				}
			}

			else if(num==3) {
				System.out.println("3.�������");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л� ����:"+score[i]);
				}


			}
			else if(num==4) {
				System.out.println("4.�м�");
				if(score==null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���.");
					continue;
				}
				//���(�Ҽ����Ʒ� 2�ڸ�),�ִ밪,�ּҰ�
				//���� 33,67,22,11=>11,22,33,67
				max=score[0];
				for(i=1;i<score.length;i++) {
					if(max< score[i]) {
						max=score[i];
					}

				}
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(min>score[i]) {
						min=score[i];
					}
				}
				System.out.println("max:"+max);
				System.out.println("min:"+min);


				for(i=0;i<score.length;i++) {
					System.out.println(score[i]+" ");
					sum=sum+score[i];
				}


				System.out.println();
				System.out.println("����:"+sum);
				System.out.printf("���:%.2f", (float)sum/score.length);


				System.out.println();
				int arr[]= {33,67,22,11};
				for(i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				for(i=0;i<4;i++) {
					for(j=i+1;j<5;j++) {
						if(arr[i]>arr[j]) {
							temp = arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}

					}


				}
				System.out.println();
				for(i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
			}

				else if(num==5) {
					System.out.println("5.����");
					break;}
				else {
					System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
				}



			}
			System.out.println("���α׷��� �����մϴ�.");


		}
	
}



