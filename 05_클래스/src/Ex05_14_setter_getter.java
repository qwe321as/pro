//접근제어자(접근지정자):
//private
//X(default)
//protected
//public

class Tv2{
	private String color; // null
	private int channel; // 0
	private boolean power; // false
	
	
//	void setColor(String c){ // setter 메서드
//		color = c;
//	}
//	String getColor(){ // getter 메서드
//		return color;
//	}
//	
//	void setChannel(int c){ // setter 메서드
//		//if(c>0)
//		channel = c;
//	}
//	int getChannel(){ // getter 메서드
//		return channel;
//	}
//	void setPower(boolean p) { // setter 메서드
//		power = p;
//	}
//	boolean getPower() { // getter 메서드
//		return power;
//	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	void channelUp() { // 정의 
		channel++;
	}
	void power() { // 정의 
		power = !power;
	}
	
}//Tv

public class Ex05_14_setter_getter {
	public static void main(String[] args) {
		Tv2 t = new Tv2();
		//t.color = "red";
		t.setColor("red");
		
		//t.channel = -5;
		t.setChannel(5);
		
		//t.power = true;
		t.setPower(true);
		
		//System.out.println(t.color);
		System.out.println(t.getColor());
		
		//System.out.println(t.channel);
		System.out.println(t.getChannel());
		
		//System.out.println(t.power);
		System.out.println(t.isPower());
	}

}





