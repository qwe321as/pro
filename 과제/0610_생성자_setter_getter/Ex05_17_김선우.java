class Music{
		private String title;
		private String singer;
		private String genre;
		private int price;
		
		Music(){
			
			title = "밤편지";
			singer = "아이유";
			genre = "발라드";
			price = 1000;
		}
		Music(String title, String singer, String genre, int price){
			this.title=title;
			this.singer=singer;
			this.genre=genre;
			this.price=price;
		}

		void display() {
			System.out.println("title:"+title);
			System.out.println("singer:"+singer);
			System.out.println("genre:"+genre);
			System.out.println("price:"+price);
		}
		
		void setTitle (String title) {
			this.title = title;
		}
		void setSinger(String singer) {
			this.singer= singer;
		}
		void setGenre(String genre) {
			this.genre= genre;
		}
		void setPrice (int price) {
			this.price=price;
		}
		
		String getTitle () {
			return title;
		}
		String getSinger () {
			return singer;
		}
		String getGenre () {
			return genre;
		}
		int getPrice() {
			return price;
		}
		
		
		String show() {
			return "제목:"+title + " 가수:"+singer+" 장르:"+genre+" 가격:"+price;
		}
		
}
public class Ex05_17_김선우 {

	public static void main(String[] args) {
		Music m1 = new Music();

		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		Music m2 = new Music("찐이야","영탁","트로트",3000);

		m2.display();
		System.out.println();
		
		Music m3 = new Music();//setter통한 초기화
		
		m3.setTitle("혜성");
		m3.setSinger("윤하");
		m3.setGenre("락 발라드");
		m3.setPrice(2000);
		System.out.println(m3.show());
		
		
//		m1 : getter통한 출력
//		m2 : 메서드 안에서 출력
//		m3 : 메서드에서 한번에 리턴받아 출력 
		
	}

}
