class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "�Ʒ���";
		singer = "��";
		genre = "�߶��";
		price = 20000;
	}
	
	Music(String title,String singer,String genre,int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	void setTitle(String title) {
		this.title=title;
	}
	String getTitle() {
		return title;
	}
	void setSinger(String singer) {
		this.singer=singer;
	}
	String getSinger() {
		return singer;
	}
	void setGenre(String genre) {
		this.genre=genre;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int price) {
		this.price=price;
	}
	int getPrice() {
		return price;
	}
	
	void display() {
		System.out.println("����:"+title);
		System.out.println("����:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
	}
	String show(){
		return "����:"+title + "����:"+singer +"�帣:"+genre +"����:"+price;
	}
	
}
public class Ex05_17_���½� {
	public static void main(String[] args) {

		Music m1 = new Music();  // ������ ���� �ʱ�ȭ
		System.out.println("==1��==");
		System.out.println("����:"+m1.getTitle());
		System.out.println("����:"+m1.getSinger());
		System.out.println("�帣:"+m1.getGenre());
		System.out.println("����:"+m1.getPrice());
		System.out.println();
		System.out.println("==2��==");
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		m2.display();
		Music m3 = new Music();  // setter ���� �ʱ�ȭ
		System.out.println();
		System.out.println("==3��==");
		m3.setTitle("WANNABE");
		m3.setSinger("ITZY");
		m3.setGenre("��");
		m3.setPrice(30000);
		System.out.println(m3.show());
		
//		m1 : getter ���� ���
//		m2 : �޼��� �ȿ��� ���
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		
	}

}
