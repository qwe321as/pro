class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	
	Music(){ // ������(Constructor) // �տ� ���̵�� ����Ÿ�� ��� ���� ��� �� ���� �߻�
		title = "RIDE";
		singer = "SOLE(��)";
		genre = "R&B";
		price = 10000;
				
	}
	
	Music(String title, String singer, String genre, int price){ 
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void display() {
		System.out.println("title:"+title);
		System.out.println("singer:"+singer);
		System.out.println("genre:"+genre);
		System.out.println("price:"+price);
		System.out.println();
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
	
	void setTitle(String t) {
		title = t;		
	}
	
	void setSinger(String s) {
		singer = s;
	}
	
	void setGenre(String g) {
		genre = g;
	}
	
	void setPrice(int p) {
		price = p;
	}
	
	String show() {
		return "title:" +title +"," + "singer:" +singer +
				"genre:" +genre +","+"price:" +price;	
	}
}

public class Ex_05_17_������ {
	public static void main(String[] args) {
		
	/*	Music m1 = new Music(); // ������ ���� �ʱ�ȭ
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000); 
		Music m3 = new Music(); // setter ���� �ʱ�ȭ
		
		m1 : getter ���� ���
		m2 : �޼��� �ȿ��� ���
		m3 : �޼��忡�� ������� 4���� �ѹ��� ���Ϲ޾� ��� */
		
		Music m1 = new Music();
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		Music m3 = new Music();
		
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		m2.display();
		m3.setTitle("ó��ó��");
		m3.setSinger("Mc the Max");
		m3.setGenre("�߶��");
		m3.setPrice(5000);
		System.out.println(m3.show());
	}

}
