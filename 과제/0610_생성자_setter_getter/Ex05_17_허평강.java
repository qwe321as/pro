class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	Music(){
		
		
		title = "������";
		singer = "�ƿ����̴�";
		genre = "��";
		price = 5000;
	}
	String getTitle() {
		return title;
	}
	String getSinger(){
		return singer;
	}
	String getGenre() {
		return genre;
	}
	int getPrice() {
		return price;
	}
	
	
	
	Music(String title,String singer,String genre,int price){
		
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
		
		
	}
	
	
	void xy(){
		System.out.println("����:"+title);
		System.out.println("������:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
		
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
		this.price =price;
	}
	
	
	
	
	String show() {
		return"����:"+ title+"\n������:"+ singer+"\n�帣:"+ genre+"\n����: "+ price;
	}
	
}



public class Ex05_17_���� {
	public static void main(String[] args) {
		
		Music m1 = new Music();
		System.out.println("����:"+m1.getTitle());
		System.out.println("������:"+m1.getSinger());
		System.out.println("�帣:"+m1.getGenre());
		System.out.println("����:"+m1.getPrice());
		
		System.out.println("++++++++++++");
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		m2.xy();		
		
		System.out.println("-----------");
		
		Music m3 = new Music(); 
		m3.setTitle("����");
		m3.setSinger("�ż���");
		m3.setGenre("���߶��");
		m3.setPrice(8000);
		
		System.out.println(m3.show());
		
//		Music m1 = new Music(); //���������� �ʱ�ȭ
//		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
//		Music m3 = new Music(); // setter ���� �ʱ�ȭ
//
//		m1 : getter ���� ���	
//		m2 : �޼��� �ȿ��� ���
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���

		
		
}	
	
	
}
