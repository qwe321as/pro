interface Camera{
	void takePhoto(); //사진찍기
}
interface MP3{
	void playMp3(); //음악감상
}
interface DMB{
	void viewTv(); //티비시청
}
class Shape2{
	private int size;
	private String color;
	void shape2(int size, String color) {
		this.size=size;
		this.color=color;
	}
	public int getsize() {
		return size;
	}
	public String getcolor() {
		return color;
	}
}
class Phone extends Shape2 implements Camera, MP3, DMB{
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV시청");
	}
	public Phone(int size, String color){
		super.shape2(size, color);
	}

}

public class Ex06_12_엄유안 {
	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		
		System.out.println(p.getsize());
		System.out.println(p.getcolor());
		
		System.out.println("============");
	
		DMB d = new Phone(0, null);
		d.viewTv();
		MP3 f = new Phone(0, null);
		f.playMp3();
		Camera g = new Phone(0, null);
		g.takePhoto();
		
		// -> 아래 5줄 출력
		//Tv 시청 
		//음악감상
		//사진찍기
		//7
		//blue
	}
}
