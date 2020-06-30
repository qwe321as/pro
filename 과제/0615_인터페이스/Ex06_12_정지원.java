interface Camera{
	void takePhoto();//사진찍기
}
interface MP3{
	void playMp3();//음악감상
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
		System.out.println("size:"+size);
		System.out.println("color:"+color);
	}
}
  class Phone extends Shape2 implements DMB,MP3,Camera{
	  Phone(int size,String color){
		  super(size,color);
	  }
	public void viewTv() {
		System.out.println("티비시청");
	}
	public void playMp3() {
		System.out.println("음악감상");
	}
	public void takePhoto() {
		System.out.println("사진찍기");
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
public class Ex06_12_정지원 {

	public static void main(String[] args) {
		Phone p=new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		p.display();
		/*아래 5줄 출력하기
		 * 티비시청
		 * 음악감상
		 * 사진찍기
		 * 7
		 * blue
		 */

	}

}
