class Music{
	
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "aaa";
		singer = "���κ���";
		genre = "K-pop";
		price = 5000;
	}
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	
	String getSinger() {
		return singer;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	String getGenre() {
		return genre;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	
	Music(String title, String singer, String genre, int price) {
	    this.title = title;
	    this.singer = singer;
	    this.genre = genre;
	    this.price = price;
		
	}
	void prevAll() {
		System.out.println("�뷡����:"+title);
		System.out.println("����:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
		System.out.println();
	}
	String prevAll2() {
		
		return title+"\n"+singer+"\n"+genre+"\n"+price;
		
	}
}

public class Ex05_17_����� {

	public static void main(String[] args) {
		
		Music m1 = new Music(); //������ ���� �ʱ�ȭ
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		Music m3 = new Music(); //setter ���� �ʱ�ȭ
		
		m3.setTitle("��Ʈ��");
		m3.setSinger("����");
		m3.setGenre("Ʈ��Ʈ");
		m3.setPrice(10000);
		
		m1.getTitle();
		m1.getSinger();
		m1.getGenre();
		m1.getPrice();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		m2.prevAll();
		
		System.out.println(m3.prevAll2());
//		m1 : getter ���� ���
//		m2 : �޼���ȿ��� ���� ���
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		
		

	}

}
