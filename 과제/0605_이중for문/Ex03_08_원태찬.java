
public class Ex03_08_������ {
	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {                  //i�� j������ �� ������ ���
//				System.out.println(i+","+j);
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *   *****
		 *   ****
		 *   ***
		 *   **
		 *   *
		 */
		for(i=1;i<=5;i++) {
			for(j=5;j>=i;j--) {              
				System.out.print("*");
		}
		System.out.println();
	}
	}
}

