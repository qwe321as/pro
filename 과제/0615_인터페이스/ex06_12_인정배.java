interface camera{
	void takephoto();//순간포착
}
interface mp3{
	void playmp3();//음악이 틀어져
}
interface dmb{
	void viewtv();//tv 시청
}
class shape2{
	private int size;
	private String  color;

	public shape2(int size , String color) {
		this.size = size;
		this.color = color;
	}

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

	void display(){
		System.out.println(size+"\n"+color);

	}
}
class phone extends shape2 implements camera,mp3,dmb{


	 int string;
	 String i;
	public phone(int i, String string) {
		super(i,string);
	}
	public void takephoto() {
		System.out.println("사진찍기");
	}
	public void playmp3(){
		System.out.println("음악 감상");

	}
	public void viewtv(){
		System.out.println("tv시청");

	}
	public void display(int i, String string) {
		
		System.out.println(i+"\n"+string);
	}
	
	

}

public class ex06_12_인정배 {
	public static void main(String[]args) {
		phone p = new phone(7,"blue");

		p.viewtv();
		p.takephoto();
		p.playmp3();
		p.display();

		/*
		 * tv 시청 
		 * 음악 감상 
		 * 사진 찍기 
		 * 7 
		 * blue 이런식으로 출력
		 */

	}

}
