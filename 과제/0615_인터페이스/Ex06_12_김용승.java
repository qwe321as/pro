interface Camera{
	void takePhoto(); // ���� ���
}
interface MP3{
	void playMp3(); // ���ǰ���
}
interface DMB{
	void viewTv(); //TV ��û
}
class Shape2{
	private int size;
	private String color;
	
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	
	int getSize() {
		return size;
	}
	
	String getColor() {
		return color;
	}
}

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	public void takePhoto() {
		System.out.println("���� ���");
	}
	public void playMp3() {
		System.out.println("���ǰ���");
	}
	public void viewTv() {
		System.out.println("TV ��û");
	}
	Phone(int size, String color){
		super(size,color);
	}
	
	
}
public class Ex06_12_���� {
	public static void main(String[] args) {
	Phone p = new Phone(7,"Blue");

	
	p.viewTv();// TV��û
	p.playMp3();// ���ǰ���
	p.takePhoto();// �������
	System.out.println(p.getSize());// 7
	System.out.println(p.getColor());// blue
	}
}
