interface Camera{
	void takePhoto();
}

interface MP3{
	void playMp3();
}

interface DMB{
	void viewTv();
}

class Shape2 { 
	private int size;
	private String color;
	
	Shape2(int size, String color) {
		this.size=size;
		this.color=color;
	}
	void display() {
		System.out.println(size);
		System.out.println(color);
	}
}


class Phone extends Shape2 implements Camera, MP3, DMB{
	Phone(int size, String color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("티비감상");
	}
}
public class Ex06_12_김선우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone(7,"blue");
		p.takePhoto();
		p.playMp3();
		p.viewTv();
		p.display();
	}

}
