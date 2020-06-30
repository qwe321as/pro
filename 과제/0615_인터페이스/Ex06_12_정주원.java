interface Camera{
	void takephoto();//사진찍기
}
interface MP3{
	void playMP3();//음악감상
}
interface DMB{
	void viewTv();//티비시청
}
class Shape2{
	private int size;
	private String color;
	Shape2(int size,String color){
		this.size=size;
		this.color=color;
	}
	void display(){
		System.out.println(size);
		System.out.println(color);
	}
}
class Phone extends Shape2 implements Camera,MP3,DMB{
	Phone(int size,String color){
		super(size,color);
	}
//		void display() {
//			super.display();
//		}
	
	public void takephoto() {
		System.out.println("사진찍기");
	}
	public void playMP3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("TV시청");
	}
	
}
public class Ex06_12_정주원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p= new Phone(7,"blue");
		p.viewTv();
		p.playMP3();
		p.takephoto();
		p.display();
		
	}

}
