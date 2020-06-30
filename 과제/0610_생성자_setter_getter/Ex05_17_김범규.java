class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
//	setter 통한 초기화
	
	void setTitle(String title){
		this.title = title;
	}
	
	void setSinger(String singer) {
		this.singer = singer;
	}
	
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	void setPrice(int price) {
		this.price = price;
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
	
//	m1 생성자 통한 초기화
	
	Music(){
		title = "찐이야";
		singer = "영탁";
		genre = "트로트";
		price = 3000;
	}
	
//	void display 통한 초기화
	
	void display() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
	}
	
	String show() {
		return title +" \n"+ singer +" \n"+ genre +" \n"+ price ;
	}
	
}
public class Ex05_17_김범규 {
	public static void main(String[] args) {
	
		Music m1 = new Music();
		Music m2 = new Music();
		Music m3 = new Music(); 
		
		
//		m1 : getter 통한 출력
	
		System.out.println("===========");
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println("===========");
		
//		m2 : 매서드 안에서 출력
		
		m2.display();
		System.out.println("===========");
		
		
//		m3 : 메서드에서 리턴받아 출력
		
		System.out.println(m3.show());
		
	} // main
}// class
