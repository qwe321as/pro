
public class Ex05_17_�濬�� {

	public static void main(String[] args) {

		Music m1 = new Music(); // ������ ���� �ʱ�ȭ

		//		m1 : getter ���� ���
		System.out.print("����:"+m1.getTitle());
		System.out.print("����:"+m1.getSinger());
		System.out.print("�帣:"+m1.getGenre());
		System.out.print("����:"+m1.getPrice());
		
//		m2 : �޼�Ʈ�ȿ��� ���
		System.out.println();
		Music m2 = new Music("���̾�", "��Ź", "Ʈ��Ʈ", 3000);
		m2.display();
		
		//m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		System.out.println();
		Music m3 = new Music(); // setter�����ʱ�ȭ
		m3.setTitle("�ѵζѶ�");
		m3.setSinger("����ũ");
		m3.setGenre("��");
		m3.setPrice(5000);
		System.out.println(m3.show());
	}

}

class Music {
	private String title;
	private String singer;
	private String genre;
	private int price;

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

	Music() { // ������
		this.title = "���ð�";
		this.singer = "������";
		this.genre = "�߶��";
		this.price = 10000;

	}

	Music(String title, String singer, String genre, int price) { //������
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
		
	}

	String show(){
		return "����:" + title +"����:"+singer+"�帣:"+genre+"����:"+price;
	}
	
	void display() {
		System.out.print("����:" + title);
		System.out.print("����:" + singer);
		System.out.print("�帣:" + genre);
		System.out.print("����:" + price);

	}

}
