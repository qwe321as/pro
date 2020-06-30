abstract class Employee2{
	String empno;
	String name;
	int pay;

	public Employee2(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	void display() {
		System.out.println("사번: "+empno);
		System.out.println("이름: "+name);
		System.out.println("금액: "+pay);
	}
	
	abstract void getMonthPay();
	
}// Employee2

class FullTime extends Employee2{
	int bonus;
	FullTime(String empno, String name,int pay, int bonus){
		super(empno,name,pay);
		this.bonus = bonus;
	}
	
	void display() {
		super.display();
		System.out.println("보너스: " + bonus);
		System.out.println("getMonthPay: "+(pay/(double)12)+(bonus/(double)12));
	}

	void getMonthPay() {
		
	}
	

}//FullTime

class Contract extends Employee2{ 
	int hireYear;
	Contract(String empno, String name,int pay, int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	
	void display() {
		super.display();
		System.out.println("계약기간: "+hireYear);
		System.out.println("getMonthPay: "+ (pay/(double)12) * hireYear);
	}

	void getMonthPay() {
		
	}

}//Contract

class PartTime extends Employee2{
	int workDay;
	PartTime(String empno, String name,int pay, int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	void display() {
		super.display();
		System.out.println("월 근무일: "+workDay);
		System.out.println("getMonthPay: "+ pay*workDay);
	}

	void getMonthPay() {
		
	}

}//PartTime


public class Ex06_10_김범규 {

	public static void main(String[] args) {

		FullTime f = new FullTime("F001","성유리",500,30);
		Contract c = new Contract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","이진",300,7);
		
		f.display();
		System.out.println();
		c.display();
		System.out.println();
		p.display();
		System.out.println();
		
		
//		3개의 객체를 배열로 해보기.
		
		Employee2 f1 = new FullTime("F001","성유리",500,30);
		Employee2 c1 = new Contract("C001","이효리",400,3);
		Employee2 p1 = new PartTime("P001","이진",300,7);
		
		Employee2[] arr = {new FullTime("F001","성유리",500,30),
						   new Contract("C001","이효리",400,3),
						   new PartTime("P001","이진",300,7)
						  };
		
		int i;
			for(i=0;i<arr.length;i++) {
				action(arr[i]);
				System.out.println();
			}
		
		
		//		4개의 변수를 출력하는 메서드


	} // main
	static void action(Employee2 r) { // 로봇타입의 변수로 받을수있음 업캐스팅되면서 들어옴
		if(r instanceof FullTime) {
			FullTime ft = (FullTime)r; // 다운캐스팅함 (자식공간으로 맞춰줘야함!)
			ft.display();
		} 
		else if (r instanceof Contract) {
			Contract ct = (Contract)r;
			ct.display();
		}
		else if (r instanceof PartTime) {
			PartTime dr = (PartTime)r;
			dr.display();
		}
}
	
} // class
