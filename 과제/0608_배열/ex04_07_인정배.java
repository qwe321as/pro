import java.util.Scanner;

public class ex04_07_������ {
	public static void main(String[]args) {
		//
		Scanner sc = new Scanner(System.in);
		int max,min,num,i,sda,stunum=1,q,d;
		int[]score = null;

		q=0; 
		while(true){

			System.out.println("****************************************");
			System.out.println("1�л���|2.�����Է�|3.�������|4.�м�|5.����");
			System.out.println("****************************************");
			System.out.print("��ȣ����>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.�л���");
				stunum = sc.nextInt();

				score= new int[stunum];
				
			}else if (num==2) {
				System.out.println("2.�����Է�");
				if(score==null) {
					System.out.println("�ٽý���");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"���л� ����:");
					score[i] = sc.nextInt();
				}

			}else if (num==3) {
				if(score==null) {
					System.out.print("�ٽý���");
					continue;
				}
				System.out.println("3.�������");
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"���л� ����"+score[i] );
			
				}


			}else if (num==4) {
				System.out.println("4.�м�");
				if(score==null) {
					System.out.println("�ٽý���");
					continue;
				}
				for(d=0;d<score.length;d++) {
					q= q+score[d];
					
				}
				System.out.println("���:"+q/stunum);
				q=0; d=0;
				System.out.println("��������:");
				for(d=0;d<score.length-1;d++) {
					for(q=d+1;q<score.length;q++) {
						if(score[d]>score[q]) {
							sda=q;
							q=d;
							d=sda;
							System.out.print(score[d-1]+",");
						}
						
					}
				}
			System.out.println(1);
			System.out.println("�ִ밪:"+score[0]);
			System.out.println("�ּҰ�:"+score[stunum-1]);

			}else if (num==5) {
				System.out.println("5.����");
				if(score==null) {
					System.out.println("�ٽý���");
					continue;
				}
					break;
				}else{
					System.out.println("1~5 �������� ��ȣ�� �Է��ϼ���");
				}

			}


		
	}
	}
