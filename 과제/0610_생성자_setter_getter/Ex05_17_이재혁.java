class Music{
	private String title; 
	private String singer;
	private String genre;
	private int price; 
	
	
	Music(){
		title = "����"; 
		singer = "������";
		genre = "�߶�Ʈ";
		price = 5000;
	}
	
	Music(String t, String s, String g, int p){
		title = t;
		singer = s;
		genre = g;
		price = p;
	}
	
	void setTitle(String t){
		title = t;
	}
	String getTitle() {
		return title;
	}
		
	void setSinger(String s){
		singer = s;
	}
	String getSinger() {
		return singer;
	}
	
	void setGenre(String g){
		genre = g;
	}
	String getGenre() {
		return genre;
	}

	void setPrice(int p){
		price = p;
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
}

public class Ex05_17_������ {
	public static void main(String[] args) {
				
		Music m1 = new Music(); //������ ���� �ʱ�ȭ
//		m1 : getter ���� ���
		System.out.println("---m1---");
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
//		m2 : �޼��� �ȿ��� ���
		System.out.println("---m2---");
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		
		Music m3 = new Music();// setter ���� �ʱ�ȭ
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		System.out.println("---m3---");
		m3.display();

	}
}



