class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	Music(){
		title="아로하";
		singer="쿨";
		genre="발라드";
		price=10000;		
	}
	Music(String title,String singer,String genre,int price){ 
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
	}
	
	void display() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
	}
	
	void setTitle(String title){
		this.title=title;
	}
	String getTitle(){
			return title;
		}
	void setSinger(String singer){
		this.singer=singer;
	}
	String getSinger(){
		return singer;
	}
	void setGenre(String genre){
		this.genre=genre;
	}
	String getGenre(){
		return genre;
	}
	void setPrice(int price){
		this.price=price;
	}
	int getPrice(){
		return price;
	}
	String show(){
		return title+singer+genre+price;
	}
}

public class Ex05_17_원태찬 {

	public static void main(String[] args) {
		
		Music m1=new Music(); // 생성자 통한 초기화       
		Music m2=new Music("찐이야","영탁","트로트",3000); // 넣어라 
		Music m3=new Music();// setter 통한 초기화
		m3.setTitle("가시");
		m3.setSinger("버즈");
		m3.setGenre("발라드");
		m3.setPrice(20000);
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		m2.display();
		System.out.println(m3.show());
	
//		m1 : getter 통한 출력
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 리턴받아 출력
	}
	

}
