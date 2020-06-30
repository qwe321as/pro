class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;


	Music(){
		title="에잇";
		singer="아이유";
		genre="락";
		price=2500;

	}
	
	Music(String title, String singer, String genre, int price){
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
		
	}

	void setTitle(String title) {
		this.title=title;
	}
	void setSinger(String singer) {
		this.singer=singer;
	}
	void setGenre(String genre) {
		this.genre=genre;
	}
	void setPrice(int price) {
		this.price=price;
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
		System.out.println("=================");
	}
	
	String show() {
	return
			"제목:"+title+"  가수:"+singer+"  장르:"+genre+"  가격"+price;
	}
}
public class Ex05_17_나세나 {

	public static void main(String[] args) {

		//각 다른 값 넣기

		Music m1=new Music();   // 생성자 통한 초기화(값넣기)

		System.out.println("제목:"+m1.getTitle());
		System.out.println("가수:"+m1.getSinger());
		System.out.println("장르:"+m1.getGenre());
		System.out.println("가격:"+m1.getPrice());
		System.out.println("=================");


		Music m2=new Music("아무노래", "지코", "랩/힙합", 4000);
		m2.display();        



		Music m3=new Music();  //setter 통한 초기화
		
		m3.setTitle("아로하");
		m3.setSinger("조정석");
		m3.setGenre("OST");
		m3.setPrice(3000);
		
		System.out.println(m3.show());

		//		m1:getter 통한 출력
		//		m2:메서드 안에서 출력
		//		m3:메서드에서 멤버변수 4개 한번에 리턴받아 출력
	}

}
