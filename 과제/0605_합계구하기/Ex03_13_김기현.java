
public class Ex03_13_±è±âÇö {

	public static void main(String[] args) {
		//for(1~100)1-10,1-20,...... , for(1~100) 1-10,11,20....


		int i;
		int sum = 0;
		for(i=1;i<=100;i++) {
			sum = sum + i;
			if(i%10==0)
				System.out.println(1 + "~" + i + "=" + sum);
		}
		System.out.println();
		
			
		
			
		
		sum = 0;
		
		for(i=1;i<=100;i++) {
			sum = sum + i;
			
			if(i%10==0) {
				
			System.out.println((i-9) + "~" + i + "=" + sum);			
			sum = 0;
			}
			
				
			
		}
			
			
			
			
		
		

		

		





	}
}

