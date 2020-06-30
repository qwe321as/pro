class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	

	

	Music(){
		//System.out.println("m1");
		title = "피카부";
		singer = "레드벨벳";
		genre = "댄스음악";
		price = 5000;
		
	}
	Music(String title,String singer,String genre,int price){
		
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
		
	}
	
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
	void end2() {
		System.out.println("두번째노래 제목: "+title);
		System.out.println("가수: "+singer);
		System.out.println("장르: "+genre);
		System.out.println("가격: "+price);
		System.out.println();
	}
	String end() {
		return "세번째 노래제목:"+title+"\n 가수:"+singer+"\n 장르:"+genre+"\n 가격:"+price;
	}
}




public class Ex05_17_박근주 {

	public static void main(String[] args) {
		
		
		
		Music m1 = new Music(); // 생성자 통한 초기화
		
//		m1 : getter 통한 출력
//		m2 : 메서드안에서 출력
//		m3 : 메서드에서 한번에 멤버변수 4개 리턴받아 출력
		
		System.out.println("첫번째 노래 제목:"+m1.gettitle());
		System.out.println("가수: "+m1.getsinger());
		System.out.println("장르: "+ m1.getgenre());
		System.out.println("가격: "+m1.getprice());
		System.out.println();
		Music m2 = new Music("찐이야","영탁","트로트",3000);
		m2.end2();
		
		Music m3 = new Music(); // setter 통한 초기화
		
		m3.settitle("깡");
		m3.setsinger("비");
		m3.setgenre("힙합");
		m3.setprice(100);
		System.out.println(m3.end());

	}

}
