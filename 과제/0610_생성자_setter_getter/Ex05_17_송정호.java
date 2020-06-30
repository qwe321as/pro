
class Music {
	
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music() {
		
		title = "Song";
		singer = "�谡";
		genre = "�߶��";
		price = 2500;
	}
	
	Music(String title, String singer, String genre, int price) {
		
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void setTitle(String title) {
		
		this.title = title;
	}
	
	void setSinger(String singer) {
		
		this.singer = singer;
	}
	
	void setGenre(String genre) {
		
		this.genre = genre;
	}
	
	void setPrice(int price) {
		
		this.price = price;
	}
	
	String getTitle() {
		
		return title;
	}
	
	String getSinger() {
		
		return singer;
	}
	
	String getGenre() {
		
		return genre;
	}
	
	int getPrice() {
		
		return price;
	}
	
	void display() {
		
		System.out.println(title + ", " + singer + ", " + genre + ", " + price);
	}
	
	String show() {
		
		return title + ", " + singer + ", " + genre + ", " + price;
	}
}

public class Ex05_17_����ȣ {

	public static void main(String[] args) {
		
		Music m1 = new Music(); // ������ ���� �ʱ�ȭ
		Music m2 = new Music("���̾�", "��Ź", "Ʈ��Ʈ", 3000);
		Music m3 = new Music(); // setter ���� �ʱ�ȭ
		
//		m1 : getter ���� ���
//		m2 : �޼��� �ȿ��� ���
//		m3 : �޼��忡�� �ѹ��� ���Ϲ޾� ���
		
		System.out.println(m1.getTitle() + ", " + m1.getSinger() + ", " + m1.getGenre() + ", " + m1.getPrice());	//	m1 : getter ���� ���
		System.out.println();
		
		m2.display();						//	m2 : �޼��� �ȿ��� ���
		System.out.println();
		
		m3.setTitle("�ƹ��뷡");
		m3.setSinger("��ö��");
		m3.setGenre("����");
		m3.setPrice(1700);
		
		System.out.println(m3.show());		//	m3 : �޼��忡�� �ѹ��� ���Ϲ޾� ���
	}

}
