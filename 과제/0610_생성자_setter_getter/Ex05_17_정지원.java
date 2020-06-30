class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){//1
		
		title="광화문에서";
		singer="규현";
		genre="발라드";
		price=30000;
		
	}

	
	Music(String title,String singer,String genre,int price){//2
		System.out.println();
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
		System.out.println("------------------------");
	}
	
	
	
	void setTitle(String t) {//3
		title=t;
	}
	void setSinger(String s) {
		singer=s;
	}
	void setGenre(String g) {
		genre=g;
	}
	void setPrice(int p) {
		price=p;
	}
	
	String getTitle() {//a1
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
		String title="Boom";
		String singer="NCT DREAM";
		String genre="댄스";
		int price=30000;
		
		
		System.out.println("제목:"+title);
		System.out.println("가수:"+singer);
		System.out.println("장르:"+genre);
		System.out.println("가격:"+price);
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
public class Ex05_17_정지원 {

	public static void main(String[] args) {
//		Music m1=new Music();// 생성자 통한 초기화
//		
//		//Music m2=new Music("찐이야","영탁","트로트",3000);
//		Music m3=new Music();//setter 통한 초기화
//		
////		m1:getter통해 출력
////		m1: 메서드 안에서 출력
////		m3: 메서드에서 멤버변수 4개 한번에 리턴받아 출력
		Music m1= new Music();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		
		Music m2= new Music("찐이야","영탁","트로트",30000);
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		
		System.out.println("*************");
		
		Music m3= new Music();
		
		m3.display();
		
		
		System.out.println("===============");


	}

}
