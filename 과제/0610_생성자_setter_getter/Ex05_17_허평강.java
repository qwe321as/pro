class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	Music(){
		
		
		title = "외톨이";
		singer = "아웃사이더";
		genre = "랩";
		price = 5000;
	}
	String getTitle() {
		return title;
	}
	String getSinger(){
		return singer;
	}
	String getGenre() {
		return genre;
	}
	int getPrice() {
		return price;
	}
	
	
	
	Music(String title,String singer,String genre,int price){
		
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
		
		
	}
	
	
	void xy(){
		System.out.println("제목:"+title);
		System.out.println("가수명:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
		
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
		this.price =price;
	}
	
	
	
	
	String show() {
		return"제목:"+ title+"\n가수명:"+ singer+"\n장르:"+ genre+"\n가격: "+ price;
	}
	
}



public class Ex05_17_허평강 {
	public static void main(String[] args) {
		
		Music m1 = new Music();
		System.out.println("제목:"+m1.getTitle());
		System.out.println("가수명:"+m1.getSinger());
		System.out.println("장르:"+m1.getGenre());
		System.out.println("가격:"+m1.getPrice());
		
		System.out.println("++++++++++++");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		m2.xy();		
		
		System.out.println("-----------");
		
		Music m3 = new Music(); 
		m3.setTitle("서시");
		m3.setSinger("신성우");
		m3.setGenre("락발라드");
		m3.setPrice(8000);
		
		System.out.println(m3.show());
		
//		Music m1 = new Music(); //생성자통한 초기화
//		Music m2 = new Music("찐이야","영탁","트로트",3000);
//		Music m3 = new Music(); // setter 통한 초기화
//
//		m1 : getter 통한 출력	
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력

		
		
}	
	
	
}
