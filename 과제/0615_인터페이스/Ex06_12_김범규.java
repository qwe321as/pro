interface Camera{
	void takePhoto(); // 사진찍기
}
interface MP3{
	void playMp3(); // 음악감상
}
interface DMB{
	void viewTv(); // TV시청
}

class Shape2{
	private int size; // 7
	private String color; // blue
	
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	public void display() {
		System.out.println(size+","+color);
	}
}

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV시청");
	}
	Phone(int size, String color){
		super(size,color);
	}
	
	public void display() {
		super.display();
	}
	

}// phone

public class Ex06_12_김범규 {

	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue"); // (7,blue);
		
		p.takePhoto();
		p.playMp3();
		p.viewTv();
		p.display();
		
	} // main

} // class
