interface Camera{
	void takePhoto(); //�������
}
interface MP3{
	void playMp3(); //���ǰ���
}
interface DMB{
	void viewTv(); //Ƽ���û
}
class Shape2{
	private int size;
	private String color;
	void shape2(int size, String color) {
		this.size=size;
		this.color=color;
	}
	public int getsize() {
		return size;
	}
	public String getcolor() {
		return color;
	}
}
class Phone extends Shape2 implements Camera, MP3, DMB{
	public void takePhoto() {
		System.out.println("�������");
	}
	public void playMp3() {
		System.out.println("���ǰ���");
	}
	public void viewTv() {
		System.out.println("TV��û");
	}
	public Phone(int size, String color){
		super.shape2(size, color);
	}

}

public class Ex06_12_������ {
	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		
		System.out.println(p.getsize());
		System.out.println(p.getcolor());
		
		System.out.println("============");
	
		DMB d = new Phone(0, null);
		d.viewTv();
		MP3 f = new Phone(0, null);
		f.playMp3();
		Camera g = new Phone(0, null);
		g.takePhoto();
		
		// -> �Ʒ� 5�� ���
		//Tv ��û 
		//���ǰ���
		//�������
		//7
		//blue
	}
}
