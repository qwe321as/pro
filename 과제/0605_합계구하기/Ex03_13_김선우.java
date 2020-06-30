
public class Ex03_13_±è¼±¿ì {

	public static void main(String[] args) {

		
//		1~10=55
//		1~20=210
//		1~30=465
//		
//		1~10=55
//		11~20=155
//		21~30=255
		
		
		int i,sum=0,j,sum1=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println("1"+"~"+i+"="+sum);
			}
		}
		System.out.println();
		j=1;
		for(j=1;j<=100;j++) {
			sum1=sum1+j;
			if(j%10==0) {
			System.out.println((j-9)+"~"+j+"="+sum1);
			sum1=0;
			}
		}
		
		
	}

}
