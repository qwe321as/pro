class Music{ 	
	private String title;	
	private String singer;
	private String genre;
	private int price;
	
	
	Music () {
		System.out.println("Music 생성자");
	
		title = "야생화";
		singer = "박효신";
		genre = "발라드";
		price = 1000;
	}
		
	Music(String title, String singer, String genre, int price){	//생성자 오버로딩
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}	
	
	
	
	
	void setTitle(String a) {
		title = a;
	}	
	String getTitle()	{
		return title;
	}
	void setSinger(String b) {
		title = b;
	}
	String getSinger()	{
		return singer;
	}
	void setGenre(String c) {
		title = c;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int d) {
		price = d;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println("title:" + title);
		System.out.println("singer:" + singer);
		System.out.println("genre:" + genre);
		System.out.println("price:" + price);
	}

	String show() {
	return
			"제목:"+title+"  가수:"+singer+"  장르:"+genre+"  가격"+price;
	}
	
	
}


public class Ex05_17_박청호 {

	public static void main(String[] args) {
		
		
		Music m1 = new Music();		//생성자 통한 초기화
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println("==================");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
			m2.display();
		
		
		
		System.out.println();
		Music m3 = new Music();		//setter 초기화
		System.out.println("제목:"+m1.getTitle());
		System.out.println("가수:"+m1.getSinger());
		System.out.println("장르:"+m1.getGenre());
		System.out.println("가격:"+m1.getPrice());
		System.out.println("=================");

		//m1 : getter 통한 출력
		//m2 : 메서드 통한 출력
		//m3 : 메서드에서 한번에 멤버변수 4개 리턴받아 출력
	}

}
