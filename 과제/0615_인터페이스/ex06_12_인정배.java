interface camera{
	void takephoto();//��������
}
interface mp3{
	void playmp3();//������ Ʋ����
}
interface dmb{
	void viewtv();//tv ��û
}
class shape2{
	private int size;
	private String  color;

	public shape2(int size , String color) {
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void display(){
		System.out.println(size+"\n"+color);

	}
}
class phone extends shape2 implements camera,mp3,dmb{


	 int string;
	 String i;
	public phone(int i, String string) {
		super(i,string);
	}
	public void takephoto() {
		System.out.println("�������");
	}
	public void playmp3(){
		System.out.println("���� ����");

	}
	public void viewtv(){
		System.out.println("tv��û");

	}
	public void display(int i, String string) {
		
		System.out.println(i+"\n"+string);
	}
	
	

}

public class ex06_12_������ {
	public static void main(String[]args) {
		phone p = new phone(7,"blue");

		p.viewtv();
		p.takephoto();
		p.playmp3();
		p.display();

		/*
		 * tv ��û 
		 * ���� ���� 
		 * ���� ��� 
		 * 7 
		 * blue �̷������� ���
		 */

	}

}
