class pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	
}
public class Ex05_06_�ڽþ� {

	public static void main(String[] args) {
		
		int b1 = 3000000, b2 = 2000000 , b3 = 1000000;
		
		pay p1 = new pay();
		pay p2 = new pay();
		pay p3 = new pay();

		p1.name = "����ȣ";
		p1.bonbong = b1;

		p2.name = "�ڼ���";
		p2.bonbong = b2;

		p3.name = "�߽ż�";
		p3.bonbong = b3;

		int tex1 = (int)(p1.bonbong * 0.03);
		int tex2 = (int)(p2.bonbong * 0.02);
		int tex3 = (int)(p3.bonbong * 0.01);
		
		p1.silsu = (p1.bonbong - tex1);
		p2.silsu = (p2.bonbong - tex2);
		p3.silsu = (p3.bonbong - tex3);

		System.out.println("�̸�:"+p1.name);
		System.out.println("����:"+p1.bonbong);
		System.out.println("����:"+tex1);
		System.out.println("�Ǽ���:" + p1.silsu);
		System.out.println("----------");

		System.out.println("�̸�:"+p2.name);
		System.out.println("����:"+p2.bonbong);
		System.out.println("����:"+tex2);
		System.out.println("�Ǽ���:" + p2.silsu);
		System.out.println("----------");

		System.out.println("�̸�:"+p3.name);
		System.out.println("����:"+p3.bonbong);
		System.out.println("����:"+tex3);
		System.out.println("�Ǽ���:" + p3.silsu);
		System.out.println("----------");

	}
}

