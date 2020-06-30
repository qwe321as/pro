class Music{
	private String title;
	private String singer;
	private String ganre;
	private int price;
	// 생성자 통한 초기화
	Music() {
		title="킬리만자로의 표범";
		singer="조용필";
		ganre="가요";
		price=150000;
	}
	
	Music(String title, String singer, String ganre, int price) {
		this.title=title;
		this.singer=singer;
		this.ganre=ganre;
		this.price=price;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	
	void setSinger(String singer) {
		this.singer=singer;
	}
	
	void setGanre(String ganre) {
		this.ganre=ganre;
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
	
	String getGanre() {
		return ganre;
	}
	
	int getPrice() {
		return price;
	}
	
	void display1() {
		System.out.println("노래: "+title);
		System.out.println("가수: "+singer);
		System.out.println("장르: "+ganre);
		System.out.println("티켓: "+price+"원");
	}
	String display2() {
		return "노래: "+title+", 가수: "+singer+", 장르: "+ganre+", 티켓: "+price+"원";
	}
	
}
public class Ex05_17_허용석 {
	public static void main(String[] args) {
		
		Music m1=new Music(); //생성자 통한 초기화
		Music m2=new Music("찐이야","영탁","트로트",30000); //
		Music m3=new Music(); // setter 통한 초기화
		
//		m1 : getter 통한 출력
		System.out.println("=============+ getter 통한 출력 +=============");
		System.out.println("노래: "+m1.getTitle());
		System.out.println("가수: "+m1.getSinger());
		System.out.println("장르: "+m1.getGanre());
		System.out.println("티켓: "+m1.getPrice()+"원");
		System.out.println();
		
//		m2 : 메서드안에서 출력
		System.out.println("==============+ 메서드안에서 출력 +==============");
		m2.display1();
		System.out.println();
		
//		m3 : 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		m3.setTitle("영영");
		m3.setSinger("나훈아");
		m3.setGanre("가요");
		m3.setPrice(200000);
		System.out.println("=====+ 메서드에서 멤버변수 4개 한번에 리턴받아 출력 +====");
		System.out.println(m3.display2());
	}

}
