import java.util.Scanner;

public class Ex05_11_양경원 {

		static int set(int a,int b) {

//			int result = 1;
//			for(int i=1 ;i <= b ;i++) { //1 <= 3 //3번 
//				result *= a; // 1*2 = 2 -> 2*2 = 4 -> 4*2 = 8;
//			}
//			return result; // 8
		
			if(b == 0) {//3
				return 1;	
			}else {
				return a * set(a ,--b);//2*set(2,2) 4, 2*set(2,1)  2, 2*set(2,0) 1 //2*4 = 8
			}
			
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(set(a, b));
	}

}
