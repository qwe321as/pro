import java.util.Scanner;

public class Ex08_06_이재혁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] my = new int[6];
		int i, j;
		int count = 0;

		for(i=0;i<lotto.length;i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();	
			//			중복걸러내기,1~45범위 초과 경고 
			if(my[i]<1||my[i]>45) {
				System.out.println("범위 밖의 숫자 입니다. 다시 입력하세요.");
				i--;
				continue;
			}
			for(j=0;j<i;j++) {
				if(my[j]==my[i]) {
					System.out.println("중복된 숫자입니다. 다시 입력하세요.");
					i--;
					break;
				}
			}
			
		}
		System.out.println("----내가 뽑은 번호----");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");	
		}


		System.out.println();
		System.out.println("======당첨번호======");
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45) + 1; // 1~45
			//			중복걸러내는 작업 여기서
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
			
		}
		for(i=0;i<lotto.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(lotto[i]==my[j]) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("맞은 갯수:"+count);
		if(count==6) System.out.println("1등");
		else if(count==5) System.out.println("2등");
		else if(count==4) System.out.println("3등");
		else if(count==3) System.out.println("4등");
		else System.out.println("꽝");
		

		//			결과물
		//			컴이 발생한 숫자
		//			0 0 0 0 0 0
		//			
		//			내가 선택한 숫자
		//			0 0 0 0 0 0
		//			
		//			맞은 갯수:0
		//			갯수별로 당첨or꽝 여부




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