class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	Music(){
		title= "아로하";
		singer= "조정석";
		genre= "발라드";
		price= 4000;
	}

	Music(String title, String singer, String genre, int price){
		this.title= title;
		this.singer= singer;
		this.genre= genre;
		this.price= price;
	}

	void setTitle(String t){
		title= t;
	}
	void setSinger(String s){
		singer= s;
	}
	void setGenre(String g){
		genre= g;
	}
	void setPrice(int p){
		price= p;
	}

	String getTilte() {
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

	void display(){
		System.out.println("m2제목:"+title);
		System.out.println("m2가수:"+singer);
		System.out.println("m2장르:"+genre);
		System.out.println("m2가격:"+price);
		System.out.println("============");
	}
	String show(){
		return "m3제목:"+title +", " + "m3가수:"+singer +", " + "m3장르:"+genre +", " + "m3가격:"+price ;
	}


}//class


public class Ex05_17_이설아 {

	public static void main(String[] args) {

		Music m1= new Music();  //생성자 통한 초기화                    //getter통한 출력
		Music m2= new Music("찐이야", "영탁","트로트",3000); //메서드 안에서 출력  
		Music m3= new Music(); //setter 통한 초기화                  //일반메서드 리턴받아 한번에 출력(getter x)

		m3.setTitle("주저하는 연인들을 위해");
		m3.setSinger("잔나비");
		m3.setGenre("발라드");
		m3.setPrice(2000);

		System.out.println("m1제목:" +m1.getTilte());
		System.out.println("m1가수:" +m1.getSinger());
		System.out.println("m1장르:" +m1.getGenre());
		System.out.println("m1가격:" +m1.getPrice());
		System.out.println("------------");

		m2.display();
		System.out.println(m3.show());




	}

}
