interface Camera{
	void takePhoto();  //�������
}
interface Mp3{
	void playMp3();//���ǰ���
}
interface Dmb{
	void viewTv();//tv��û
}
class Shape4{
	private int size;
	private String color;
	
	Shape4(int size,String color){
		this.size = size;
		this.color = color;
	
	}
		int getsize(){
			return size;
	}
	String getcolor() {
		return color;
	}
	
}


 class Phone extends Shape4 implements Camera,Mp3,Dmb{
	
	
	
	 Phone(int size, String color) {
		super(size,color);
	}
	public void takePhoto() {
		System.out.println("�������");
	}
	public void playMp3() {
		System.out.println("���ǰ���");
	}
	public void viewTv() {
		System.out.println("tv��û");
	}
	
	
	
}

public class Ex06_12_�ڱ��� {

	public static void main(String[] args) {
		
		 Phone p = new Phone(7,"blue");
		 
		 p.takePhoto();
		 p.playMp3();
		 p.viewTv();	 
		 System.out.println(p.getsize());
		 System.out.println(p.getcolor());
		 
	}

}
