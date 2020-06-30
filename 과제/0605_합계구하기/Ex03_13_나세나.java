
public class Ex03_13_나세나 {

	public static void main(String[] args) {

		//1~10, 1~100까지 합 구하기
		int i=1, sum1=0;

		System.out.println("1~10... 1~100 합 구하기");
		System.out.println();
		
		

			for(i=1;i<=100;i++) {

				sum1=sum1+i;


				if(i%10==0) {
					System.out.println("1"+"~"+i+"="+sum1);
				}



			

		}
		System.out.println();
		System.out.println();
		System.out.println("1~10... 91~100 합 구하기");
		System.out.println();


		// 1~11, 91~100까지 합구하기
		sum1=0;
		for(i=1; i<=100; i++) {
			sum1=sum1+i;

			if(i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum1);
				sum1=0;
			}

		} 








	}
}