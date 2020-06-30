interface Camera{
	void takePhoto(); // �������
}

interface MP3{
	void playMP3(); // ���ǰ���
}

interface DMB{
	void viewTv();//tv��û
}

class shape2{	
	private int size;
	private String color;

	shape2(int size,String color){
		this.size=size;
		this.color=color;
	}
	int getSize(){
		return size;
	}
	String getColor(){
		return color;
	}
	void show(){
		System.out.println(size+","+color);
	}
}



class Phone extends shape2 implements Camera,MP3,DMB{

	Phone(int size,String color){
		super(size,color);
	}

	public void takePhoto() {
		System.out.println("�������");
	}

	public void playMP3() {
		System.out.println("���ǰ���");
	}

	public void viewTv() {
		System.out.println("tv��û");
	}
	void show() {
		super.show();
	}

}//Phone


public class Ex06_12_���� {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		p.takePhoto();
		p.playMP3();
		p.viewTv();
		p.show();

		System.out.println(p.getSize());
		System.out.println(p.getColor());

	}

}
