class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
//	setter ���� �ʱ�ȭ
	
	void setTitle(String title){
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
	
//	m1 ������ ���� �ʱ�ȭ
	
	Music(){
		title = "���̾�";
		singer = "��Ź";
		genre = "Ʈ��Ʈ";
		price = 3000;
	}
	
//	void display ���� �ʱ�ȭ
	
	void display() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
	}
	
	String show() {
		return title +" \n"+ singer +" \n"+ genre +" \n"+ price ;
	}
	
}
public class Ex05_17_����� {
	public static void main(String[] args) {
	
		Music m1 = new Music();
		Music m2 = new Music();
		Music m3 = new Music(); 
		
		
//		m1 : getter ���� ���
	
		System.out.println("===========");
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println("===========");
		
//		m2 : �ż��� �ȿ��� ���
		
		m2.display();
		System.out.println("===========");
		
		
//		m3 : �޼��忡�� ���Ϲ޾� ���
		
		System.out.println(m3.show());
		
	} // main
}// class
