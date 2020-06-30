class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "More&More";
		singer = "twice";
		genre = "K-pop";
		price = 2000;
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
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	
	void display() {
		System.out.println("제목:"+title);
		System.out.println("가수:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
		System.out.println();
	}
	
	String display2() {
		return "제목:"+title+"\n가수:"+singer+"\n장르:"+genre+"\n가격:"+price;
	}
}
public class Ex05_17_김용승 {
	public static void main(String[] args) {
		
		Music m1 = new Music(); // 생성자를 통한 초기화
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		
		Music m3 = new Music(); // setter 통한 초기화
		m3.setTitle("나의 어릴적 이야기");
		m3.setSinger("산들");
		m3.setGenre("발라드");
		m3.setPrice(4000);
		
		//m1 : getter 통한 출력
		System.out.println("제목:"+m1.getTitle());
		System.out.println("가수:"+m1.getSinger());
		System.out.println("장르:"+m1.getGenre());
		System.out.println("가격:"+m1.getPrice());
		System.out.println();
		
		//m2 : 메서드 안에서 출력
		m2.display();
		//m3 : 메서드에서 한번에 리턴 받아 출력
		System.out.println(m3.display2());
	}
}
