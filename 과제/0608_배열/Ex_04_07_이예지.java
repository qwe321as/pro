import java.util.Scanner;

public class Ex_04_07_�̿��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sutNum,i,sum=0,t,j;
		int[] snum = null;
		while(true) {
			System.out.println("-------------------------------------");		
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����|");		
			System.out.println("-------------------------------------");		
			System.out.print("��ȣ�� �Է�>> ");
			num= sc.nextInt();
			if(num==1){
				System.out.print("�л��� �Է�>> ");
				sutNum=sc.nextInt();
				snum=new int[sutNum];
			}
			else if(num==2) {
				if(snum==null){
					System.out.println("1������ �Է����ּ���.");	
					//continue; (�̰ž��� else�Ƚᵵ��)
				}
				else {
					System.out.println("�����Է� ");
					for (i = 0; i < snum.length; i++) {
						System.out.print(i+1+"�� �л�����: ");
						snum[i]=sc.nextInt();
					}
				}
			}
			else if(num==3) {
				if(snum==null){
					System.out.println("1������ �Է����ּ���.");	
					continue; 
				}
				System.out.println("--�������--");
				for (i= 0; i < snum.length; i++) {
					System.out.println(i+1+"�� �л� "+snum[i]+"��");
				}
			}
			else if(num==4) {
				System.out.println("4.�м�");
				if(snum==null){
					System.out.println("1������ �Է����ּ���.");	
					continue; 
				}
				//����, ���, �ִ�, �ּڰ�, ����(��������)
				for (i = 0; i < snum.length; i++) {
					sum+=snum[i];					
				}
				System.out.println("����: "+sum);
				System.out.printf("�����: %.2f\n",(double)sum/snum.length);
				
				for (i = 0; i < snum.length; i++) {
					for (j = i+1; j < snum.length; j++) {
						if (snum[i]>snum[j]) {
							t=snum[i];
							snum[i]=snum[j];
							snum[j]=t;
						}
						System.out.println("�ּڰ�: "+snum[i]);}
					}
					for (i = 0; i < snum.length-1; i++) {
						for (j = i+1; j < snum.length; j++) {
							if (snum[i]>snum[j]) {
								t=snum[i];
								snum[i]=snum[j];
								snum[j]=t;
							}
						}
					}
					System.out.println("�ִ�: "+snum[i]);

					System.out.print("��������: ");
					for (i = 0; i < snum.length-1; i++) {
						for (j = i+1; j < snum.length; j++) {
							if (snum[i]>snum[j]) {
								t=snum[i];
								snum[i]=snum[j];
								snum[j]=t;
							}
						}
					}
					for (i = 0; i < snum.length; i++) {
						System.out.print(snum[i]+" ");
					}
					System.out.println();
//					System.out.print("��������: ");
//					for (i = 0; i < snum.length-1; i++) {
//						for (j = i+1; j < snum.length; j++) {
//							if (snum[i]>snum[j]) {
//								t=snum[i];
//								snum[i]=snum[j];
//								snum[j]=t;
//							}
//						}
//					}
					for (i = 0; i > snum.length; i++) {
						System.out.print(snum[i]+" ");
					}
					System.out.println();
				}			
			else if(num==5) {
				break;
			}
			else {
				System.out.println("1-5������ ��ȣ�� �Է°����մϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
