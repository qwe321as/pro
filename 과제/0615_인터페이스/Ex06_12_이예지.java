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
}
class Phone extends Shape2 implements Camera, MP3,DMB {
	public void takePhoto(){
		System.out.println("�������");
	}
	public void playMp3(){
		System.out.println("���ǰ���");
	}

	public void viewTv() {
		System.out.println("TV����");		
	}
	public Phone(int size, String color) {
		System.out.println(size);
		System.out.println(color);
	}
}
public class Ex06_12_�̿��� {
	public static void main(String[] args) {
		
	
	Phone p = new Phone(7,"blule");
	p.takePhoto();
	p.playMp3();
	p.viewTv();
	
	}
}
