class Music{
	
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "aaa";
		singer = "레인보우";
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
		System.out.println("노래제목:"+title);
		System.out.println("가수:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
		System.out.println();
	}
	String prevAll2() {
		
		return title+"\n"+singer+"\n"+genre+"\n"+price;
		
	}
}

public class Ex05_17_김용주 {

	public static void main(String[] args) {
		
		Music m1 = new Music(); //생성자 통한 초기화
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		Music m3 = new Music(); //setter 통한 초기화
		
		m3.setTitle("파트너");
		m3.setSinger("동원");
		m3.setGenre("트로트");
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
//		m1 : getter 통한 출력
//		m2 : 메서드안에서 통한 출력
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		
		

	}

}
