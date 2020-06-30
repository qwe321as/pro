
public class Ex03_13_양경원 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum +=i;
			if(i%10 == 0) {
				System.out.println(sum);
			}
		}	
		System.out.println("-------------------------절취선-------------------------");
		int sum1 = 0;
		for(int j = 1; j<=100; j++) {
			sum1 += j;
			if((j%10) == 0) {
				System.out.println(sum1);
				sum1 = 0;
			}
		}
	}
	
}
//1-10 /55
//1-20 /210
//1-100 /5050


