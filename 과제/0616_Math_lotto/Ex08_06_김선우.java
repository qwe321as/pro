import java.util.Scanner;

public class Ex08_06_김선우_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i,j;
		int [] lotto=new int[6];
		int [] my = new int[6];
		int count=0;


		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}
		


		for(i=0;i<6;i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();
			if(my[i] > 45) {
				i--;
				System.out.println("1~45사이의 수 입력하세요.");
			}else if(my[i] == 0) {
				i--;
				System.out.println("입력 값은 0이 될 수 없습니다.");
			}else {
				for(j=0;j<i;j++) {
					if (my[i]==my[j]) {
						i--;
						System.out.println("중복됨 다시");
					}
				}

			}

		}
		System.out.println("내가 선택한 로또 번호");
		for(i=0;i<my.length;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();

		System.out.println("컴퓨터가 뽑은 로또 번호는");
		for(i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		System.out.println();



		for(i=0;i<6;i++) {
			for (j=0;j<6;j++) {
				if(lotto[i]==my[j]) {
					count++;
				}
			}
		}
		switch(count) {
		case 6 : System.out.println("1등");
		break;
		case 5 : System.out.println("2등");
		break;
		case 4 : System.out.println("3등");
		break;
		default: System.out.println("꽝");
		break;
		}
//		if(count==0) {
//			System.out.println("꽝!!!");
//		}
//		else if(count==1) {
//			System.out.println("꽝!!!");
//		}
//		else if(count==2) {
//			System.out.println("꽝!!!");
//		}
//		else if(count==3) {
//			System.out.println("4등!!!");
//		}
//		else if(count==4) {
//			System.out.println("3등!!!");
//		}
//		else if(count==5) {
//			System.out.println("2등!!!");
//		}
//		else if(count==6) {
//			System.out.println("1등!!!");
//		}else {
//			System.out.println("오류 입니다.");
//		}

	}

}
//숫자1: 3
//숫자2: 4
//숫자3: 12
//숫자4: 4
//중복됨 다시 숫자4: 12
//중복됨 다시 숫자4: 3
//중복됨 다시 숫자4: 43
//숫자5: 89
//1~45사이의 수 입력하세요.
//숫자5: 22
//숫자6: 33
//컴이 발생시킨 로또 번호
//2 19 32 15 43 7 
//
//내가 선택한 로또 번호
//3 4 12 43 22 33 
//
//맞은 갯수 : 1
//꽝!!
