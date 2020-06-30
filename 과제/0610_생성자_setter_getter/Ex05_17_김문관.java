class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "눈의 꽃";
		singer = "박효신";
		genre = "발라드";
		price = 15000;
	}
	
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getTitle() {
		return title;
	}
	
	void setSinger(String singer) {
		this.singer = singer;
	}
	
	String getSinger() {
		return singer;
	}
	
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	String getGenre() {
		return genre;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	void show() {
		System.out.println("타이틀 : " + title);
		System.out.println("가수 : " + singer);
		System.out.println("장르 : " + genre);
		System.out.println("가격 : " + price);
	}
	
	String allShow() {
		return  "타이틀 :" + title + " 가수 :" + singer + " 장르 :" + genre + " 가격 :" + price; 
	}
}
public class Ex05_17_김문관 {

	public static void main(String[] args) {
		Music m1 = new Music();
		System.out.println("타이틀 : " + m1.getTitle());
		System.out.println("가수 : " + m1.getSinger());
		System.out.println("장르 : " + m1.getGenre());
		System.out.println("가격 : " + m1.getPrice());
		System.out.println("==============================");
		
		Music m2 = new Music("허니", "박진영", "댄스", 20000);
		m2.show();
		
		System.out.println("==============================");
		Music m3 = new Music();
		m3.setTitle("당신을 위하여");
		m3.setSinger("더크로스");
		m3.setGenre("락발라드");
		m3.setPrice(40000);
		
		System.out.println(m3.allShow());

	}

}
