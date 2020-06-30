
public class Ex03_08_Á¤Áö¿ø {

	public static void main(String[] args) {
		
		int i;
		int j;
	
		for(i=1; i<=5;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println("------------------");
		
		for(i=5;i>0;i=i-1) {
			for(j=i;j>0;j=j-1) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		

	}

}
