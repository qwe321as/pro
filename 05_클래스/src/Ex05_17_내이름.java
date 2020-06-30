class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	public Music() {
		super();
		title = "마시멜로";
		singer = "아이유";
		genre = "발라드";
		price = 1000;
	}

	public Music(String title, String singer, String genre, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	Music(){
//		title = "마시멜로";
//		singer = "아이유";
//		genre = "발라드";
//		price = 1000;
//	}
//	
//	Music(String title,String singer,String genre,int price){
//		this.title = title;
//		this.singer = singer;
//		this.genre = genre;
//		this.price = price;
//	}
	
//	void setTitle(String title){
//		this.title = title;
//		//return;
//	}
//	String getTitle(){
//		return title;
//	}
//	
//	
//	void setSinger(String singer) {
//		this.singer = singer;
//	}
//	
//	String getSinger() {
//		return singer;
//	}
//	
//	void setGenre(String genre) {
//		this.genre = genre;
//	}
//	String getGenre() {
//		return genre;
//	}
//	
//	void setPrice(int price) {
//		this.price = price;
//	}
//	int getPrice() {
//		return price;
//	}
	 
	void display(){
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		System.out.println();
	}
	
	String show(){
		return title+","+singer+","+genre+","+price;
	}
}

public class Ex05_17_내이름 {
	public static void main(String[] args) {

		Music m1 = new Music(); // 생성자 통한 초기화
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		Music m3 = new Music(); // setter 통한 초기화 
		
//		위의 Music 객체 3개를 배열로 만든다.
//		show() 통한 출력
		Music[] ms = new Music[3];
		ms[0]=new Music();
		ms[1]=new Music("찐이야","영탁","트로트",3000);
		ms[2]=new Music();
		
		ms[2].setTitle("단발머리");
		ms[2].setSinger("조용필");
		ms[2].setGenre("댄스");
		ms[2].setPrice(5000);
		int i;
		for(i=0;i<ms.length;i++) {
			System.out.println(ms[i].show());
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//m1.title = "abc";
		//System.out.println(m1.title);
		
		
//		m1 : getter 통한 출력
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		
//		m2 : 메서드 안에서 출력
		m2.display();
		
		m3.setTitle("단발머리");
		m3.setSinger("조용필");
		m3.setGenre("댄스");
		m3.setPrice(5000);
		System.out.println(m3.show());
		
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		
		
	}

}


