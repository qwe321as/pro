class Music{ 	
	private String title;	
	private String singer;
	private String genre;
	private int price;
	
	
	Music () {
		System.out.println("Music ������");
	
		title = "�߻�ȭ";
		singer = "��ȿ��";
		genre = "�߶��";
		price = 1000;
	}
		
	Music(String title, String singer, String genre, int price){	//������ �����ε�
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}	
	
	
	
	
	void setTitle(String a) {
		title = a;
	}	
	String getTitle()	{
		return title;
	}
	void setSinger(String b) {
		title = b;
	}
	String getSinger()	{
		return singer;
	}
	void setGenre(String c) {
		title = c;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int d) {
		price = d;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println("title:" + title);
		System.out.println("singer:" + singer);
		System.out.println("genre:" + genre);
		System.out.println("price:" + price);
	}

	String show() {
	return
			"����:"+title+"  ����:"+singer+"  �帣:"+genre+"  ����"+price;
	}
	
	
}


public class Ex05_17_��ûȣ {

	public static void main(String[] args) {
		
		
		Music m1 = new Music();		//������ ���� �ʱ�ȭ
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println("==================");
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
			m2.display();
		
		
		
		System.out.println();
		Music m3 = new Music();		//setter �ʱ�ȭ
		System.out.println("����:"+m1.getTitle());
		System.out.println("����:"+m1.getSinger());
		System.out.println("�帣:"+m1.getGenre());
		System.out.println("����:"+m1.getPrice());
		System.out.println("=================");

		//m1 : getter ���� ���
		//m2 : �޼��� ���� ���
		//m3 : �޼��忡�� �ѹ��� ������� 4�� ���Ϲ޾� ���
	}

}
