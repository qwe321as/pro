
class Music {
	
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music() {
		
		title = "Song";
		singer = "김가";
		genre = "발라드";
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

public class Ex05_17_송정호 {

	public static void main(String[] args) {
		
		Music m1 = new Music(); // 생성자 통한 초기화
		Music m2 = new Music("찐이야", "영탁", "트로트", 3000);
		Music m3 = new Music(); // setter 통한 초기화
		
//		m1 : getter 통한 출력
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 한번에 리턴받아 출력
		
		System.out.println(m1.getTitle() + ", " + m1.getSinger() + ", " + m1.getGenre() + ", " + m1.getPrice());	//	m1 : getter 통한 출력
		System.out.println();
		
		m2.display();						//	m2 : 메서드 안에서 출력
		System.out.println();
		
		m3.setTitle("아무노래");
		m3.setSinger("박철수");
		m3.setGenre("힙합");
		m3.setPrice(1700);
		
		System.out.println(m3.show());		//	m3 : 메서드에서 한번에 리턴받아 출력
	}

}
