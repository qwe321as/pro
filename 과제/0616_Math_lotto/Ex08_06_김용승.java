import java.util.Scanner;

public class Ex08_06_김용승 {
	public static void main(String[] args) {
		int i,j,count=0;
		int[] lotto = new int[6];
		int[] my = new int[6];

		Scanner sc = new Scanner(System.in);
		lotto[0] = (int)(Math.random()*45)+1;

		for(i=1;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i=i-1;
				}
			}
		}

		for(i=0;i<my.length;i++) {
			System.out.print("숫자("+(i+1)+"):");
			my[i] = sc.nextInt();
			if(my[i]<1||my[i]>45) {
				System.out.println("1~45사이의 숫자 입력하세요.");
				i=i-1;
			}
			else {
				for(j=0;j<i;j++) {
					if(my[i]==my[j]) {
						System.out.println("이전 숫자와 중복됨. 재입력하세요.");
						i=i-1;
					}
				}
			}
		}
		System.out.println();
		for(j=0;j<6;j++) {
			for(i=0;i<6;i++) {
				if(lotto[j]==my[i]) {
					count++;
				}
			}
		}
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		System.out.println("내가 선택한 로또 번호");
		for(i=0;i<6;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("맞은 개수 : "+count);
		if(count==6) System.out.println("1등!!");
		else if(count==5) System.out.println("2등!!");
		else if(count==4) System.out.println("3등!!");
		else System.out.println("꽝!!");
	}
}
