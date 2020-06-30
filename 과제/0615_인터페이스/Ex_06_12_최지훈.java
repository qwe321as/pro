interface Camera{
	void takePhoto();
}

interface MP3{
	void playmp3();
}

interface DMB{
	void viewTv();
}

class shape2{
	private int size;
	private String color;
}
class Phone extends shape2 implements Camera, MP3, DMB{
	
	private int size;
	
	private String color;
	
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

	Phone(int size,String color){
		this.size=size;
		this.color=color;
	}
	
	public void viewTv() {
		
		System.out.println("Ƽ�񺸱�");
	}

	@Override
	public void playmp3() {
		
		System.out.println("���ǰ���");
	}

	@Override
	public void takePhoto() {
		
		System.out.println("�������");
	}
	
}
public class Ex_06_12_������ {

	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue");
		p.takePhoto();
		p.playmp3();
		p.viewTv();
		p.setSize(7);
		p.setColor("blue");
		System.out.println(p.getSize());
		System.out.println(p.getColor());

	}

}
