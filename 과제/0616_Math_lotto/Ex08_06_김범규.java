import java.util.*;

public class Ex08_06_김범규 {

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
		System.out.println("로또 번호를 입력하세요.");

		for(i = 0; i < 6; i++) {
			System.out.print("숫자" + (i+1) + ":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("45를 초과 할 수 없습니다.");
			}
			else if(my[i] == 0) {
				i--;
				System.out.println("입력값은 0보다 커야 합니다.");
			}
			else {
				for (j = 0; j < i; j++) {
					if (my[i] == my[j]) {
						i--; 
						System.out.println("중복입니다.다시 입력하세요");
					}
				}
			}

		}

		System.out.print("내가 입력한 번호는 : ");
		for(i = 0; i < 6; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.print("로또 당첨 번호는 : ");
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
			System.out.println("0개 맞추셨습니다.");
		}
		else if(count == 1) {
			System.out.println("1개 맞추셨습니다.");
		}
		else if(count == 2) {
			System.out.println("2개 맞추셨습니다.");
		}
		else if(count == 3) {
			System.out.println("3개 맞추셨습니다.");
		}
		else if(count == 4) {
			System.out.println("4개 맞추셨습니다.");
		}
		else if(count == 5) {
			System.out.println("5개 맞추셨습니다.");
		}
		else if(count == 6) {
			System.out.println("6개 맞추셨습니다.");
		}
		else {
			System.out.println("값을 다시 확인 하세요.");
		}




	}

}
