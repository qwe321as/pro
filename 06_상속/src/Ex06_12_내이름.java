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
	private int size;
	private String color;
	
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

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	Phone(int size,String color){
//		this.size = size; // 
//		this.color = color;
		super(size,color);
	}

	@Override
	public void viewTv() {
		System.out.println("TV��û");
	}

	@Override
	public void playMp3() {
		System.out.println("���ǰ���");
	}

	@Override
	public void takePhoto() {
		System.out.println("���� ���");
	}
	
}

public class Ex06_12_���̸� {
	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue");
		
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
//		�Ʒ� 5�� ���
//		TV��û
//		���ǰ���
//		�������
//		7
//		blue
	}
}



