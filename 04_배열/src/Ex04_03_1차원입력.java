import java.util.Scanner;

public class Ex04_03_1�����Է� {
	public static void main(String[] args) {

		//���� �ϳ� �Է¹޾� ���
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("����:");
//		int num = sc.nextInt();
//		System.out.println("num:"+num);
		int i;
		int[] jumsu = new int[5];
		
//		jumsu[0] = sc.nextInt();
//		jumsu[1] = sc.nextInt();
//		jumsu[2] = sc.nextInt();
//		jumsu[3] = sc.nextInt();
//		jumsu[4] = sc.nextInt();
		
		for(i=0;i<jumsu.length;i++) {
			System.out.print(i+"����:");
			jumsu[i] = sc.nextInt();
		} // for
		
		for(i=0;i<jumsu.length;i++) {
			//jumsu[i] = sc.nextInt();
			System.out.print(jumsu[i]+" ");
		}// for
	}

}







