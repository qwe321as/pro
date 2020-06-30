interface Camera{ // 미완성 메서드만 가져야 함
	void takephoto(); // 사진찍기
}

interface MP3{
	void playMP3(); // 음악감상
}

interface DMB{
	void viewTv(); // TV시청
}

class Shape2{
	private int size;
	private String color;
	
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	
	void getPhone() {
		System.out.println("size="+size);
		System.out.println("color="+color);
	}
	
}

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	Phone(int size, String color) {
		super(size, color);
	}

	public void takephoto() {
		System.out.println("사진찍기");
	}
	
	public void playMP3() {
		System.out.println("음악감상");
	}
	
	public void viewTv() {
		System.out.println("TV시청");
	}
}

public class Ex_06_12_이은찬 {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		p.takephoto();
		p.playMP3();
		p.viewTv();
		p.getPhone();
//		아래 5줄 출력
//		TV시청
//		음악감상
//		사진찍기
//		7
//		blue
	}

}
