interface Camera{
	void takePhoto();
}
interface MP3{
	void playMP3();
}
interface DMB{
	void viewTv();
}

class Shape2{
	private int size;
	private String color;

	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
}
class Phone extends Shape2 implements Camera, MP3, DMB{

	Phone(int size, String color){
		super(size,color);
		System.out.println(size+","+color);
	}

	public void takePhoto() {
		System.out.println("�������");
	}
	public void playMP3() {
		System.out.println("�뷡���");
	}
	public void viewTv() {
		System.out.println("���󺸱�");
	}

}

public class Ex06_12_���� {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		p.takePhoto();
		p.playMP3();
		p.viewTv();



	}

}
