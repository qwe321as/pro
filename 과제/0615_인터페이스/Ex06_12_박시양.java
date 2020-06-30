interface Camera{
	void takePhoto(); //���� ���
}

interface MP3{
	void playMp3(); //���� ����
}

interface DMB{
	void viewTv(); // TV��û
}

class Shape2{
	private int size;
	private String color;
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	public void show() {
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
	}
}

class Phone extends Shape2 implements Camera, MP3, DMB{
	Phone(int size, String color){
		super(size, color);		
	}
	public void show() {
		super.show();
	}
	
	public void takePhoto() {
		System.out.println("�������.");
	}
	public void playMp3() {
		System.out.println("���ǰ���.");
	}
	public void viewTv() {
		System.out.println("TV��û");
	}
}

public class Ex06_12_�ڽþ� {
	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		p.playMp3();
		p.takePhoto();
		p.viewTv();
		p.show();
//		Phone p = new Phone(7, "blue");

	}

}
