class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	//1
	Music(){
		title = "하드캐리";
		singer = "got7";
		genre = "힙합";
		price = 2000;
	}
	//2
	Music(String t, String s, String g, int p){
		title = t;
		singer = s;
		genre = g;
		price = p;
		
	}
	
	//title
	void setTitle(String t){
		title = t;
	}
	String getTitle() {
		return title;
	}
	
	//singer
	void setSinger(String s){
		singer = s;
	}
	String getSinger() {
		return singer;
	}
	
	//genre
	void setGenre(String g){
		genre = g;
	}
	String getGenre() {
		return genre;
	}
	
	//price
	void setPrice(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
	
	//3
	String show() {
		title = "zombie";
		singer = "day6";
		genre = "포크";
		price = 1000;
		return "제목:"+title+"가수:"+singer+"장르:"+genre+"가격:"+price;
	}
	

}

public class Ex05_17_권현 {
	public static void main(String[] args) {

		//생성자를 통한 초기화
		Music m1 = new Music();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println("-----");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());

		System.out.println("-----");
		
		//setter 메서드를 통한  초기화
		Music m3 = new Music();
		System.out.println(m3.show());
		
		//m1 : getter 통한 출력
		//m2 : 메서드 안에서 출력
		//m3 : 메서드에서 멤버변수 4개를 한번에 리턴 받아 출력
	}

}
