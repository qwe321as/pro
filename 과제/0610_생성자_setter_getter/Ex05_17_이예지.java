class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title="bang";
		singer="애프터스쿨";
		genre="댄스";
		price=20000;
	}
	Music(String t,String s,String g,int p){
		title=t;
		singer=s;
		genre=g;
		price=p;
	}

	void setTitle(String t){
		title=t;
	}
	void setSinger(String s){
		singer=s;
	}
	void setGenre(String g) {
		genre=g;
	}
	void setPrice(int p) {
		price=p;
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
	void display() {
		
		String singer="규현";
		String title="광화문에서";
		String genre="발라드";
		int price =18000;
		
		System.out.println("가수:"+singer);
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
	}

}
public class Ex05_17_이예지 {

	public static void main(String[] args) {

		Music m1=new Music();//생성자 통해서 값 넣기(초기화
		
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println();
		
		Music m2=new Music("찐이야","영탁","트로트",3000);
		
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		System.out.println();
		
		Music m3=new Music();//setter 통한 초기화
		
		m3.display();
		
		

//	m1:getter 통한 출력
//	m2: 메서드 안에서 출력
//	m3: 메서드에서 멤버변수 4개 한번에 리턴받아 출력

	}

}
