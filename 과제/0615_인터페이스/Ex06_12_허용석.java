interface Camera{
	void takePhoto();
}
interface MP3{
	void playMp3();
}
interface DMB{
	void viewTv();
}
class Shape2{
	private int size;
	private String color;
	public Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
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

	public Phone(int size, String color) {
		super(size, color);
	}

	public void showSize() {
		System.out.println(getSize());
	}

	public void showColor() {
		System.out.println(getColor());
	}
}

public class Ex06_12_��뼮 {
	public static void main(String[] args) {
		Phone p=new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.showSize();
		p.showColor();
	}
}
