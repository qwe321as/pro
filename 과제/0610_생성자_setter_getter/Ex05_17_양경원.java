class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "찐"; singer = "영탁"; genre = "트로트"; price = 3000;
	}
	Music(String title,String singer,String genre,int price){
		this.title = title; this.singer = singer; this.genre = genre; this.price = price;
	}
	
	void setTitle(String a) {
		title = a;
	}
	void setSinger(String a) {
		singer = a;
	}
	void setGenre(String a) {
		genre = a;
	}
	void setPrice(int a) {
		price = a;
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
		System.out.println("--------------------");
		System.out.println("ㅣ       title : " + title+"      ㅣ");
		System.out.println("ㅣ     singer : " + singer+"    ㅣ");
		System.out.println("ㅣ     genre : " + genre+"   ㅣ");
		System.out.println("ㅣ     price : " + price+"  ㅣ");
		System.out.println("--------------------");
	}
	void display(int a) {
		System.out.println("     ________");
		System.out.println("     /" + "      \\");
		System.out.println("    /" + "        \\");
		System.out.println("   /" + "          \\");
		System.out.println("  /" + "            \\");
		System.out.println(" /" + "              \\");
		System.out.println("/" + "                \\");
		System.out.println("-------------------");
	}
	
	String show(){
		return "ㅣ  " +title +" "+ singer +" "+ genre + " "+ price +"  ㅣ";
	}
	
}

public class Ex05_17_양경원 {

	public static void main(String[] args) {
		
		Music mu1 = new Music();//생성자 통한 초기화
		Music mu2 = new Music("찐","영탁","트로트",3000);
		Music mu3 = new Music();//setter 통한 초기화
		Music mu4 = new Music();//setter 통한 초기화
		mu4.display(1);
		
		//m1 : getter 통한 출력
		System.out.println("ㅣ             "+mu1.getTitle()+"              ㅣ");
		System.out.println("ㅣ           "+mu1.getSinger()+"             ㅣ");
		System.out.println("ㅣ          "+mu1.getGenre()+"            ㅣ");
		System.out.println("ㅣ          "+mu1.getPrice()+"       ㅣ");
		
		//m2 : 메서드 안ㅇ세서 출력
		mu2.display();
		
		//mu3 : 메서드에서 멤버변수 4개 하넌에 리턴받아 출력
		System.out.println(mu3.show());
		System.out.println("--------------------");

	}

}
