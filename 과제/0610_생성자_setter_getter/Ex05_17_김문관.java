class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "���� ��";
		singer = "��ȿ��";
		genre = "�߶��";
		price = 15000;
	}
	
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getTitle() {
		return title;
	}
	
	void setSinger(String singer) {
		this.singer = singer;
	}
	
	String getSinger() {
		return singer;
	}
	
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	String getGenre() {
		return genre;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	void show() {
		System.out.println("Ÿ��Ʋ : " + title);
		System.out.println("���� : " + singer);
		System.out.println("�帣 : " + genre);
		System.out.println("���� : " + price);
	}
	
	String allShow() {
		return  "Ÿ��Ʋ :" + title + " ���� :" + singer + " �帣 :" + genre + " ���� :" + price; 
	}
}
public class Ex05_17_�蹮�� {

	public static void main(String[] args) {
		Music m1 = new Music();
		System.out.println("Ÿ��Ʋ : " + m1.getTitle());
		System.out.println("���� : " + m1.getSinger());
		System.out.println("�帣 : " + m1.getGenre());
		System.out.println("���� : " + m1.getPrice());
		System.out.println("==============================");
		
		Music m2 = new Music("���", "������", "��", 20000);
		m2.show();
		
		System.out.println("==============================");
		Music m3 = new Music();
		m3.setTitle("����� ���Ͽ�");
		m3.setSinger("��ũ�ν�");
		m3.setGenre("���߶��");
		m3.setPrice(40000);
		
		System.out.println(m3.allShow());

	}

}
