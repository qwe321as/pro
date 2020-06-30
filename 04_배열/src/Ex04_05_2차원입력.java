import java.util.Scanner;

public class Ex04_05_2차원입력 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		int i,j;
//		arr[0][0] = sc.nextInt();
//		arr[0][1] = sc.nextInt();
//		arr[0][2] = sc.nextInt();
//		arr[1][0] = sc.nextInt();
//		arr[1][1] = sc.nextInt();
//		arr[1][2] = sc.nextInt();
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print("숫자:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}





