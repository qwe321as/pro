import java.util.Arrays;
import java.util.Scanner;

public class EX_08_06_������ {
	public static void main(String[] args) {

		int[] lotto = new int[6]; 
		int[] my = new int [6];
		int i,j;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for(i=0;i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45)+1; // 1~45 44+1
			
			for(j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i]= (int)(Math.random()*45)+1;
					j=-1;				}
			}
		}// ù for ��
		System.out.print(lotto[i]+" ");
		
		//	System.out.println(num);

//		for(i=0;i<6;i++) {
//			System.out.print("����"+(i+1)+":");
//			my[i] = sc.nextInt();
//			if(my[i]<1 || my[i]>45){
//				System.out.println("1~45�� ���ڸ� �Է� �����մϴ�.");
//				i--;
//				continue;
//			}
//
//			for(j=0;j<i;j++) {
//				if(my[i] == my[j]) {
//					System.out.println("�ߺ��� ���� �Դϴ�.");
//					i--;
//					continue;
//				}
//			}
//		}
//		//			// 1~45�� ���ڸ� �Է� �����մϴ�.
//		//			// �ߺ��� ���ڸ� �Է��߽��ϴ�.�ٽ� �Է����ּ���.
//
//		for(i=0;i<6;i++) {
//			if(my[i] == lotto[i]) {
//				count += 1; // count = count + 1
//				System.out.print(my[i]+" ");
//				
//			}Arrays.sort(my);
//			
//			if(count == 0) {
//				System.out.println("�� �Դϴ�!");
//			}else if(count == 1) {
//				System.out.println("6�� �Դϴ�.");
//			}else if (count == 2) {
//				System.out.println("5�� �Դϴ�.");
//			}else if (count == 3) {
//				System.out.println("4�� �Դϴ�.");
//			}else if(count == 4) {
//				System.out.println("3�� �Դϴ�.");
//			}else if(count == 5) {
//				System.out.println("2�� �Դϴ�.");
//			}else if(count == 6) {
//				System.out.println("�����մϴ� 1���Դϴ�!!");
//			}
			
			// count = 0, ���⶧���� ī��Ʈ 1���� ����
			// 6�� = 1��, 5�� = 2��, 4��=3��
//		}
	}// main
}// class

