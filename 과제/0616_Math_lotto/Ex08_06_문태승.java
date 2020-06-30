import java.util.Scanner;

public class Ex08_06_문태승 {
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
//		System.out.println("****당첨번호*****");			// 1등번호 확인용----시작---
		//		for(i=0;i<lotto.length;i++) {			
		//			System.out.print(lotto[i]+" ");
		//
		//		}										// 1등번호 확인용----끝----

		for(i=0;i<6;i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();

			if(my[i]>0 && my[i]<46) {}

			else {
				System.out.println("범위를 넘었습니다.");
				i--;
			}
			for (j = 0; j < i; j++) {
				if (my[i] == my[j]) { // 중복 확인
					System.out.println("중복입니다.");
					i--;
				}

			}

		}
		System.out.print("입력한 숫자:");
		for (i = 0; i < 6; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println("****당첨번호*****");
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
			System.out.println("꽝 !");
		} else if (count == 1) {
			System.out.println("6등 !");
		} else if (count == 2) {
			System.out.println("5등 !");
		} else if (count == 3) {
			System.out.println("4등 !");
		} else if (count == 4) {
			System.out.println("3등 !");
		} else if (count == 5) {
			System.out.println("2등 !");
		} else if (count == 6) {
			System.out.println("1등 !");
		} else {
			System.err.println("오류 !");
		}

	}

}




