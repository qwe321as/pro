import static java.lang.Math.*;

import java.util.Scanner;
public class Ex08_06_�ڱ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lotto[] = new int[6];
		int count = 0;
		int i;
		int j;
		int[] my = new int[6];
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(random()*45)+1;  //1~45
			for(j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}

		System.out.println();
		for(i=0; i<6; i++) {
			System.out.print("���� �Է�"+(i+1)+":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("45�� �ʰ� �� �� �����ϴ�.");
			}else if(my[i] == 0) {
				i--;
				System.out.println("0�� �Է� �Ͻ� �� �����ϴ�.");
			}else {
				for(j = 0; j < i; j++) {
					if(my[i] == my[j]) {
						i--;
						System.out.println("�ߺ� �� �� �����ϴ�. �ٽ� �Է����ּ���.");
					}
				}
			}
		}
		System.out.println("���� ������ �ζ� ��ȣ");
		for(i=0;i<6;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("========================");

		System.out.println("��ǻ�Ͱ� ���� �ζ� ��ȣ");
		for(i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		for(i = 0; i < 6; i++) {
			for(j=0; j < 6; j++) {
				if(my[i] == lotto[j]) {
					count++;
				}
			}//���� for��

		}//�ٱ��� for��

		System.out.println();
		
		if(count == 0) {
			System.out.println("0�� ���߼̽��ϴ�.");
		}else if(count == 1) {
			System.out.println("1�� ���߼̽��ϴ�.");
		}else if(count == 2) {
			System.out.println("2�� ���߼̽��ϴ�.");
		}else if(count == 3) {
			System.out.println("3�� ���߼̽��ϴ�.");
		}else if(count == 4) {
			System.out.println("4�� ���߼̽��ϴ�.");
		}else if(count == 5) {
			System.out.println("5�� ���߼̽��ϴ�.");
		}else if(count == 6) {
			System.out.println("6�� ���߼̽��ϴ�.");
		}else {
			System.out.println("�����߻� ���� Ȯ�� �ϼ���");
		}





		// �ߺ� ����
		// ���� ���� ���Է�
		// ī��Ʈ ��¾Ҵ���

	}

}
