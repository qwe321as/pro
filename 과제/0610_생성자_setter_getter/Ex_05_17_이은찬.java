class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	
	Music(){ // 생성자(Constructor) // 앞에 보이드와 리턴타입 사용 금지 사용 시 에러 발생
		title = "RIDE";
		singer = "SOLE(쏠)";
		genre = "R&B";
		price = 10000;
				
	}
	
	Music(String title, String singer, String genre, int price){ 
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void display() {
		System.out.println("title:"+title);
		System.out.println("singer:"+singer);
		System.out.println("genre:"+genre);
		System.out.println("price:"+price);
		System.out.println();
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
	
	void setTitle(String t) {
		title = t;		
	}
	
	void setSinger(String s) {
		singer = s;
	}
	
	void setGenre(String g) {
		genre = g;
	}
	
	void setPrice(int p) {
		price = p;
	}
	
	String show() {
		return "title:" +title +"," + "singer:" +singer +
				"genre:" +genre +","+"price:" +price;	
	}
}

public class Ex_05_17_이은찬 {
	public static void main(String[] args) {
		
	/*	Music m1 = new Music(); // 생성자 통한 초기화
		Music m2 = new Music("찐이야","영탁","트로트",3000); 
		Music m3 = new Music(); // setter 통한 초기화
		
		m1 : getter 통한 출력
		m2 : 메서드 안에서 출력
		m3 : 메서드에서 멤버변수 4개를 한번에 리턴받아 출력 */
		
		Music m1 = new Music();
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		Music m3 = new Music();
		
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		m2.display();
		m3.setTitle("처음처럼");
		m3.setSinger("Mc the Max");
		m3.setGenre("발라드");
		m3.setPrice(5000);
		System.out.println(m3.show());
	}

}
