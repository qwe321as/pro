import java.util.Scanner;

public class Ex05_11_원태찬 {

	public static void main(String[] args) {
		// 정수 2개 입력
		// 재귀호출로 a의 b승
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		suv(i,j);
		System.out.println(suv(i,j));
	}
	static int suv(int x,int y) {
		if(y==0) {
			return 1;
		}
		else {
			return x*suv(x,y-1);
		}
	}
}
