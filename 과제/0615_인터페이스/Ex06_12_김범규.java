interface Camera{
	void takePhoto(); // �������
}
interface MP3{
	void playMp3(); // ���ǰ���
}
interface DMB{
	void viewTv(); // TV��û
}

class Shape2{
	private int size; // 7
	private String color; // blue
	
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	public void display() {
		System.out.println(size+","+color);
	}
}

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	public void takePhoto() {
		System.out.println("�������");
	}
	public void playMp3() {
		System.out.println("���ǰ���");
	}
	public void viewTv() {
		System.out.println("TV��û");
	}
	Phone(int size, String color){
		super(size,color);
	}
	
	public void display() {
		super.display();
	}
	

}// phone

public class Ex06_12_����� {

	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue"); // (7,blue);
		
		p.takePhoto();
		p.playMp3();
		p.viewTv();
		p.display();
		
	} // main

} // class
