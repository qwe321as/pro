class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	//1
	Music(){
		title = "�ϵ�ĳ��";
		singer = "got7";
		genre = "����";
		price = 2000;
	}
	//2
	Music(String t, String s, String g, int p){
		title = t;
		singer = s;
		genre = g;
		price = p;
		
	}
	
	//title
	void setTitle(String t){
		title = t;
	}
	String getTitle() {
		return title;
	}
	
	//singer
	void setSinger(String s){
		singer = s;
	}
	String getSinger() {
		return singer;
	}
	
	//genre
	void setGenre(String g){
		genre = g;
	}
	String getGenre() {
		return genre;
	}
	
	//price
	void setPrice(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
	
	//3
	String show() {
		title = "zombie";
		singer = "day6";
		genre = "��ũ";
		price = 1000;
		return "����:"+title+"����:"+singer+"�帣:"+genre+"����:"+price;
	}
	

}

public class Ex05_17_���� {
	public static void main(String[] args) {

		//�����ڸ� ���� �ʱ�ȭ
		Music m1 = new Music();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println("-----");
		
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());

		System.out.println("-----");
		
		//setter �޼��带 ����  �ʱ�ȭ
		Music m3 = new Music();
		System.out.println(m3.show());
		
		//m1 : getter ���� ���
		//m2 : �޼��� �ȿ��� ���
		//m3 : �޼��忡�� ������� 4���� �ѹ��� ���� �޾� ���
	}

}
