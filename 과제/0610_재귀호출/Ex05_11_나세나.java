import java.util.Scanner;

public class Ex05_11_������ {

	public static void main(String[] args) {
		Ex05_11_������ as=new Ex05_11_������();
		Scanner sc=new Scanner(System.in);


		//���� 2�� �Է�
		//2, 3 
		


		System.out.print("���ڸ� �Է��ϼ��� : ");	
		int ab=sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ���2 : ");
		int cd=sc.nextInt();		

		

		System.out.println();
	
		
		
		
	System.out.println();
		//		
		
	
			System.out.println(ab+"��"+cd+"�� : "+x(ab, cd));
		

	}
	static int x (int y,int z) {
	
			if(z==0) { 
				return 1;
			}
			else
			return y*x(y,z-1);

	}


}



