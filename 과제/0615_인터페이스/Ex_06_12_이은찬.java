interface Camera{ // �̿ϼ� �޼��常 ������ ��
	void takephoto(); // �������
}

interface MP3{
	void playMP3(); // ���ǰ���
}

interface DMB{
	void viewTv(); // TV��û
}

class Shape2{
	private int size;
	private String color;
	
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	
	void getPhone() {
		System.out.println("size="+size);
		System.out.println("color="+color);
	}
	
}

class Phone extends Shape2 implements Camera,MP3,DMB{
	
	Phone(int size, String color) {
		super(size, color);
	}

	public void takephoto() {
		System.out.println("�������");
	}
	
	public void playMP3() {
		System.out.println("���ǰ���");
	}
	
	public void viewTv() {
		System.out.println("TV��û");
	}
}

public class Ex_06_12_������ {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		p.takephoto();
		p.playMP3();
		p.viewTv();
		p.getPhone();
//		�Ʒ� 5�� ���
//		TV��û
//		���ǰ���
//		�������
//		7
//		blue
	}

}
