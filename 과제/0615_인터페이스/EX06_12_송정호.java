
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
		
		System.out.println("TV를 본다.");
	}

	@Override
	public void playMp3() {
		
		System.out.println("노래를 듣는다.");
	}

	@Override
	public void takePhoto() {
		
		System.out.println("사진을 찍는다.");
	}	
}

public class EX06_12_송정호 {

	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.display();
	}

}
