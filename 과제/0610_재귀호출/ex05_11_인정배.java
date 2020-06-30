import java.util.Scanner;

public class ex05_11_인정배 {
	public static void main(String[]args) {//메인 메소드에서 show 를 호출

		Scanner sc = new Scanner(System.in);


		int a = sc.nextInt();
		int b = sc.nextInt();

		

		System.out.println(a+"는"+b+"의 승한 값이다"+sho3w(a,b));
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
 * return; show(--cnt);//자기호출 }
 * 
 * }
 */
/*
 * 
	static void show(int 3) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;\

		show(--cnt);//자기호출
	}

	static void show(int 2) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//자기호출
	}

	static void show(int 1) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//자기호출
	}

	static void show(int cnt) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//자기호출
	}

	static void show(int cnt) {
		System.out.println("hi~ "+cnt);
		if(cnt == 1)
			return;
		show(--cnt);//자기호출
	}


 *
 */