import java.util.Scanner;

public class Ex08_06_김용주 {
	public static void main(String[] args) {
		
		int[] lottonum=new int[6];
		int[] my=new int[6];
		int a,b,count=0;
		Scanner sc=new Scanner(System.in);
		for(a=0;a<6;a++) {
			lottonum[a]=(int)(Math.random()*45)+1; //1~45
			for(b=0;b<a;b++) {
				if(lottonum[a]==lottonum[b]) {
					b--;
					lottonum[a]=(int)(Math.random()*45)+1;
				}
			}
//			System.out.print(lottonum[a]+" ");
		}
//		System.out.println();

		for(a=0;a<6;a++) {
			System.out.print("숫자"+(a+1)+":");
			my[a]=sc.nextInt();
			while(my[a]>45) {
				System.out.println("1~45사이의 수 입력하세요.");
				System.out.println("숫자"+(a+1)+":");
				my[a]=sc.nextInt();
			}
			for(b=0;b<a;b++) {
				if(lottonum[a]==lottonum[b]) {
					System.out.println("중복됨 다시 숫자"+b+":");
					b--;
//					int c=sc.nextInt();
				}

			}


		}for(a=0;a<6;a++) {
			if(lottonum[a]==my[a]) {
				count++;
			}
		}


			System.out.print("컴이 발생시킨 로또 번호"+" ");
			for(a=0;a<6;a++) {
				System.out.print(lottonum[a]+" ");
			}
			System.out.println();
			System.out.print("내가 선택한 로또 번호"+" ");
			for(a=0;a<6;a++) {
				System.out.print(my[a]+" ");
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




