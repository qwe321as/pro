class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	public Music() {
		super();
		title = "���ø��";
		singer = "������";
		genre = "�߶��";
		price = 1000;
	}

	public Music(String title, String singer, String genre, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	Music(){
//		title = "���ø��";
//		singer = "������";
//		genre = "�߶��";
//		price = 1000;
//	}
//	
//	Music(String title,String singer,String genre,int price){
//		this.title = title;
//		this.singer = singer;
//		this.genre = genre;
//		this.price = price;
//	}
	
//	void setTitle(String title){
//		this.title = title;
//		//return;
//	}
//	String getTitle(){
//		return title;
//	}
//	
//	
//	void setSinger(String singer) {
//		this.singer = singer;
//	}
//	
//	String getSinger() {
//		return singer;
//	}
//	
//	void setGenre(String genre) {
//		this.genre = genre;
//	}
//	String getGenre() {
//		return genre;
//	}
//	
//	void setPrice(int price) {
//		this.price = price;
//	}
//	int getPrice() {
//		return price;
//	}
	 
	void display(){
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		System.out.println();
	}
	
	String show(){
		return title+","+singer+","+genre+","+price;
	}
}

public class Ex05_17_���̸� {
	public static void main(String[] args) {

		Music m1 = new Music(); // ������ ���� �ʱ�ȭ
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		Music m3 = new Music(); // setter ���� �ʱ�ȭ 
		
//		���� Music ��ü 3���� �迭�� �����.
//		show() ���� ���
		Music[] ms = new Music[3];
		ms[0]=new Music();
		ms[1]=new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		ms[2]=new Music();
		
		ms[2].setTitle("�ܹ߸Ӹ�");
		ms[2].setSinger("������");
		ms[2].setGenre("��");
		ms[2].setPrice(5000);
		int i;
		for(i=0;i<ms.length;i++) {
			System.out.println(ms[i].show());
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//m1.title = "abc";
		//System.out.println(m1.title);
		
		
//		m1 : getter ���� ���
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		
//		m2 : �޼��� �ȿ��� ���
		m2.display();
		
		m3.setTitle("�ܹ߸Ӹ�");
		m3.setSinger("������");
		m3.setGenre("��");
		m3.setPrice(5000);
		System.out.println(m3.show());
		
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		
		
	}

}


