interface Camera{
	void takePhoto();//�������
}
interface MP3{
	void playMp3();//���ǰ���
}
interface DMB{
	void viewTv();//Ƽ���û
}
class Shape2{
	private int size;
	private String color;
	Shape2(int size,String color){
		this.size=size;
		this.color=color;
	}
	void display(){
		System.out.println("size:"+size);
		System.out.println("color:"+color);
	}
}
  class Phone extends Shape2 implements DMB,MP3,Camera{
	  Phone(int size,String color){
		  super(size,color);
	  }
	public void viewTv() {
		System.out.println("Ƽ���û");
	}
	public void playMp3() {
		System.out.println("���ǰ���");
	}
	public void takePhoto() {
		System.out.println("�������");
	}
//	@Override
//	public void takePhoto() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void playMp3() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void viewTv() {
//		// TODO Auto-generated method stub
//		
//	}
	

	
}
public class Ex06_12_������ {

	public static void main(String[] args) {
		Phone p=new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.display();
		/*�Ʒ� 5�� ����ϱ�
		 * Ƽ���û
		 * ���ǰ���
		 * �������
		 * 7
		 * blue
		 */

	}

}
