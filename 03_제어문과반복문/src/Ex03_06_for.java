import java.util.Scanner;

public class Ex03_06_for {
	public static void main(String[] args) {

		//		7*1=7
		//		7*2=14
		//			:
		//		7*9=63

		//		System.out.println("7*1=7");
		//		System.out.println("7*2=14");

		Scanner sc = new Scanner(System.in);
		System.out.print("´Ü ÀÔ·Â:");
		int dan = sc.nextInt();
		
		int i;
		for(i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}




