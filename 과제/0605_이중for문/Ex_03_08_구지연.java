package 연습;

public class 과제 {
	public static void main(String[] args) {
	
		
		
		
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
	
		
		
		
		
		
		
		int sum=0;
		int i,j ;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println("1 ~"+i+"="+(sum));
			}
		}
		
		
	}
}
