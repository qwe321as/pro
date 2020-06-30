
public class Ex03_08_Çã¿ë¼® {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
//				System.out.println(i+","+j);
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			System.out.println();
			for(int j=1;j<=i;j++) {
//				System.out.println(i+","+j);
				System.out.print("*");
			}
			
		}
	}

}
