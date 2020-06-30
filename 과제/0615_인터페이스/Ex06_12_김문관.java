interface Camera{
	void takePhoto();
}

interface MP3{
	void playMp3();
}

interface DMB{
	void viewTv();
}

class Shaper2{
	private int size;
	private String color;
	
	Shaper2(int size, String color){
		this.size = size;
		this.color = color;
	}
	
	void show(){
		System.out.println(size);
		System.out.println(color);
	}
}

class Phone extends Shaper2 implements Camera, MP3, DMB{
	public void takePhoto() {
		System.out.println("������ ��´�");
	}
	
	public void playMp3() {
		System.out.println("������ ����Ѵ�");
	}
	
	public void viewTv() {
		System.out.println("DMB�� ��û�Ѵ�");
	}
	
	Phone(int size, String color){
		super(size, color);
	}
	
	void show() {
		super.show();
	}
	
}

public class Ex06_12_�蹮�� {

	public static void main(String[] args) {
		Phone p = new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.show();
		

	}

}
