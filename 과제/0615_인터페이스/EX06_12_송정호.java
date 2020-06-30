
interface Camera {
	void takePhoto();
}

interface MP3 {
	void playMp3();
}

interface DMB {
	void viewTv();
}

class Shape2 {
	
	private int size;
	private String color;
		
	Shape2(int size, String color) {
		
		this.size = size;
		this.color = color;
	}
	
	void display() {
		
		System.out.println(size);
		System.out.println(color);
	}
}

class Phone extends Shape2 implements Camera, MP3, DMB {

	Phone(int size, String color) {
		super(size, color);
	}
	
	@Override
	public void viewTv() {
		
		System.out.println("TV�� ����.");
	}

	@Override
	public void playMp3() {
		
		System.out.println("�뷡�� ��´�.");
	}

	@Override
	public void takePhoto() {
		
		System.out.println("������ ��´�.");
	}	
}

public class EX06_12_����ȣ {

	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.display();
	}

}
