interface Camera{
	void takePhoto();     //사진찍기
}

interface MP3{
	void playMp3();      //음악감상
}

interface DMB{
	void viewTv();       //TV시청
} 
class Shape2{
	private int size;
	private String color;
	
	Shape2(int size, String color){         //생성자
		this.size=size;
		this.color=color;
	}
	void display() {                       //출력
		System.out.println(size);
		System.out.println(color);
	}
	
}


class Phone extends Shape2 implements Camera,MP3,DMB {
	public void takePhoto() {
		System.out.println("TV시청");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("사진찍기");
	}
	Phone(int size,String color){         //생성자
		super(size,color);
	} 
	void display() {                      //출력
		super.display();
	}
}
public class Ex06_12_원태찬 {

	public static void main(String[] args) {
			Phone p=new Phone(7,"blue");
			p.takePhoto();
			p.playMp3();
			p.viewTv();
			p.display();
//			TV시청
//			음악감상
//			사진찍기
//			7
//			blue
	}

}
