import java.util.Scanner;

public class Ex08_06_����� {
	public static void main(String[] args) {
		
		int[] lottonum=new int[6];
		int[] my=new int[6];
		int a,b,count=0;
		Scanner sc=new Scanner(System.in);
		for(a=0;a<6;a++) {
			lottonum[a]=(int)(Math.random()*45)+1; //1~45
			for(b=0;b<a;b++) {
				if(lottonum[a]==lottonum[b]) {
					b--;
					lottonum[a]=(int)(Math.random()*45)+1;
				}
			}
//			System.out.print(lottonum[a]+" ");
		}
//		System.out.println();

		for(a=0;a<6;a++) {
			System.out.print("����"+(a+1)+":");
			my[a]=sc.nextInt();
			while(my[a]>45) {
				System.out.println("1~45������ �� �Է��ϼ���.");
				System.out.println("����"+(a+1)+":");
				my[a]=sc.nextInt();
			}
			for(b=0;b<a;b++) {
				if(lottonum[a]==lottonum[b]) {
					System.out.println("�ߺ��� �ٽ� ����"+b+":");
					b--;
//					int c=sc.nextInt();
				}

			}


		}for(a=0;a<6;a++) {
			if(lottonum[a]==my[a]) {
				count++;
			}
		}


			System.out.print("���� �߻���Ų �ζ� ��ȣ"+" ");
			for(a=0;a<6;a++) {
				System.out.print(lottonum[a]+" ");
			}
			System.out.println();
			System.out.print("���� ������ �ζ� ��ȣ"+" ");
			for(a=0;a<6;a++) {
				System.out.print(my[a]+" ");
			}
			System.out.println();
			if(count>0) {
			System.out.print("���� ����:"+count+" ");
			}
			else {
			System.out.print("��!");
			}
		}

}


//����1: 3
//����2: 4
//����3: 12
//����4: 4
//�ߺ��� �ٽ� ����4: 12
//�ߺ��� �ٽ� ����4: 3
//�ߺ��� �ٽ� ����4: 43
//����5: 89
//1~45������ �� �Է��ϼ���.
//����5: 22
//����6: 33
//���� �߻���Ų �ζ� ��ȣ
//2 19 32 15 43 7 
//
//���� ������ �ζ� ��ȣ
//3 4 12 43 22 33 
//
//���� ���� : 1
//��!!




