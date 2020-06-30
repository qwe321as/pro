
public class Ex03_13_±è¿ë½Â {
	public static void main(String[] args) {
		
		// 1~10 / 11~20 / 
		int i,sum1=0;
		
		
		for(i=1;i<=100;i++) {
			sum1=sum1+i;
			if(i%10==0) {
				System.out.println("1~"+i+"="+sum1);
			}
		}
		System.out.println();
		
		/*
		int j;
		for(i=0;i<=9;i++) {
			sum1=0;
			for(j=1;j<=10;j++) {
				sum1 = sum1 +(i*10)+j;
			}
			System.out.println((i*10+1)+"+"+((i+1)*10)+"="+sum1);
		}
		System.out.println();
		*/
		
		
		sum1=0;
		for(i=1;i<=100;i++) {
			sum1=sum1+i;
			if(i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum1);
				sum1 = 0;
			}
		}
		
	} //main 
} // class
 
