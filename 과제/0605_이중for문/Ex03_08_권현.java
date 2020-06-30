
public class Ex03_08_권현 {
	public static void main(String[] args) {

		int i, j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				//System.out.println(i+","+j);
				System.out.print("*");

			}//안
			System.out.println();
		}//밖



		System.out.println();

		/* 과제

		 *****
		 ****
		 ***
		 **
		 *

		 */

		for(i=1;i<=5;i++) {
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}


		//ctrl z:취소

	}

}
