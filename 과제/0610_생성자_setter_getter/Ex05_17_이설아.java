class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	Music(){
		title= "�Ʒ���";
		singer= "������";
		genre= "�߶��";
		price= 4000;
	}

	Music(String title, String singer, String genre, int price){
		this.title= title;
		this.singer= singer;
		this.genre= genre;
		this.price= price;
	}

	void setTitle(String t){
		title= t;
	}
	void setSinger(String s){
		singer= s;
	}
	void setGenre(String g){
		genre= g;
	}
	void setPrice(int p){
		price= p;
	}

	String getTilte() {
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

	void display(){
		System.out.println("m2����:"+title);
		System.out.println("m2����:"+singer);
		System.out.println("m2�帣:"+genre);
		System.out.println("m2����:"+price);
		System.out.println("============");
	}
	String show(){
		return "m3����:"+title +", " + "m3����:"+singer +", " + "m3�帣:"+genre +", " + "m3����:"+price ;
	}


}//class


public class Ex05_17_�̼��� {

	public static void main(String[] args) {

		Music m1= new Music();  //������ ���� �ʱ�ȭ                    //getter���� ���
		Music m2= new Music("���̾�", "��Ź","Ʈ��Ʈ",3000); //�޼��� �ȿ��� ���  
		Music m3= new Music(); //setter ���� �ʱ�ȭ                  //�Ϲݸ޼��� ���Ϲ޾� �ѹ��� ���(getter x)

		m3.setTitle("�����ϴ� ���ε��� ����");
		m3.setSinger("�ܳ���");
		m3.setGenre("�߶��");
		m3.setPrice(2000);

		System.out.println("m1����:" +m1.getTilte());
		System.out.println("m1����:" +m1.getSinger());
		System.out.println("m1�帣:" +m1.getGenre());
		System.out.println("m1����:" +m1.getPrice());
		System.out.println("------------");

		m2.display();
		System.out.println(m3.show());




	}

}
