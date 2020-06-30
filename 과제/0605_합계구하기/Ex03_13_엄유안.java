import java.util.Scanner;

public class Ex03_13_엄유안 {
	public static void main(String[]args) {

		//예제1
		Scanner sc = new Scanner(System.in);
		int a, b, sum=0;
		for(a=1; a<=1 ;a++) {
			for(b=1; b<=100; b++) {
				if(b%10 !=0)
					continue;
				sum = (1+b)*(b/2);
				System.out.println(a+"~"+b+"="+sum);
			}
		}
		System.out.println();

		//예제2
		int x, y, sum1=0, sum2=0, sum3=0;
		for (x=0; x<=9; x++) {
			for (y=1; y<=10; y++) {
				if(x<y-1) break;
				sum1=(10*y)+1;
				sum2=10*y; 
				sum3=(sum1+sum2)*5;	
			}
			System.out.println(sum1+"~"+sum2+"="+sum3);
		}

		
		System.out.println();

		//예제2-1
		int q, r, count=0, count1=0;
		for (q=0; q<=90; q++) {
			for (r=1; r<=100; r++) {
				
				count=(10*q)+1;
				count1=(count+r)*5;	
				System.out.println(count+"~"+r+"="+count1);
			}
		}
	}
}


	
	
	/*
	 * //10의 배수가 됐을때 그때까지의 합계가 한번씩 출력됨 
	 * 1~10=55 
	 * 1~20=210 
	 * .
	 * 1~100=5050
	 * 
	 * for (1~100)
	 * 
	 * 1~10=55 
	 * 11~20=155 
	 * 21~30=255 
	 * 91~100=
	 */

