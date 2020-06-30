import java.util.Scanner;

public class Ex08_06_허평강 {
	public static void main(String[] args) {

		//1~45

		int[] lotto  = new int[6];
		int[] my = new int[6];
		int i;
		int j;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for(i=0;i<6;i++) {
			lotto[i] =(int)(Math.random()*45) +1;
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45);
					j=-1;
				}
			}
		}
		System.out.println();
		for(i=0;i<lotto.length;i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();
		
			for(j=0;j<i;j++) {
				if(my[i]==my[j]) {
					System.out.println("중복됨 다시 입력"+(i+1)+":");
					my[i] = sc.nextInt();
					j=-1;
				}
			}
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45사이의 수 입력하세요");
				i--;
				continue;
			}
		}
		
		
		
		
		
		System.out.println("컴이 발생시킨 로또번호");
		for(i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("내가입력한 로또 번호");
		for(i=0;i<lotto.length;i++)
		{
			System.out.print(my[i]+" ");
		}
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
					
			}
		}
		System.out.println("맞은개수:"+count);
		
		switch(count) {
		case 6:System.out.println("1등"); 
		break;
		case 5:System.out.println("2등");
		break;
		case 4:System.out.println("3등");
		break;
		case 3:System.out.println("꽝");
		break;
		}
	}
}
