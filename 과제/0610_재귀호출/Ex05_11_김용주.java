import java.util.Scanner;

public class Ex05_11_����� {

	static int set(int x,int y) {

		if(y == 0) {
			return 1;	
		}else {
			return x * set(x ,--y);//2*set(2,2) 4, 2*set(2,1)  2, 2*set(2,0) 1 //2*4 = 8
		}
		
}

	
	public static void main(String[] args) {
		
		// ���� 2�� �Է�
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
	    int y=sc.nextInt();
  	  			
			System.out.println("����:"+ 2*set(x,y));
			
		}
		
		

	}


