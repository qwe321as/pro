class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){//1
		
		title="��ȭ������";
		singer="����";
		genre="�߶��";
		price=30000;
		
	}

	
	Music(String title,String singer,String genre,int price){//2
		System.out.println();
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
		System.out.println("------------------------");
	}
	
	
	
	void setTitle(String t) {//3
		title=t;
	}
	void setSinger(String s) {
		singer=s;
	}
	void setGenre(String g) {
		genre=g;
	}
	void setPrice(int p) {
		price=p;
	}
	
	String getTitle() {//a1
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
	
	
	void display() {
		String title="Boom";
		String singer="NCT DREAM";
		String genre="��";
		int price=30000;
		
		
		System.out.println("����:"+title);
		System.out.println("����:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
public class Ex05_17_������ {

	public static void main(String[] args) {
//		Music m1=new Music();// ������ ���� �ʱ�ȭ
//		
//		//Music m2=new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
//		Music m3=new Music();//setter ���� �ʱ�ȭ
//		
////		m1:getter���� ���
////		m1: �޼��� �ȿ��� ���
////		m3: �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
		Music m1= new Music();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		
		Music m2= new Music("���̾�","��Ź","Ʈ��Ʈ",30000);
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		
		System.out.println("*************");
		
		Music m3= new Music();
		
		m3.display();
		
		
		System.out.println("===============");


	}

}
