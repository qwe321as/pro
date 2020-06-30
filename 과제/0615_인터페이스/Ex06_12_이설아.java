interface Camera {
	void takePhoto();  //사진찍기 출력
}
interface Mp3{
	void playMp3();   //음악감상 출력
}
interface DMB{
	void viewTv();    //tv시청 출력
}
class Shape2 {
	private int size;
	private String color;
	
	Shape2(int size,String color ){
		this.size= size;
		this.color =color;
	}
	int getSize(){
		return size;
	}
	String getColor() {
		return color;
	}
	
}
class Phone extends Shape2 implements Camera, Mp3, DMB{
	
	Phone(int size,String color){
		super(size,color);
	}

	public void viewTv() {
		System.out.println("TV시청");
	}

	public void playMp3() {
		System.out.println("음악감상");
	}

	public void takePhoto() {
		System.out.println("사진찍기");
	}
	

	
}

public class Ex06_12_이설아  {
	public static void main(String[] args) {

		Phone p = new Phone(7, "blue");
		p.playMp3();
		p.takePhoto();
		p.viewTv();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		
		
	}

}
