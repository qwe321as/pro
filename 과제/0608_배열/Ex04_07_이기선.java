import java.util.Scanner;

public class Ex04_07_�̱⼱ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		int num=0,total=0;
		double avg=0;
		int max=0, min=0;
		
		int sel ;
		while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�л���:2.�����Է�:3.�������:4.�м�:5.����");
			System.out.println("-------------------------------------------------------");
			System.out.println("��ȣ����>>>-");
			sel = sc.nextInt();
			switch(sel) {
			case 1 :
				if(num !=0) {
					System.out.println("You are already having Student number. ("+num+")");
					break;
				}
				System.out.println("1. �л���");
				num = sc.nextInt();
				score = new int[num];
				break;
			case 2:
				System.out.println("2.�����Է�");
				if(num==0) {
					System.out.println("You must input your student Number.");
					break;
				}
				for(int i1 = 0 ; i1 < num ; i1++) {
					System.out.print("Input Score "+(i1+1)+" : ");
					score[i1] = sc.nextInt();
					System.out.println((i1+1)+"th Student Score : "+score[i1]);					
				}
				break;
			case 3:
				if(num==0) {
					System.out.println("You must input your student Number.");
					break;
				}
				System.out.println("3.�������");
				for(int i = 0 ; i < num ; i++) {
					System.out.println((num-i)+" score : "+score[i]);
				}
				break;
			case 4:
				if(num==0) {
					System.out.println("You must input your student Number.");
					break;
				}
				if(score == null) {
					System.out.println("You must input your student Score.");
					break;
				}
				System.out.println("4.�м�");
//				����, ���(�Ҽ��� 2�ڸ�), ?�밪, �ּҰ�, ���� ���
				
				total=0 ;
				max = score[0];
				min = score[0];
				for(int i1 = 0 ; i1 < num ; i1++) {
					total = total + score[i1];
					if(max < score[i1] ) {
						max = score[i1];
					}
					if(min > score[i1]) {
						min = score[i1];
					}
				}
				avg = (double)total/num;
				int temp ; // insertion sort
				for(int i =0; i < num -1 ; i++) {
					for(int j= i+1; j < num ; j++) {
						if(score[i] > score[j]) {
							temp = score[i] ;
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				System.out.println(("Total Score : "+total));
				System.out.printf("Averge Score : %.2f \n",avg);
				System.out.println(("MAX Score : "+max));
				System.out.println(("MIN Score : "+min));
				for(int i = 0 ; i < num ; i++) {
					System.out.println((num-i)+" score : "+score[i]);
				}
				break;
			case 5:
//				if(num==0) {
//					System.out.println("You must input your student Number.");
//					break;
//				}
				System.out.println("5.����");
				break;
			default:
				System.out.println("Correct input");
				break;					
			}
			
			if(sel == 5) { 
				System.out.println("all exit");
				break;
			}			
		}
	}
}
