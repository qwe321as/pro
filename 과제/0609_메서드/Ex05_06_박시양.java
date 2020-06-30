class pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	
}
public class Ex05_06_박시양 {

	public static void main(String[] args) {
		
		int b1 = 3000000, b2 = 2000000 , b3 = 1000000;
		
		pay p1 = new pay();
		pay p2 = new pay();
		pay p3 = new pay();

		p1.name = "박찬호";
		p1.bonbong = b1;

		p2.name = "박세리";
		p2.bonbong = b2;

		p3.name = "추신수";
		p3.bonbong = b3;

		int tex1 = (int)(p1.bonbong * 0.03);
		int tex2 = (int)(p2.bonbong * 0.02);
		int tex3 = (int)(p3.bonbong * 0.01);
		
		p1.silsu = (p1.bonbong - tex1);
		p2.silsu = (p2.bonbong - tex2);
		p3.silsu = (p3.bonbong - tex3);

		System.out.println("이름:"+p1.name);
		System.out.println("월급:"+p1.bonbong);
		System.out.println("세금:"+tex1);
		System.out.println("실수령:" + p1.silsu);
		System.out.println("----------");

		System.out.println("이름:"+p2.name);
		System.out.println("월급:"+p2.bonbong);
		System.out.println("세금:"+tex2);
		System.out.println("실수령:" + p2.silsu);
		System.out.println("----------");

		System.out.println("이름:"+p3.name);
		System.out.println("월급:"+p3.bonbong);
		System.out.println("세금:"+tex3);
		System.out.println("실수령:" + p3.silsu);
		System.out.println("----------");

	}
}

