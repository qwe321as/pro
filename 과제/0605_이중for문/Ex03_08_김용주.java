
public class Ex03_08_김용주 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=5;i++) {

			for(j=1;j<=i;j++) {			
//				System.out.println(i + "," + j);
				System.out.print("*");
			} //안쪽for문
			System.out.println();
		} // 바깥쪽for문
		
		/*
		  *****
		  ****
		  ***
		  **
		  *
		 */
		System.out.println();
		for(i=5;i>=1;i--) {

			for(j=1;j<=i;j++) {			
//				System.out.println(i + "," + j);
				System.out.print("*");
			} //안쪽for문
			System.out.println();
		} // 바깥쪽for문

	}

}
