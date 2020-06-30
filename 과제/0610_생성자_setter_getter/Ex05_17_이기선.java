class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music() {
		this.title = "천상재회";
		this.singer = "KimHoJoong";
		this.genre = "Ballard";
		this.price = 10000;
	}
	Music(String title, String singer, String genre, int price) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
		
		System.out.println("Inside of Music(String title, String singer, String genre, int price)");
		System.out.println("Title : "+this.title);
		System.out.println("Singer : "+this.singer);
		System.out.println("Genre : "+this.genre);
		System.out.println("Price : "+this.price);
		System.out.println("=========================================================================");
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrice() {
		return price;
	}
	
	void show() {
		System.out.println("show() : "+"Title : "+this.title+" Singer : "+this.singer+" Genre : "+this.genre+" Price : "+this.price);
	}
	public String toString() {
		return "Title : "+this.title+" Singer : "+this.singer+" Genre : "+this.genre+" Price : "+this.price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Ex05_17_이기선 {

	public static void main(String[] args) {

		Music m1 = new Music();
		System.out.println("m1 : getter 통한 출력");
		System.out.println("Title m1.getTitle() : "+m1.getTitle());
		System.out.println("Singer m1.getSinger() : "+m1.getSinger());
		System.out.println("Genre m1.getGenre() : "+m1.getGenre());
		System.out.println("Price  m1.getPrice() : "+m1.getPrice());
		System.out.println("==========================================================================================");
		System.out.println("m2 : 메서드 안에서 출력");
		Music m2 = new Music("JJin","Kim02","Trout",3000);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		System.out.println(m2.toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Music m3 = new Music();
		m3.setTitle("바램");
		m3.setSinger("임영웅");
		m3.setGenre("발라드");
		m3.setPrice(2000);
		System.out.println("m3 : 메서드에서 멤버변수 4개 한번에 출력");
		m3.show();
		System.out.println("m3.toString() : "+m3.toString());
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
//		m1 : getter 통한 출력
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 멤버변수 4개 한번에 출력
	}

}
