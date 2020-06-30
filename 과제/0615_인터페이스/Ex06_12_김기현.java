interface Camera{
	void takePhoto();
}

interface Mp3{
	void playMp3();
}

interface DMB{
	void  viewTv();
}

class Shape2 {
	private int size;
	private String color;
	
	Shape2() {
		
	}
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


class Phone extends Shape2 implements Camera,Mp3,DMB {

	public Phone(int size, String color) {
		super(size,color);
		
	}

	public void viewTv() {
		System.out.println("tv본다");
	}
	
	public void playMp3() {
		System.out.println("노래듣는다");
	}

	public void takePhoto() {		
		System.out.println("사진찍는다");
	}

	
	
}

public class Ex06_12_김기현 {
	public static void main(String[] args) {
		

		Phone p = new Phone(7,"blue");
			
		p.playMp3();
		p.takePhoto();
		p.viewTv();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
	
		
//		Phone p = new Phone(7,"blue");
	}

}
