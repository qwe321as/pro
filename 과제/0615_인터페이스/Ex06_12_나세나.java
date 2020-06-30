interface Camera{
	void takePhoto();
}

interface MP3{
	void playMp3();
}

interface DMB{
	void viewTv();
}
class Shape2{
	private int size;
	private String color;

	 Shape2(int size, String color){
		this.size=size;
		this.color=color;
	}
	  void display(){
	System.out.println(size);
	System.out.println(color);
	 }
}


class Phone extends Shape2 implements Camera, MP3, DMB{
	
	
	public Phone(int size, String color){
		super(size, color);
	}
	
	
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV시청");
	}

	
	
	
	
	
}
public class Ex06_12_나세나 {

	
	public static void main(String[] args) {

		Phone p=new Phone(7, "blue");
		
		p.takePhoto();
		p.playMp3();
		p.viewTv();
		p.display();
		
		//		아래 5줄 출력
		//		TV시청
		//		음악감상
		//		사진찍기
		//		7
		//		blue
		//	
	}

}
