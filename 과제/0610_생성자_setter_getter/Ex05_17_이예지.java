class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title="bang";
		singer="�����ͽ���";
		genre="��";
		price=20000;
	}
	Music(String t,String s,String g,int p){
		title=t;
		singer=s;
		genre=g;
		price=p;
	}

	void setTitle(String t){
		title=t;
	}
	void setSinger(String s){
		singer=s;
	}
	void setGenre(String g) {
		genre=g;
	}
	void setPrice(int p) {
		price=p;
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
	void display() {
		
		String singer="����";
		String title="��ȭ������";
		String genre="�߶��";
		int price =18000;
		
		System.out.println("����:"+singer);
		System.out.println("����:"+title);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
	}

}
public class Ex05_17_�̿��� {

	public static void main(String[] args) {

		Music m1=new Music();//������ ���ؼ� �� �ֱ�(�ʱ�ȭ
		
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		
		System.out.println();
		
		Music m2=new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		System.out.println();
		
		Music m3=new Music();//setter ���� �ʱ�ȭ
		
		m3.display();
		
		

//	m1:getter ���� ���
//	m2: �޼��� �ȿ��� ���
//	m3: �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���

	}

}
