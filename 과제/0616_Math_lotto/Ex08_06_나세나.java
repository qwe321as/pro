

import java.util.Scanner;

public class Ex08_06_나세나 {

	public static void main(String[] args) {


		int[] lotto=new int[6];
		int[] my=new int[6];
		int i, j;
		int count=0;

		Scanner sc=new Scanner(System.in);



		//숫자 6개 입력하기
		System.out.println();
		for(i=0;i<6;i++) {

			System.out.print("숫자"+(i+1)+":");

			my[i]=sc.nextInt();

			if(my[i]>=46|my[i]<1) {
				i--;
				System.out.println("1~45까지의 숫자만 입력하세요");
				continue;

			}

			//중복 다시 입력하기
			for(j=0;j<i;j++) {
				if(my[i]==my[j]) {
					j--;
					System.out.println("중복입니다 다시 입력하세요");
					System.out.print("숫자"+(i+1)+":");

					my[i]=sc.nextInt(); 



				}//if
			}//for
		}
		System.out.println();
		System.out.print("입력한 로또번호:");

		//입력한 숫자 출력하기
		for(i=0;i<6;i++) {

			System.out.print(my[i]+" ");


		}
		System.out.println();
		System.out.print("이번주 로또 당첨 번호:");
		//1~45 숫자 랜덤으로 6개 출력하기
		for(i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;    //1~45 정수 나오게
			for(j=0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					j--;
					lotto[i]=(int)(Math.random()*45)+1;   
				}
			}
			System.out.print(lotto[i]+" ");

		}

		//입력한 숫자랑 랜덤 숫자 중복 개수 세기
		for(i=0;i<my.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(my[i]==lotto[j]) {
					count++;
				}
			}
		}

		//당첨결과
		System.out.println();
		System.out.println("당첨갯수(count):"+count);
		System.out.print("당첨결과:");
		if(count==6) {
			System.out.println("1등입니다");
		}else if(count==5) {
			System.out.println("2등입니다");
		}
		else if(count==4) {
			System.out.println("3등입니다");
		}else {
			System.out.println("꽝입니다");
		}

		System.out.println();







	}
}





//중복 다시 입력하세요 안내메시지 넣기
//6개 맞춤-1등
//5개 맞춤-2등
//4개 맞춤-3등
//3개이하-꽝