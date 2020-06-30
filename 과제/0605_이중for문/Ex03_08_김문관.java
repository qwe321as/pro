
public class Ex03_08_±è¹®°ü {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {

//				System.out.println(i + "," + j);
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println("====================");

		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}