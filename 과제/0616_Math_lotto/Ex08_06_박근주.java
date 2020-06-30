import static java.lang.Math.*;

import java.util.Scanner;
public class Ex08_06_박근주 {

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
			System.out.print("숫자 입력"+(i+1)+":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("45를 초과 할 수 없습니다.");
			}else if(my[i] == 0) {
				i--;
				System.out.println("0을 입력 하실 수 없습니다.");
			}else {
				for(j = 0; j < i; j++) {
					if(my[i] == my[j]) {
						i--;
						System.out.println("중복 될 수 없습니다. 다시 입력해주세요.");
					}
				}
			}
		}
		System.out.println("내가 선택한 로또 번호");
		for(i=0;i<6;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("========================");

		System.out.println("컴퓨터가 뽑은 로또 번호");
		for(i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		for(i = 0; i < 6; i++) {
			for(j=0; j < 6; j++) {
				if(my[i] == lotto[j]) {
					count++;
				}
			}//안쪽 for문

		}//바깥쪽 for문

		System.out.println();
		
		if(count == 0) {
			System.out.println("0개 맞추셨습니다.");
		}else if(count == 1) {
			System.out.println("1개 맞추셨습니다.");
		}else if(count == 2) {
			System.out.println("2개 맞추셨습니다.");
		}else if(count == 3) {
			System.out.println("3개 맞추셨습니다.");
		}else if(count == 4) {
			System.out.println("4개 맞추셨습니다.");
		}else if(count == 5) {
			System.out.println("5개 맞추셨습니다.");
		}else if(count == 6) {
			System.out.println("6개 맞추셨습니다.");
		}else {
			System.out.println("에러발생 값을 확인 하세요");
		}





		// 중복 제거
		// 오버 숫자 재입력
		// 카운트 몇개맞았는지

	}

}
