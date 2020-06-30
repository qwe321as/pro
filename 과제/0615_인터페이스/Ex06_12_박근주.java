interface Camera{
	void takePhoto();  //사진찍기
}
interface Mp3{
	void playMp3();//음악감상
}
interface Dmb{
	void viewTv();//tv시청
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
		System.out.println("사진찍기");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void viewTv() {
		System.out.println("tv시청");
	}
	
	
	
}

public class Ex06_12_박근주 {

	public static void main(String[] args) {
		
		 Phone p = new Phone(7,"blue");
		 
		 p.takePhoto();
		 p.playMp3();
		 p.viewTv();	 
		 System.out.println(p.getsize());
		 System.out.println(p.getcolor());
		 
	}

}
