class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	

	

	Music(){
		//System.out.println("m1");
		title = "��ī��";
		singer = "���座��";
		genre = "������";
		price = 5000;
		
	}
	Music(String title,String singer,String genre,int price){
		
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
		
	}
	
	void settitle(String title) {
		
		this.title = title;
	}
	String gettitle() {
		
		return title;
	}
	void setsinger(String singer) {
		
		this.singer = singer;
	}
	String getsinger() {
		
		return singer;
	}
	void setgenre(String genre) {
		
		this.genre = genre;
	}
	String getgenre() {
		return genre;
	}
	void setprice(int price) {
		
		this.price = price;
	}
	int getprice() {
		return price;
	}
	void end2() {
		System.out.println("�ι�°�뷡 ����: "+title);
		System.out.println("����: "+singer);
		System.out.println("�帣: "+genre);
		System.out.println("����: "+price);
		System.out.println();
	}
	String end() {
		return "����° �뷡����:"+title+"\n ����:"+singer+"\n �帣:"+genre+"\n ����:"+price;
	}
}




public class Ex05_17_�ڱ��� {

	public static void main(String[] args) {
		
		
		
		Music m1 = new Music(); // ������ ���� �ʱ�ȭ
		
//		m1 : getter ���� ���
//		m2 : �޼���ȿ��� ���
//		m3 : �޼��忡�� �ѹ��� ������� 4�� ���Ϲ޾� ���
		
		System.out.println("ù��° �뷡 ����:"+m1.gettitle());
		System.out.println("����: "+m1.getsinger());
		System.out.println("�帣: "+ m1.getgenre());
		System.out.println("����: "+m1.getprice());
		System.out.println();
		Music m2 = new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		m2.end2();
		
		Music m3 = new Music(); // setter ���� �ʱ�ȭ
		
		m3.settitle("��");
		m3.setsinger("��");
		m3.setgenre("����");
		m3.setprice(100);
		System.out.println(m3.end());

	}

}
