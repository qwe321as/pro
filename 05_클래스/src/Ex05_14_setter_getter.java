//����������(����������):
//private
//X(default)
//protected
//public

class Tv2{
	private String color; // null
	private int channel; // 0
	private boolean power; // false
	
	
//	void setColor(String c){ // setter �޼���
//		color = c;
//	}
//	String getColor(){ // getter �޼���
//		return color;
//	}
//	
//	void setChannel(int c){ // setter �޼���
//		//if(c>0)
//		channel = c;
//	}
//	int getChannel(){ // getter �޼���
//		return channel;
//	}
//	void setPower(boolean p) { // setter �޼���
//		power = p;
//	}
//	boolean getPower() { // getter �޼���
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
	void channelUp() { // ���� 
		channel++;
	}
	void power() { // ���� 
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





