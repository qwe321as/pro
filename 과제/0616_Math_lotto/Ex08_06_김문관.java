import java.util.Scanner;

public class Ex08_06_�蹮�� {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] my = new int[6];
		int count = 0;




		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}

		System.out.println("===========================");
		System.out.println("�ζ� ��ȣ�� �Է��ϼ���.");

		for(int i = 0; i < 6; i++) {
			System.out.print("����" + (i+1) + ":");
			
			my[i] = scan.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("45�� �ʰ� �� �� �����ϴ�.");
			}else if(my[i] == 0) {
				i--;
				System.out.println("�Է°��� 0���� Ŀ�� �մϴ�.");
			}else {
				for (int j = 0; j < i; j++) {
					if (my[i] == my[j]) {
						i--; 
						System.out.println("�ߺ� �� �� �����ϴ�.�ٽ� �Է��ϼ���");
					}
				}
			}
			
		}

		System.out.print("���� �Է��� ��ȣ�� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println("===========================");
		System.out.print("�ζ� ��÷ ��ȣ�� : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		System.out.println("===========================");
		count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (my[i] == lotto[j]) {
					count++;
				}
			}
		}

		if(count == 0) {
			System.out.println("0�� ���߼̽��ϴ�. �õ�");
		}else if(count == 1) {
			System.out.println("1�� ���߼̽��ϴ�. �õ�");
		}else if(count == 2) {
			System.out.println("2�� ���߼̽��ϴ�. 5��");
		}else if(count == 3) {
			System.out.println("3�� ���߼̽��ϴ�. 4��");
		}else if(count == 4) {
			System.out.println("4�� ���߼̽��ϴ�. 3��");
		}else if(count == 5) {
			System.out.println("5�� ���߼̽��ϴ�. 2��");
		}else if(count == 6) {
			System.out.println("6�� ���߼̽��ϴ�. 1��");
		}else {
			System.out.println("���� �ٽ� Ȯ�� �ϼ���.");
		}









	}

}
