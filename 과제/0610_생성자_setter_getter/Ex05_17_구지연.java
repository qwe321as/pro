class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	
	Music(){
		title = "TT";
		singer = "twice";
		genre = "Kpop";
		price = 500;
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
	
		
		
	Music(String t, String s, String g, int p){
		
		 title = t;
		 singer = s;
		 genre = g;
		 price = p;
		}	

	
	void display() {
		System.out.println("title: " + title);
		System.out.println("singer: " + singer);
		System.out.println("genre: " + genre);
		System.out.println("price: " + price + "$");
	}
			
	
	
				void setTitle(String title) {
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
		
				
				

		
		
		String show() {
			return "title: " + title +"\n"+ "singer: "+ singer +"\n" +"genre: "+ genre + "\n" +"price: "+ price + "$"; 
		}
		}





public class Ex05_17_������ {
	public static void main(String[] args) {

		Music m1 = new Music();//������ ���� �ʱ�ȭ
		System.out.println("----m1----");
		System.out.println("title: " + m1.getTitle());
		System.out.println("singer: " + m1.getSinger());
		System.out.println("genre: " + m1.getGenre());
		System.out.println("price: " + m1.getPrice() + "$");
		System.out.println();
//		m1: getter ���� ���
		
		
		System.out.println("----m2----");
		Music m2 = new Music("Thankyou,next.","Ariana grande","Pop",100); 
		m2.display();
		 
//		m2: �޼��� �ȿ��� ���
System.out.println();
		
		 //setter ���� �ʱ�ȭ
		System.out.println("----m3----");
		Music m3 = new Music();
		m3.setTitle("���̾�");    //("���̾�,"��Ź","Ʈ��Ʈ",3000);
		m3.setSinger("��Ź");
		m3.setGenre("Ʈ��Ʈ");
		m3.setPrice(400);
		System.out.println(m3.show());
		//		m3: �Ϲ� �޼���(getter�ƴ�)���� �������4��  �ѹ��� ���Ϲ޾� ���
	}

}
