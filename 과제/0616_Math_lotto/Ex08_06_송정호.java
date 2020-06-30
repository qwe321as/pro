import java.util.Scanner;

public class Ex08_06_����ȣ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lotto[] = new int[6];
		int my[] = new int[6];
		int count = 0;
		boolean over = false;

		for(int i = 0; i < lotto.length; i++) {

			lotto[i] = (int)(Math.random() * 45) + 1;		// 1~45

			if(i > 0) {

				for(int j = i; j >= 1; j--) {

					if(lotto[i] == lotto[j - 1]) {

						over = true;
					}
				}
			}

			if(over) {
				i--;
				over = false;
				continue;
			}

//			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		for(int i = 0; i < my.length; i++) {

			System.out.print("���� " + (i + 1) + " : ");
			my[i] = sc.nextInt();

			if(my[i] < 1 || my[i] > 45) {
				System.out.println("���� ���� ���� �Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
				continue;
			}

			if(i > 0) {

				for(int j = i; j >= 1; j--) {

					if(my[i] == my[j - 1]) {

						over = true;
						System.out.println("�ߺ��� �����Դϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			}

			if(over) {
				i--;
				over = false;
				continue;
			}
		}

		for(int i = 0; i < my.length; i++) {

			System.out.print(my[i] + " ");
		}

		for(int i = 0; i < lotto.length; i++) {

			for(int j = 0; j < my.length; j++) {

				if(lotto[i] == my[j]) {

					count++;
				}
			}
		}
		
		if(count < 3) {
			System.out.println("\n��! " + count + " �� �¾ҽ��ϴ�.");
		}
		else if(count >= 3) {
			System.out.println("\n��÷! " + count + " �� �¾ҽ��ϴ�.");
		}
	}

}
