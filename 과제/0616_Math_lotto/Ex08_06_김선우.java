import java.util.Scanner;

public class Ex08_06_�輱��_�ζ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i,j;
		int [] lotto=new int[6];
		int [] my = new int[6];
		int count=0;


		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}
		


		for(i=0;i<6;i++) {
			System.out.print("����"+(i+1)+":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("1~45������ �� �Է��ϼ���.");
			}else if(my[i] == 0) {
				i--;
				System.out.println("�Է� ���� 0�� �� �� �����ϴ�.");
			}else {
				for(j=0;j<i;j++) {
					if (my[i]==my[j]) {
						i--;
						System.out.println("�ߺ��� �ٽ�");
					}
				}

			}

		}
		System.out.println("���� ������ �ζ� ��ȣ");
		for(i=0;i<my.length;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();

		System.out.println("��ǻ�Ͱ� ���� �ζ� ��ȣ��");
		for(i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		System.out.println();



		for(i=0;i<6;i++) {
			for (j=0;j<6;j++) {
				if(lotto[i]==my[j]) {
					count++;
				}
			}
		}
		switch(count) {
		case 6 : System.out.println("1��");
		break;
		case 5 : System.out.println("2��");
		break;
		case 4 : System.out.println("3��");
		break;
		default: System.out.println("��");
		break;
		}
//		if(count==0) {
//			System.out.println("��!!!");
//		}
//		else if(count==1) {
//			System.out.println("��!!!");
//		}
//		else if(count==2) {
//			System.out.println("��!!!");
//		}
//		else if(count==3) {
//			System.out.println("4��!!!");
//		}
//		else if(count==4) {
//			System.out.println("3��!!!");
//		}
//		else if(count==5) {
//			System.out.println("2��!!!");
//		}
//		else if(count==6) {
//			System.out.println("1��!!!");
//		}else {
//			System.out.println("���� �Դϴ�.");
//		}

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
