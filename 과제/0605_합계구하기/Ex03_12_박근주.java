
public class Ex03_12_�ڱ��� {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		
			// 1~10, 1~20, 1~30 
		for(i=1;i<=100;i++) {
			sum=sum+i;{
			if(i%10==0) 
				System.out.println("1~"+i+"�� ��:"+sum);	
				
			continue;
				}
		}
		System.out.println();
		
		int sum1=0; //1~10, 11~20, 21~30
		for(i=1;i<=100;i++) {
		sum1=sum1+i;
			if(i%10==0) { 
				
				
				System.out.println((i-9)+"~"+i+"�� ��:"+sum1);
				sum1=0;
			}
			
			
		}
// 1���� 10
// 11���� 20
	}

}
