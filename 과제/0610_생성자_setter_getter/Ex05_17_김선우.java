class Music{
		private String title;
		private String singer;
		private String genre;
		private int price;
		
		Music(){
			
			title = "������";
			singer = "������";
			genre = "�߶��";
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
			return "����:"+title + " ����:"+singer+" �帣:"+genre+" ����:"+price;
		}
		
}
public class Ex05_17_�輱�� {

	public static void main(String[] args) {
		Music m1 = new Music();

		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);

		m2.display();
		System.out.println();
		
		Music m3 = new Music();//setter���� �ʱ�ȭ
		
		m3.setTitle("����");
		m3.setSinger("����");
		m3.setGenre("�� �߶��");
		m3.setPrice(2000);
		System.out.println(m3.show());
		
		
//		m1 : getter���� ���
//		m2 : �޼��� �ȿ��� ���
//		m3 : �޼��忡�� �ѹ��� ���Ϲ޾� ��� 
		
	}

}
