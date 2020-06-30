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
	private int size;
	private String color;
	
	Shape2(int size,String color){
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
	
	Phone(int size,String color){
//		this.size = size; // 
//		this.color = color;
		super(size,color);
	}

	@Override
	public void viewTv() {
		System.out.println("TV시청");
	}

	@Override
	public void playMp3() {
		System.out.println("음악감상");
	}

	@Override
	public void takePhoto() {
		System.out.println("사진 찍기");
	}
	
}

public class Ex06_12_내이름 {
	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue");
		
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
//		아래 5줄 출력
//		TV시청
//		음악감상
//		사진찍기
//		7
//		blue
	}
}



