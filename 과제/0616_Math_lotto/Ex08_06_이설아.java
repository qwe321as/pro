import java.util.Scanner;

public class Ex08_06_이설아 {
	public static void main(String[] args) {

		//1~45
		//		        int num1= (int)(Math.random()*45 +1);
		//시작값이 1 이니깐 +1하고
		//45-1 =44+1 를 곱한다
		//		       System.out.println(num1);

		int[] lotto = new int[6];   //방6개짜리 공간을 먼저 만들어놓음
		int[] my = new int [6];     //내가 입력한 숫자가 배열에 들어갈 것

		int i, j;
		boolean b= false;           //☆
		Scanner sc = new Scanner(System.in);

		for(i=0; i<lotto.length; i++) {             //lotto배열 :1~45의 난수를 방6개에 차례대로 넣음

			lotto[i]= (int)(Math.random()*45 +1);

			for(j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					b = true;      //☆
				}
			}
			if(b==true) {         //☆
				i--;
				b=false;
				continue;
			}
			System.out.print(lotto[i]+" ");
		}

		System.out.println();
		for(i=0; i<lotto.length; i++) {   //my배열 :내가 입력한 숫자를 배열에 넣어보자
			System.out.printf("%d번째 숫자 입력:", i+1);
			my[i] = sc.nextInt();

			for(j=0; j<i; j++) {
				if(my[i]==my[j]) {
					System.out.println("중복된 숫자를 입력하셨습니다.다시  입력하세요");
					i--;
					continue;
				}

			}
			if(my[i]>45) {
				System.out.println("1~45숫자만 입력하세요");
				i--;                     //★☆
			}
		}
		for(i=0; i<lotto.length; i++) {
			System.out.print(my[i]+" ");
		}

		int count =0;
		for(i=0; i<lotto.length; i++) {
			for(j=0; j<my.length; j++) {
				if(lotto[i]==my[j]) {
					count ++;
				}

			}//ifor
		}//ofor
		System.out.println();
		System.out.println("count:"+ count);

		if(count==6) {
			System.out.println("1등입니다");
		}
		else if(count==5) {
			System.out.println("2등입니다");
		}
		else if(count==4) {
			System.out.println("3등입니다");
		}
		else if(count==3) {
			System.out.println("4등입니다");
		}
		else {
			System.out.println("꽝 다음기회에☆");
		}








	}//m

}
