class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "아로하";
		singer = "쿨";
		genre = "발라드";
		price = 20000;
	}
	
	Music(String title,String singer,String genre,int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	void setTitle(String title) {
		this.title=title;
	}
	String getTitle() {
		return title;
	}
	void setSinger(String singer) {
		this.singer=singer;
	}
	String getSinger() {
		return singer;
	}
	void setGenre(String genre) {
		this.genre=genre;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int price) {
		this.price=price;
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
	String show(){
		return "제목:"+title + "가수:"+singer +"장르:"+genre +"가격:"+price;
	}
	
}
public class Ex05_17_문태승 {
	public static void main(String[] args) {

		Music m1 = new Music();  // 생성자 통한 초기화
		System.out.println("==1번==");
		System.out.println("제목:"+m1.getTitle());
		System.out.println("가수:"+m1.getSinger());
		System.out.println("장르:"+m1.getGenre());
		System.out.println("가격:"+m1.getPrice());
		System.out.println();
		System.out.println("==2번==");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		m2.display();
		Music m3 = new Music();  // setter 통한 초기화
		System.out.println();
		System.out.println("==3번==");
		m3.setTitle("WANNABE");
		m3.setSinger("ITZY");
		m3.setGenre("댄스");
		m3.setPrice(30000);
		System.out.println(m3.show());
		
//		m1 : getter 통한 출력
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		
	}

}
