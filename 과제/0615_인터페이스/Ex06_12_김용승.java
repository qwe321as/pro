interface Camera{
	void takePhoto(); // 사진 찍기
}
interface MP3{
	void playMp3(); // 음악감상
}
interface DMB{
	void viewTv(); //TV 시청
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
		System.out.println("사진 찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV 시청");
	}
	Phone(int size, String color){
		super(size,color);
	}
	
	
}
public class Ex06_12_김용승 {
	public static void main(String[] args) {
	Phone p = new Phone(7,"Blue");

	
	p.viewTv();// TV시청
	p.playMp3();// 음악감상
	p.takePhoto();// 사진찍기
	System.out.println(p.getSize());// 7
	System.out.println(p.getColor());// blue
	}
}
