import java.util.Scanner;

public class ex05_11_������ {
	public static void main(String[]args) {//���� �޼ҵ忡�� show �� ȣ��

		Scanner sc = new Scanner(System.in);


		int a = sc.nextInt();
		int b = sc.nextInt();

		

		System.out.println(a+"��"+b+"�� ���� ���̴�"+sho3w(a,b));
	}



	static int sho3w(int a, int b) {


		if(b==1) {
			return a; 
		}else {


			return a*sho3w(a,--b);
		}





	}	

}
/*
 * static void show(int cnt) { System.out.println("hi~ "+cnt); if(cnt == 1)
 * return; show(--cnt);//�ڱ�ȣ�� }
 * 
 * }
 */
/*
 * 
	static void show(int 3) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;\

		show(--cnt);//�ڱ�ȣ��
	}

	static void show(int 2) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//�ڱ�ȣ��
	}

	static void show(int 1) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//�ڱ�ȣ��
	}

	static void show(int cnt) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//�ڱ�ȣ��
	}

	static void show(int cnt) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//�ڱ�ȣ��
	}


 *
 */