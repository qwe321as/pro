
public class Ex03_13_±ÇÇö {
	public static void main(String[] args) {
		//1

		int i;
		int sum =0;

		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0)
			System.out.println(1+"~"+i+"="+sum);
		}

		
		
		System.out.println();
		//2
        sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
			System.out.println((i-9)+"~"+i+"="+sum);
			sum=i;
		}			
		}


	}

}
//1~10=55
//1~