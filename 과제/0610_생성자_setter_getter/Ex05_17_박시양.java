class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "아리랑";
		singer = "조용필";
		genre = "민요 ";
		price = 10000;
		System.out.println("title = \"아리랑\";\r\n" + 
				"		singer = \"조용필\";\r\n" + 
				"		genre = \"민요 \";\r\n" + 
				"		price = 10000;\n");
		}
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price =price;
	}
	void setTitle(String title){
		this.title = title;
	}
	String getTitel() {
		return title;
	}
	void setSinger(String singer){
		this.singer = singer;
	}
	String getSinger() {
		return singer;
	}
	void setEenre(String genre){
		this.genre = genre;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int price){
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		
	}
	 String show() {
		 return "제목: " + title + " 가수: " + singer + " 장르: " + genre + " 가격: " + price;
		 
	}


	
}

public class Ex05_17_박시양 {
	public static void main(String[] args) {
		
		
		Music m1 = new Music(); //생성자 통한 초기화
		Music m2 = new Music(); //
		Music m3 = new Music(); // setter 통한 초기화
		
		
//		m2 : getter 통한 출력
		System.out.println(m1.getTitel());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println("=======");
		
//		m2 : 메서드 안헤서 출력
		m1.display();
		System.out.println("*******");
		
//		m3 : 메서드에서 멤버변수 4개를 한번에 리턴 받아 출력
		System.out.println(m1.show());
		

	}

}
