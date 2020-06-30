import java.util.Scanner;

public class Ex_08_06_최지훈 {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[]	my = new int[6];
		int count = 0;
		
		for(i=0;i<lotto.length;i++) {
		lotto [i] = (int)(Math.random()*45)+1;
		
		   for(j=0;j<i;j++) {
			if(lotto[j]==lotto[i]) {
				i--;
				break;
			}
		}
		   
		} //중복제거하고 난수 생성
		
		
		
		
		for(i=0;i<lotto.length;i++) {
		System.out.print("숫자"+(i+1)+" ");
			my[i] =	sc.nextInt();
			if(my[i]>45) {
				System.out.println("1부터 45까지 수를 입력해주세요");
				--i; continue;
			}
			 for(j=0;j<i;j++) {
					if(my[i]==my[j]) {
						 System.out.println("중복입니다. : 다시"); --i;
						
					}
					 	
			}
			 
			
		}
		System.out.println("내가 만든 번호 : "+my[0]+" "+my[1]+" "+my[2]+" "+my[3]+" "+my[4]+" "+my[5]);
		System.out.println("*******************");
		System.out.println("컴퓨터가 만든번호 :"+ lotto[0]+" "+ lotto[1]+" "+ lotto[2]+" "+ lotto[3]+" "+ lotto[4]+" "+ lotto[5]+" ");
		
		int total=0;
		for(i=0;i<lotto.length;i++) {
		for(j=0;j<lotto.length;j++) {
			if(my[i]==lotto[i]) {
				total = total +1;
			}
			
		}
			}
		System.out.println("맞은 갯수는 :"+total);
		if(total==6) {
			System.out.println("1등입니다");
		}
		else if (total==5) {
			System.out.println("2등입니다");
		}
		else if (total==4) {
			System.out.println("3등입니다");
		}
		else if (total==3) {
			System.out.println("4등입니다");
		}
		else System.out.println("꽝입니다");
		
		
	}

}
