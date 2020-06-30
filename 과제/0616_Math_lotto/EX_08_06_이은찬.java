import java.util.Arrays;
import java.util.Scanner;

public class EX_08_06_이은찬 {
	public static void main(String[] args) {

		int[] lotto = new int[6]; 
		int[] my = new int [6];
		int i,j;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for(i=0;i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45)+1; // 1~45 44+1
			
			for(j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i]= (int)(Math.random()*45)+1;
					j=-1;				}
			}
		}// 첫 for 문
		System.out.print(lotto[i]+" ");
		
		//	System.out.println(num);

//		for(i=0;i<6;i++) {
//			System.out.print("숫자"+(i+1)+":");
//			my[i] = sc.nextInt();
//			if(my[i]<1 || my[i]>45){
//				System.out.println("1~45의 숫자만 입력 가능합니다.");
//				i--;
//				continue;
//			}
//
//			for(j=0;j<i;j++) {
//				if(my[i] == my[j]) {
//					System.out.println("중복된 숫자 입니다.");
//					i--;
//					continue;
//				}
//			}
//		}
//		//			// 1~45의 숫자만 입력 가능합니다.
//		//			// 중복된 숫자를 입력했습니다.다시 입력해주세요.
//
//		for(i=0;i<6;i++) {
//			if(my[i] == lotto[i]) {
//				count += 1; // count = count + 1
//				System.out.print(my[i]+" ");
//				
//			}Arrays.sort(my);
//			
//			if(count == 0) {
//				System.out.println("꽝 입니다!");
//			}else if(count == 1) {
//				System.out.println("6등 입니다.");
//			}else if (count == 2) {
//				System.out.println("5등 입니다.");
//			}else if (count == 3) {
//				System.out.println("4등 입니다.");
//			}else if(count == 4) {
//				System.out.println("3등 입니다.");
//			}else if(count == 5) {
//				System.out.println("2등 입니다.");
//			}else if(count == 6) {
//				System.out.println("축하합니다 1등입니다!!");
//			}
			
			// count = 0, 맞출때마다 카운트 1개씩 증가
			// 6개 = 1등, 5개 = 2등, 4개=3등
//		}
	}// main
}// class

