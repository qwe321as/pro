import java.util.Scanner;

public class Ex08_06_�̼��� {
	public static void main(String[] args) {

		//1~45
		//		        int num1= (int)(Math.random()*45 +1);
		//���۰��� 1 �̴ϱ� +1�ϰ�
		//45-1 =44+1 �� ���Ѵ�
		//		       System.out.println(num1);

		int[] lotto = new int[6];   //��6��¥�� ������ ���� ��������
		int[] my = new int [6];     //���� �Է��� ���ڰ� �迭�� �� ��

		int i, j;
		boolean b= false;           //��
		Scanner sc = new Scanner(System.in);

		for(i=0; i<lotto.length; i++) {             //lotto�迭 :1~45�� ������ ��6���� ���ʴ�� ����

			lotto[i]= (int)(Math.random()*45 +1);

			for(j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					b = true;      //��
				}
			}
			if(b==true) {         //��
				i--;
				b=false;
				continue;
			}
			System.out.print(lotto[i]+" ");
		}

		System.out.println();
		for(i=0; i<lotto.length; i++) {   //my�迭 :���� �Է��� ���ڸ� �迭�� �־��
			System.out.printf("%d��° ���� �Է�:", i+1);
			my[i] = sc.nextInt();

			for(j=0; j<i; j++) {
				if(my[i]==my[j]) {
					System.out.println("�ߺ��� ���ڸ� �Է��ϼ̽��ϴ�.�ٽ�  �Է��ϼ���");
					i--;
					continue;
				}

			}
			if(my[i]>45) {
				System.out.println("1~45���ڸ� �Է��ϼ���");
				i--;                     //�ڡ�
			}
		}
		for(i=0; i<lotto.length; i++) {
			System.out.print(my[i]+" ");
		}

		int count =0;
		for(i=0; i<lotto.length; i++) {
			for(j=0; j<my.length; j++) {
				if(lotto[i]==my[j]) {
					count ++;
				}

			}//ifor
		}//ofor
		System.out.println();
		System.out.println("count:"+ count);

		if(count==6) {
			System.out.println("1���Դϴ�");
		}
		else if(count==5) {
			System.out.println("2���Դϴ�");
		}
		else if(count==4) {
			System.out.println("3���Դϴ�");
		}
		else if(count==3) {
			System.out.println("4���Դϴ�");
		}
		else {
			System.out.println("�� ������ȸ����");
		}








	}//m

}
