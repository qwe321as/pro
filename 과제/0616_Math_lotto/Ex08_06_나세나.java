

import java.util.Scanner;

public class Ex08_06_������ {

	public static void main(String[] args) {


		int[] lotto=new int[6];
		int[] my=new int[6];
		int i, j;
		int count=0;

		Scanner sc=new Scanner(System.in);



		//���� 6�� �Է��ϱ�
		System.out.println();
		for(i=0;i<6;i++) {

			System.out.print("����"+(i+1)+":");

			my[i]=sc.nextInt();

			if(my[i]>=46|my[i]<1) {
				i--;
				System.out.println("1~45������ ���ڸ� �Է��ϼ���");
				continue;

			}

			//�ߺ� �ٽ� �Է��ϱ�
			for(j=0;j<i;j++) {
				if(my[i]==my[j]) {
					j--;
					System.out.println("�ߺ��Դϴ� �ٽ� �Է��ϼ���");
					System.out.print("����"+(i+1)+":");

					my[i]=sc.nextInt(); 



				}//if
			}//for
		}
		System.out.println();
		System.out.print("�Է��� �ζǹ�ȣ:");

		//�Է��� ���� ����ϱ�
		for(i=0;i<6;i++) {

			System.out.print(my[i]+" ");


		}
		System.out.println();
		System.out.print("�̹��� �ζ� ��÷ ��ȣ:");
		//1~45 ���� �������� 6�� ����ϱ�
		for(i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;    //1~45 ���� ������
			for(j=0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					j--;
					lotto[i]=(int)(Math.random()*45)+1;   
				}
			}
			System.out.print(lotto[i]+" ");

		}

		//�Է��� ���ڶ� ���� ���� �ߺ� ���� ����
		for(i=0;i<my.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(my[i]==lotto[j]) {
					count++;
				}
			}
		}

		//��÷���
		System.out.println();
		System.out.println("��÷����(count):"+count);
		System.out.print("��÷���:");
		if(count==6) {
			System.out.println("1���Դϴ�");
		}else if(count==5) {
			System.out.println("2���Դϴ�");
		}
		else if(count==4) {
			System.out.println("3���Դϴ�");
		}else {
			System.out.println("���Դϴ�");
		}

		System.out.println();







	}
}





//�ߺ� �ٽ� �Է��ϼ��� �ȳ��޽��� �ֱ�
//6�� ����-1��
//5�� ����-2��
//4�� ����-3��
//3������-��