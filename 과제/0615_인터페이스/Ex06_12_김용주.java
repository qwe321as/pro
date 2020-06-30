interface Camera{
	void takePhote(); //사진찍기
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
	
	public Shape2(int size, String color) {
		this.size=size;
		this.color=color;
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
	
}

class Phone extends Shape2 implements Camera,MP3,DMB{

//    private int size;
//	private String color;
	
   
	public Phone(int size, String color) {
		super(size, color);		
		
	}
	

	public void viewTv() {
		System.out.println("TV를 본다.");
		
	}

	
	public void playMp3() {
		System.out.println("MP3를 실행한다.");
		
	}

	
	public void takePhote() {
		System.out.println("사진을 찍다.");
		
	}


	
	
} // 

public class Ex06_12_김용주 {

	public static void main(String[] args) {
		Phone p = new Phone(7, "blue");
		p.getSize();
		p.getColor();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		p.viewTv();
		p.playMp3();
		p.takePhote();

	}

}
