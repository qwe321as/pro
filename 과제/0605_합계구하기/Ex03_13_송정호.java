
public class Ex03_13_º€¡§»£ {

	public static void main(String[] args) {

		int sum = 0;

		for(int i = 1; i <= 100; i++) {

			sum += i;
			
			if(i % 10 == 0) {
				
				System.out.println("1 ~ " + i + " = " + sum);
			}
		}
		
		System.out.println("-----------------");

		sum = 0;
		int start = 0;
		
		for(int i = 1; i <= 100; i++) {

			sum += i;
			
			if(i % 10 == 1) {
				
				start = i;
			}			
			
			if(i % 10 == 0) {
				
				System.out.println(start + " ~ " + i + " = " +sum);
				sum = 0;
				continue;
			}	
		}
	}
}


//1~10
//1~20
//:
//1~100


//1~10
//11~20
//:
//91~100