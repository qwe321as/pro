class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	void settitle(String title) {
		this.title = title;
	}
	String gettitle() {
		return title;
	}
	void setsinger(String singer) {
		this.singer = singer;
	}
	String getsinger() {
		return singer;
	}
	
	void setgenre(String genre) {
		this.genre = genre;
	}
	String getgenre() {
		return genre;
	}
	void setprice(int price) {
		this.price = price;
	}
	int getprice() {
		return price;
	}
	Music(){
		 title = "��";
		 singer = "��";
		 genre= "��";
		 price= 100;
		
	}
	
	Music(String title, String singer, String genre, int price ) {
	this.title = title;
	this.singer = singer;
	this.genre = genre;
	this.price = price;
	
	}
	void display2() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		System.out.println("�ѤѤѤѤѤѤѤ�");
	}
	String show(){
		return title+"\n"+singer+"\n"+genre+"\n"+price;
	}
}
public class Ex_05_17_������ {

	public static void main(String[] args) {

		Music m1 = new Music(); //���������� �ʱ�ȭ
		System.out.println(m1.gettitle());
		System.out.println(m1.getsinger());
		System.out.println(m1.getgenre());
		System.out.println(m1.getprice());
		System.out.println("------------");
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		Music m3 = new Music(); //���� ���� �ʱ�ȭ
		m3.settitle("�Ʒ���");
		m3.setsinger("������");
		m3.setgenre("�߶��");
		m3.setprice(50000000);
		
		
		// m1�� getter ���
		// m2 �޼��� �ȿ��� ���,m3 ������� 4���޾� ���
		
		
		
		m2.display2();
		System.out.println(m3.show());











	}

	

}
