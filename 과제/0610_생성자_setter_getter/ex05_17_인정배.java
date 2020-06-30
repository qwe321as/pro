class music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	void settitle(String title) {
		this.title = title;
	}
	String gettitle(){
		return title;
	}

	
	void setsinger(String singer) {
		this.singer =singer;
	}
	String getsinger(){
		return singer;
		
	}
	void setgenre(String genre) {
		this.genre = genre;
	}
	String getgenre(){
		return genre;
	}
	
	void setprice(int price) {
		this.price=price;
		
	}
	int getprice(){
		return price;
	}
	
	void darkplay() {
		System.out.println("타이틀:"+title);
		System.out.println("가수:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("몰라:"+price);
	}
	String dup(){
		return "타이틀"+title+"가수"+singer+"장르"+genre+"몰라"+price;
		
	}
	music(){
		title = "하하하";
		singer= "하하하";
		genre = "하하하";
		price = 56465;
		
	}
	music(String title, String singer, String genre, int price){ // 생성자 오버로딩
		System.out.println("어께가 무겁다 왜인줄아는가 밭일을 했다 흙을 퍼내는데 무겁다");
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}

	

}



public class ex05_17_인정배 {
	public static void main(String[]args) {
		//music s = new music();
		
		music m1 = new music();
		
		System.out.println("타이틀"+m1.gettitle());
		System.out.println("가수"+m1.getsinger());
		System.out.println("장르"+m1.getgenre());
		System.out.println("몰라"+m1.getprice());
		
		
		
		
		
		music m2 = new music("와우 졸려","음냐음냐","아오 힘들어",465);
		m2.darkplay();
		music m3 = new music();
		m3.settitle("power up");
		m3.setsinger("몰라");
		m3.setgenre("판타지");
		m3.setprice(1234);
		m3.dup();
		System.out.println(m3.dup());
		/*
		 * music m1 = new music();//생성자 통한 초기화 music m2 = new
		 * music("와우 졸려","음냐음냐","아오 힘들어",10000); //class music의 변수에 넣기 
		 * music m3 = new music();// setter 통한초기화 
		 * m1 : getter 통한 출력 
		 * m2 : 메서드 안에서 출력 
		 * m3 : 매서드 에서 멤버변수 4개를 한번에 리턴받아 출력
		 */
	}

}
