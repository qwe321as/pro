
public class Ex03_13_±è¹®°ü {

	public static void main(String[] args) {

		int sum;

		sum = 0;

		for(int i = 1; i<=100; i++) {

			sum += i;

			if(i % 10 == 0) {

				System.out.println(1 + "~" + i + "=" + sum);

			}
		}
		System.out.println("=============================");

		sum = 0;

		for(int i = 1; i<=100; i++) {

			sum += i;

			if(i % 10 == 0) {

				System.out.println(i-9 + "~" + i + "=" + sum);

				sum = 0;
			}

		}

	}

}
