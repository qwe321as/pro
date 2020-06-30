class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	void settitle(String title) {
		this.title = title;
	}
	String gettitle() {
		return title;
	}
	void setsinger(String singer) {
		this.singer = singer;
	}
	String getsinger() {
		return singer;
	}
	
	void setgenre(String genre) {
		this.genre = genre;
	}
	String getgenre() {
		return genre;
	}
	void setprice(int price) {
		this.price = price;
	}
	int getprice() {
		return price;
	}
	Music(){
		 title = "깡";
		 singer = "비";
		 genre= "댄스";
		 price= 100;
		
	}
	
	Music(String title, String singer, String genre, int price ) {
	this.title = title;
	this.singer = singer;
	this.genre = genre;
	this.price = price;
	
	}
	void display2() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	String show(){
		return title+"\n"+singer+"\n"+genre+"\n"+price;
	}
}
public class Ex_05_17_최지훈 {

	public static void main(String[] args) {

		Music m1 = new Music(); //생성자통한 초기화
		System.out.println(m1.gettitle());
		System.out.println(m1.getsinger());
		System.out.println(m1.getgenre());
		System.out.println(m1.getprice());
		System.out.println("------------");
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		Music m3 = new Music(); //세터 통한 초기화
		m3.settitle("아로하");
		m3.setsinger("조정석");
		m3.setgenre("발라드");
		m3.setprice(50000000);
		
		
		// m1은 getter 출력
		// m2 메서드 안에서 출력,m3 멤버변수 4개받아 출력
		
		
		
		m2.display2();
		System.out.println(m3.show());











	}

	

}
