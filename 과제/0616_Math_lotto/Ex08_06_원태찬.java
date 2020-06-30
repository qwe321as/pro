import java.util.Scanner;

public class Ex08_06_원태찬 {

	public static void main(String[] args) {
		int[] lotto=new int[6];
		int[] my=new int[6];
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1; //1~45
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					j--;
					lotto[i]=(int)(Math.random()*45)+1;
				}
			}
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		for(i=0;i<6;i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i]=sc.nextInt();
			while(my[i]>45) {
				System.out.println("1~45사이의 수 입력하세요.");
				System.out.println("숫자"+(i+1)+":");
				my[i]=sc.nextInt();
			}
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("중복됨 다시 숫자"+j+":");
					j--;
					int a=sc.nextInt();
				}

			}


		}for(i=0;i<6;i++) {
			if(lotto[i]==my[i]) {
				count++;
			}
		}


			System.out.print("컴이 발생시킨 로또 번호"+" ");
			for(i=0;i<6;i++) {
				System.out.print(lotto[i]+" ");
			}
			System.out.println();
			System.out.print("내가 선택한 로또 번호"+" ");
			for(i=0;i<6;i++) {
				System.out.print(my[i]+" ");
			}
			System.out.println();
			if(count>0) {
			System.out.print("맞은 개수:"+count+" ");
			}
			else {
			System.out.print("꽝!");
			}
		}

	}

	//중복됨 다시 숫자4: 43
	//숫자5 : 89
	//1~45사이의 수 입력하세요.
	//숫자5: 22
	//숫자6: 33
	//컴이 발생시킨 로또 번호
	//2 19 32 15 43 7
	//내가 선택한 로또 번호
	//3 4 12 43 22 33
	//맞은 개수:1
	//꽝!
