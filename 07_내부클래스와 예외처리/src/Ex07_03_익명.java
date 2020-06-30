interface RemoteControl{
	void turnOn();
	void turnOff();
}

//class Tv implements RemoteControl{
//
//	@Override
//	public void turnOn() {
//		System.out.println("Tv ÄÒ´Ù.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("Tv ²ö´Ù.");
//	}
//}

public class Ex07_03_ÀÍ¸í {
	public static void main(String[] args) {
//		new RemoteControl();
		
//		Tv t = new Tv();
//		t.turnOn();
//		t.turnOff();
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("Tv ÄÒ´Ù.");
			} // turnOn()
			
			public void turnOff() {
				System.out.println("Tv ²ö´Ù.");
			}// turnOff()
		}; 
		
		rc.turnOn();
		rc.turnOff();
		
	}
}





