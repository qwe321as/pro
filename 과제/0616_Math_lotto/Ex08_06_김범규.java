import java.util.*;

public class Ex08_06_����� {

	public static void main(String[] args) {

		//		1~45
		int i,j;
		int count=0;
		int[] lotto = new int[6];
		int[] my = new int[6];

		Scanner sc = new Scanner(System.in);


		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}
		System.out.println("�ζ� ��ȣ�� �Է��ϼ���.");

		for(i = 0; i < 6; i++) {
			System.out.print("����" + (i+1) + ":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("45�� �ʰ� �� �� �����ϴ�.");
			}
			else if(my[i] == 0) {
				i--;
				System.out.println("�Է°��� 0���� Ŀ�� �մϴ�.");
			}
			else {
				for (j = 0; j < i; j++) {
					if (my[i] == my[j]) {
						i--; 
						System.out.println("�ߺ��Դϴ�.�ٽ� �Է��ϼ���");
					}
				}
			}

		}

		System.out.print("���� �Է��� ��ȣ�� : ");
		for(i = 0; i < 6; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.print("�ζ� ��÷ ��ȣ�� : ");
		for (i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

		System.out.println();
		count = 0;
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (my[i] == lotto[j]) {
					count++;
				}
			}
		}

		if(count == 0) {
			System.out.println("0�� ���߼̽��ϴ�.");
		}
		else if(count == 1) {
			System.out.println("1�� ���߼̽��ϴ�.");
		}
		else if(count == 2) {
			System.out.println("2�� ���߼̽��ϴ�.");
		}
		else if(count == 3) {
			System.out.println("3�� ���߼̽��ϴ�.");
		}
		else if(count == 4) {
			System.out.println("4�� ���߼̽��ϴ�.");
		}
		else if(count == 5) {
			System.out.println("5�� ���߼̽��ϴ�.");
		}
		else if(count == 6) {
			System.out.println("6�� ���߼̽��ϴ�.");
		}
		else {
			System.out.println("���� �ٽ� Ȯ�� �ϼ���.");
		}




	}

}
