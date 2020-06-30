import java.util.Scanner;

public class Ex05_11_나세나 {

	public static void main(String[] args) {
		Ex05_11_나세나 as=new Ex05_11_나세나();
		Scanner sc=new Scanner(System.in);


		//정수 2개 입력
		//2, 3 
		


		System.out.print("숫자를 입력하세요 : ");	
		int ab=sc.nextInt();
		System.out.print("숫자를 입력하세요2 : ");
		int cd=sc.nextInt();		

		

		System.out.println();
	
		
		
		
	System.out.println();
		//		
		
	
			System.out.println(ab+"의"+cd+"승 : "+x(ab, cd));
		

	}
	static int x (int y,int z) {
	
			if(z==0) { 
				return 1;
			}
			else
			return y*x(y,z-1);

	}


}



