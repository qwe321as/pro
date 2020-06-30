interface Camera{
	void takePhoto(); //사진찍기
}

interface MP3{
	void playMp3(); //음악감상
}

interface DMB{
	void viewTv(); //TV시청
}

class Shape2{
	private int size;
	private String color;
	
	Shape2 (int size, String color){
		this.size = size;
		this.color = color;
	}
	
	void show() {
		System.out.println(size);
		System.out.println(color);
	}
}

class Phone extends Shape2 implements Camera, MP3, DMB {

	Phone(int size, String color) {
		super(size,color);
	}

	@Override
	public void viewTv() {
		System.out.println("사진찍기");
	}

	@Override
	public void playMp3() {
		System.out.println("음악감상");
	}

	@Override
	public void takePhoto() {
		System.out.println("TV시청");
	}
	
	void d() {
		super.show();
	}
	
}
public class Ex06_12_이재혁 {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.d();
		//		TV시청
		//		음악감상
		//		사진찍기
		//		7
		//		blue
	}

}
