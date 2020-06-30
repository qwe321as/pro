public class Ex03_08_이기선 {

	public static void main(String[] args) {

		int i,j;

		for(i=10; i >=1; i--) {
			for(j=1; j <=i ; j++) {
				//				System.out.println("Number Output : "+i+" , "+j);
				System.out.print("*");
			}
			//			System.out.println("=================================");
			System.out.println();
		}

		
		for(i=1; i <=10; i++) {
			for(j=1; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
