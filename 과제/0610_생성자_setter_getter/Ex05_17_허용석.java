class Music{
	private String title;
	private String singer;
	private String ganre;
	private int price;
	// ������ ���� �ʱ�ȭ
	Music() {
		title="ų�����ڷ��� ǥ��";
		singer="������";
		ganre="����";
		price=150000;
	}
	
	Music(String title, String singer, String ganre, int price) {
		this.title=title;
		this.singer=singer;
		this.ganre=ganre;
		this.price=price;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	
	void setSinger(String singer) {
		this.singer=singer;
	}
	
	void setGanre(String ganre) {
		this.ganre=ganre;
	}
	
	void setPrice(int price) {
		this.price=price;
	}
	
	String getTitle() {
		return title;
	}
	
	String getSinger() {
		return singer;
	}
	
	String getGanre() {
		return ganre;
	}
	
	int getPrice() {
		return price;
	}
	
	void display1() {
		System.out.println("�뷡: "+title);
		System.out.println("����: "+singer);
		System.out.println("�帣: "+ganre);
		System.out.println("Ƽ��: "+price+"��");
	}
	String display2() {
		return "�뷡: "+title+", ����: "+singer+", �帣: "+ganre+", Ƽ��: "+price+"��";
	}
	
}
public class Ex05_17_��뼮 {
	public static void main(String[] args) {
		
		Music m1=new Music(); //������ ���� �ʱ�ȭ
		Music m2=new Music("���̾�","��Ź","Ʈ��Ʈ",30000); //
		Music m3=new Music(); // setter ���� �ʱ�ȭ
		
//		m1 : getter ���� ���
		System.out.println("=============+ getter ���� ��� +=============");
		System.out.println("�뷡: "+m1.getTitle());
		System.out.println("����: "+m1.getSinger());
		System.out.println("�帣: "+m1.getGanre());
		System.out.println("Ƽ��: "+m1.getPrice()+"��");
		System.out.println();
		
//		m2 : �޼���ȿ��� ���
		System.out.println("==============+ �޼���ȿ��� ��� +==============");
		m2.display1();
		System.out.println();
		
//		m3 : �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		m3.setTitle("����");
		m3.setSinger("���ƾ�");
		m3.setGanre("����");
		m3.setPrice(200000);
		System.out.println("=====+ �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ��� +====");
		System.out.println(m3.display2());
	}

}
