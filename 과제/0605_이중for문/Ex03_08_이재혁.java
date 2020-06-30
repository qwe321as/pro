
public class Ex03_08_이재혁 {

	public static void main(String[] args) {

		//		1,1
		//		1,2
		//		1,3
		//		2,1
		//		2,2
		//		2,3
		//		3,1
		//		3,2
		//		3,3

		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				//System.out.println(i+","+j);
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println("과제시작");
/*
		 ***** 55 54 53 52 51, 44 43 42 41, 33 32 31, 22 21, 11
		 ****
		 ***
		 **
		 *
*/
		
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				//System.out.println(i+","+j);
				System.out.print("*");
			}
			System.out.println();
		}





	}//main

}//class
