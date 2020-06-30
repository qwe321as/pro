class Robot{
//	void dance() {
//		System.out.println("dfsdf");
//	}
} // Robot

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}// DanceRobot

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}// SingRobot

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}// DrawRobot

public class Ex06_08_다형성 {
	public static void main(String[] args) {
		int a=1,b=2,c,d,e;
//		System.out.println(a);
		//int[] arr = {1,2,3};
//		System.out.println(arr[i]);
		
		//DanceRobot da = new DanceRobot();
		Robot da = new DanceRobot();
		//Robot da = (Robot)new DanceRobot();
		//da.dance();
		
		Robot sr = new SingRobot();
		//sr.sing();
		
		Robot dr = new DrawRobot();
		//dr.draw();
		
		Robot[] arr = {new DanceRobot(),
						new SingRobot(),
						new DrawRobot()
					};
		int i;
		for(i=0;i<arr.length;i++) {
			action(arr[i]);
		}
	}// main
	//Robot r = (Robot)new DanceRobot()
	//Robot r = (Robot)new SingRobot()
	static void action(Robot r) {
		//r.dance();
		if(r instanceof DanceRobot) {
			DanceRobot da = (DanceRobot)r;
			da.dance();
		}
		else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
}

//XYZ a = new ABCDEF();








