class music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	void settitle(String title) {
		this.title = title;
	}
	String gettitle(){
		return title;
	}

	
	void setsinger(String singer) {
		this.singer =singer;
	}
	String getsinger(){
		return singer;
		
	}
	void setgenre(String genre) {
		this.genre = genre;
	}
	String getgenre(){
		return genre;
	}
	
	void setprice(int price) {
		this.price=price;
		
	}
	int getprice(){
		return price;
	}
	
	void darkplay() {
		System.out.println("Ÿ��Ʋ:"+title);
		System.out.println("����:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
	}
	String dup(){
		return "Ÿ��Ʋ"+title+"����"+singer+"�帣"+genre+"����"+price;
		
	}
	music(){
		title = "������";
		singer= "������";
		genre = "������";
		price = 56465;
		
	}
	music(String title, String singer, String genre, int price){ // ������ �����ε�
		System.out.println("��� ���̴� �����پƴ°� ������ �ߴ� ���� �۳��µ� ���̴�");
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}

	

}



public class ex05_17_������ {
	public static void main(String[]args) {
		//music s = new music();
		
		music m1 = new music();
		
		System.out.println("Ÿ��Ʋ"+m1.gettitle());
		System.out.println("����"+m1.getsinger());
		System.out.println("�帣"+m1.getgenre());
		System.out.println("����"+m1.getprice());
		
		
		
		
		
		music m2 = new music("�Ϳ� ����","��������","�ƿ� �����",465);
		m2.darkplay();
		music m3 = new music();
		m3.settitle("power up");
		m3.setsinger("����");
		m3.setgenre("��Ÿ��");
		m3.setprice(1234);
		m3.dup();
		System.out.println(m3.dup());
		/*
		 * music m1 = new music();//������ ���� �ʱ�ȭ music m2 = new
		 * music("�Ϳ� ����","��������","�ƿ� �����",10000); //class music�� ������ �ֱ� 
		 * music m3 = new music();// setter �����ʱ�ȭ 
		 * m1 : getter ���� ��� 
		 * m2 : �޼��� �ȿ��� ��� 
		 * m3 : �ż��� ���� ������� 4���� �ѹ��� ���Ϲ޾� ���
		 */
	}

}
