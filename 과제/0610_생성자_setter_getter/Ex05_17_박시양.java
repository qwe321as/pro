class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "�Ƹ���";
		singer = "������";
		genre = "�ο� ";
		price = 10000;
		System.out.println("title = \"�Ƹ���\";\r\n" + 
				"		singer = \"������\";\r\n" + 
				"		genre = \"�ο� \";\r\n" + 
				"		price = 10000;\n");
		}
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price =price;
	}
	void setTitle(String title){
		this.title = title;
	}
	String getTitel() {
		return title;
	}
	void setSinger(String singer){
		this.singer = singer;
	}
	String getSinger() {
		return singer;
	}
	void setEenre(String genre){
		this.genre = genre;
	}
	String getGenre() {
		return genre;
	}
	void setPrice(int price){
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
		
	}
	 String show() {
		 return "����: " + title + " ����: " + singer + " �帣: " + genre + " ����: " + price;
		 
	}


	
}

public class Ex05_17_�ڽþ� {
	public static void main(String[] args) {
		
		
		Music m1 = new Music(); //������ ���� �ʱ�ȭ
		Music m2 = new Music(); //
		Music m3 = new Music(); // setter ���� �ʱ�ȭ
		
		
//		m2 : getter ���� ���
		System.out.println(m1.getTitel());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println("=======");
		
//		m2 : �޼��� ���켭 ���
		m1.display();
		System.out.println("*******");
		
//		m3 : �޼��忡�� ������� 4���� �ѹ��� ���� �޾� ���
		System.out.println(m1.show());
		

	}

}
