import java.util.Scanner;

public class Ex08_06_������ {

	public static void main(String[] args) {
		int[] lotto=new int[6];
		int[] my=new int[6];
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1; //1~45
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					j--;
					lotto[i]=(int)(Math.random()*45)+1;
				}
			}
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		for(i=0;i<6;i++) {
			System.out.print("����"+(i+1)+":");
			my[i]=sc.nextInt();
			while(my[i]>45) {
				System.out.println("1~45������ �� �Է��ϼ���.");
				System.out.println("����"+(i+1)+":");
				my[i]=sc.nextInt();
			}
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("�ߺ��� �ٽ� ����"+j+":");
					j--;
					int a=sc.nextInt();
				}

			}


		}for(i=0;i<6;i++) {
			if(lotto[i]==my[i]) {
				count++;
			}
		}


			System.out.print("���� �߻���Ų �ζ� ��ȣ"+" ");
			for(i=0;i<6;i++) {
				System.out.print(lotto[i]+" ");
			}
			System.out.println();
			System.out.print("���� ������ �ζ� ��ȣ"+" ");
			for(i=0;i<6;i++) {
				System.out.print(my[i]+" ");
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

	//�ߺ��� �ٽ� ����4: 43
	//����5 : 89
	//1~45������ �� �Է��ϼ���.
	//����5: 22
	//����6: 33
	//���� �߻���Ų �ζ� ��ȣ
	//2 19 32 15 43 7
	//���� ������ �ζ� ��ȣ
	//3 4 12 43 22 33
	//���� ����:1
	//��!
