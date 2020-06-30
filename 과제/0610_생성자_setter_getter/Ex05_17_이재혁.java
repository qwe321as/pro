class Music{
	private String title; 
	private String singer;
	private String genre;
	private int price; 
	
	
	Music(){
		title = "에잇"; 
		singer = "아이유";
		genre = "발라트";
		price = 5000;
	}
	
	Music(String t, String s, String g, int p){
		title = t;
		singer = s;
		genre = g;
		price = p;
	}
	
	void setTitle(String t){
		title = t;
	}
	String getTitle() {
		return title;
	}
		
	void setSinger(String s){
		singer = s;
	}
	String getSinger() {
		return singer;
	}
	
	void setGenre(String g){
		genre = g;
	}
	String getGenre() {
		return genre;
	}

	void setPrice(int p){
		price = p;
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
}

public class Ex05_17_이재혁 {
	public static void main(String[] args) {
				
		Music m1 = new Music(); //생성자 통한 초기화
//		m1 : getter 통한 출력
		System.out.println("---m1---");
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
//		m2 : 메서드 안에서 출력
		System.out.println("---m2---");
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		
		Music m3 = new Music();// setter 통한 초기화
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		System.out.println("---m3---");
		m3.display();

	}
}



