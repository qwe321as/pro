class Music {
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music() {
		title = "metor";
		singer = "창모";
		genre = "힙합";
		price = 10000;
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
		System.out.println("제목:"+title);
		System.out.println("가수:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
	
	}
	
	String show() {
		return "제목:"+title +"\n"+ "가수:" + singer+"\n"+ "장르:" + genre+"\n"+ "가격:" + price;
	}
	
}
public class Ex05_17_김기현 {

	public static void main(String[] args) {

		Music m1 = new Music(); // 생성자 통한 초기화
		System.out.println("제목:"+m1.getTitle()+" ");
		System.out.println("가수:"+m1.getSinger()+" ");
		System.out.println("장르:"+m1.getGenre()+" ");
		System.out.println("가격:"+m1.getPrice()+" ");
		System.out.println("===============================");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000); 
		m2.display();
		System.out.println("===============================");
		
		Music m3 = new Music(); // setter 통한 초기화
		m3.setTitle("빈집");
		m3.setSinger("기리보이");
		m3.setGenre("힙합");
		m3.setPrice(10000);		
		System.out.println(m3.show());
		// m1 : getter 출력 , m2 : 메서드 안에서 , m3 : 메서드에서 멤버변수 4개 한번에 리턴받아
		
		
	}

}
