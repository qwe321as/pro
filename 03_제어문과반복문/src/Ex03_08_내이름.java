
public class Ex03_08_≥ª¿Ã∏ß {
	public static void main(String[] args) {
/*
		1,1
		1,2
		1,3
		2,1
		2,2
		2,3
		3,1
		3,2
		3,3
*/
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				//System.out.println(i+","+j);
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
/*		
		*****
		****
		***
		**
		*

		i j
		0 5
		1 4
		2 3
*/		
		for(i=0;i<5;i++) {
			for(j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}




