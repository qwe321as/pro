
interface Camera {

	abstract void takePhoto();		// "�������" ���

}
interface MP3 {				// "���ǰ���" ���
	void playMp3();

}
interface DMB {				//"TV��û"
	void viewTV();

}
class Shape2 {

	private int size;
	private String color;

	Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}

void show() {
	System.out.println("������:" + size);
	System.out.println("����:" + color);
}


}

class Phone extends Shape2 implements Camera, MP3, DMB {

	Phone(int size, String color) {
		super(size, color);
	}
	
	
	
	public void ViewTV() {
		System.out.println("TV��û");
		
	}

	
	public void PlayMp3() {
		System.out.println("���ǰ���");
		
		
	}

	
	public void takePhoto() {
		System.out.println("�������");
		
		
	}

}
public class Ex06_12_��ûȣ {

	public static void main(String[] args) {

		Phone p = new Phone(7,"blue");
		
		p.ViewTV();
		p.PlayMp3();
		p.takePhoto();
		p.show();
		

		// "�������"
		// "���ǰ���"
		// "TV��û"
		//7
		//blue
	}

}
