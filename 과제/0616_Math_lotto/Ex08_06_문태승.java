import java.util.Scanner;

public class Ex08_06_���½� {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] my = new int[6];
		int i,j;
		int count=0;
		Scanner sc = new Scanner(System.in);

		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1; // 1~45
			for (j=0;j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println("****��÷��ȣ*****");			// 1���ȣ Ȯ�ο�----����---
		//		for(i=0;i<lotto.length;i++) {			
		//			System.out.print(lotto[i]+" ");
		//
		//		}										// 1���ȣ Ȯ�ο�----��----

		for(i=0;i<6;i++) {
			System.out.print("����"+(i+1)+":");
			my[i] = sc.nextInt();

			if(my[i]>0 && my[i]<46) {}

			else {
				System.out.println("������ �Ѿ����ϴ�.");
				i--;
			}
			for (j = 0; j < i; j++) {
				if (my[i] == my[j]) { // �ߺ� Ȯ��
					System.out.println("�ߺ��Դϴ�.");
					i--;
				}

			}

		}
		System.out.print("�Է��� ����:");
		for (i = 0; i < 6; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println("****��÷��ȣ*****");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");

		}

		System.out.println();
		for(i = 0; i < 6; i++) {
			for(j = 0; j < 6; j++) {
				if (my[i] == lotto[j]) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("�� !");
		} else if (count == 1) {
			System.out.println("6�� !");
		} else if (count == 2) {
			System.out.println("5�� !");
		} else if (count == 3) {
			System.out.println("4�� !");
		} else if (count == 4) {
			System.out.println("3�� !");
		} else if (count == 5) {
			System.out.println("2�� !");
		} else if (count == 6) {
			System.out.println("1�� !");
		} else {
			System.err.println("���� !");
		}

	}

}




