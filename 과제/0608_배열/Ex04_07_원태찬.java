import java.util.Scanner;

public class Ex04_07_������ {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);                           //�� ����
		int num,stuNum,i=0,sum=0,max=0,min=0,j,temp;
		double avg=0;
		int[] score = null;                                //�迭 �ʱⰪ,null�� �ƹ��͵� ���ٴ� ��
		while(true) {
			
		System.out.println("----------------------------------");
		System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����");
		System.out.println("----------------------------------");
		System.out.print("��ȣ ����>>");
		num=sc.nextInt();                           //while+�Է¹�(sc.nextInt()) -> �Է¹� �ݺ�, �������� break
		
		if(num==1) {
			System.out.print("�л��� �Է�>>");
			stuNum=sc.nextInt();
			score=new int[stuNum];                  //�Է¹�(sc.nextInt())�� �迭 -> �迭 �Է�
		}
		else if(num==2) {
			System.out.println("2.�����Է�");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է��ϼ���");
				continue;                             //continue�� �������� ���ϰ� ��. �׸��� ���� �ݺ��� ���ǽ����� ��.
			}
			for(i=0;i<score.length;i++) {             //���⼭ score�� num==1������ ��ȣ������ int�� ��밡��. ���� ��ü�� int������ ����.  
			System.out.print(i+1+"�� �л� ����:");
				score[i]=sc.nextInt();
			}
		}
		else if(num==3) {
			System.out.println("3.�������");
			if(score==null) {
				System.out.println("1�� �л��� ���� �Է��ϼ���");
			continue;}
			for(i=0;i<score.length;i++) {
				System.out.println(i+1+"�� �л� ����:"+score[i]);
			}
		}
		else if(num==4) {
			System.out.println("4.�м�");
			for(i=0;i<score.length;i++) {
			sum=sum+score[i];
			avg=(double)sum/score.length;
			}
			max=score[0];
			min=score[0];
			for(i=1;i<=score.length-1;i++) {
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];
			}
			}
			
			
				System.out.printf("sum:%d avg:%.2f max:%d min:%d",sum,avg,max,min);
				for(i=0;i<=score.length-2;i++) {              //ex: score.length-2 3
					for(j=i+1;j<=score.length-1;j++) {        //ex: score.length-1 4
						if(score[i]>score[j]) {
							temp=score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				} System.out.println();
				for(j=0;j<=score.length-1;j++) {              //ex: score.length=5
				System.out.print(score[j]+" ");
				}
 	}
		
	
		
		else if(num==5) {
			System.out.println("5.����");
			break;
		}
		else {
			System.out.println("1~5������ ��ȣ�� �Է°����մϴ�.");
		}
		
		
		}//while
		System.out.println("���α׷��� �����մϴ�.");
	}

}
