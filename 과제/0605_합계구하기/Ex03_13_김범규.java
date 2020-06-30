
public class Ex03_13_김범규 {

	public static void main(String[] args) {
		
		// 1~10=55 1~20=210 .. 100까지합계, 10의 배수가됐을때 합계 출력
		
		int i,sum;
		sum = 0;
			
			for(i=1;i<=100;i++) {
				sum=sum+i;
				if(i%10==0)
				
					System.out.println("1"+"~"+i+"="+sum);
				
				
			}
			
			
		
		// 1~10=55 11~20=155....100까지합계, 
			
		
		sum=0; 
		
			for(i=1;i<=100;i++) {
				sum=sum+i;
				if(i%10 == 0) {
				
					System.out.println(i-9 + "~" + i + "=" +sum);
					
				 	sum = 0;
				}
					
			}


	}

}
