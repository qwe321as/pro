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
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV시청");
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

public class Ex06_12_허용석 {
	public static void main(String[] args) {
		Phone p=new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.showSize();
		p.showColor();
	}
}
