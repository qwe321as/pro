interface RemoteControl{
	void turnOn();
	void turnOff();
}

//class Tv implements RemoteControl{
//
//	@Override
//	public void turnOn() {
//		System.out.println("Tv �Ҵ�.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("Tv ����.");
//	}
//}

public class Ex07_03_�͸� {
	public static void main(String[] args) {
//		new RemoteControl();
		
//		Tv t = new Tv();
//		t.turnOn();
//		t.turnOff();
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("Tv �Ҵ�.");
			} // turnOn()
			
			public void turnOff() {
				System.out.println("Tv ����.");
			}// turnOff()
		}; 
		
		rc.turnOn();
		rc.turnOff();
		
	}
}





