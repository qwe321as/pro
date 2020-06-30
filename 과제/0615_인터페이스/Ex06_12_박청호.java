
interface Camera {

	abstract void takePhoto();		// "사진찍기" 출력

}
interface MP3 {				// "음악감상" 출력
	void playMp3();

}
interface DMB {				//"TV시청"
	void viewTV();

}
class Shape2 {

	private int size;
	private String color;

	Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}

void show() {
	System.out.println("사이즈:" + size);
	System.out.println("색깔:" + color);
}


}

class Phone extends Shape2 implements Camera, MP3, DMB {

	Phone(int size, String color) {
		super(size, color);
	}
	
	
	
	public void ViewTV() {
		System.out.println("TV시청");
		
	}

	
	public void PlayMp3() {
		System.out.println("음악감상");
		
		
	}

	
	public void takePhoto() {
		System.out.println("사진찍기");
		
		
	}

}
public class Ex06_12_박청호 {

	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		
		p.ViewTV();
		p.PlayMp3();
		p.takePhoto();
		p.show();
		

		// "사진찍기"
		// "음악감상"
		// "TV시청"
		//7
		//blue
	}

}
