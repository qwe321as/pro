abstract class Employee2{
	String empno;
	String name;
	int pay;
	abstract double getMonthPay();
	
	void display() {
		System.out.println();
		System.out.println("사번 :"+empno);
		System.out.println("이름 : "+name);
		System.out.println("금액 :" +pay);
	}
}

class FullTime extends Employee2{
	int bonus;
	FullTime(String empno,String name, int pay,int bonus){
		this.empno=empno;
		this.name=name;
		this.pay=pay;
		this.bonus=bonus;
	}

	
	
	 double getMonthPay() {
		return  (pay/(double)12)+(bonus/(double)12);
		
	}
	void display() {
		super.display();
		System.out.println("보너스 :" +bonus);
	}
}

class Contract extends Employee2{
	int hireyear;
	Contract(String empno,String name, int pay, int hireyear){
		this.empno=empno;
		this.name = name;
		this.pay=pay;
		this.hireyear=hireyear;
	}
	
	double getMonthPay() {
		
		return pay/(double)12 * hireyear;
	}
	void display() {
		super.display();
		System.out.println("계약기간 :" +hireyear);
	}
}

class PartTime extends Employee2{
	int workday;
	PartTime(String empno,String name, int pay,int workday ){
		this.empno=empno;
		this.name = name;
		this.pay=pay;
		this.workday=workday;
	}
	

	double getMonthPay() {
		
		return pay * workday;
	}
	void display() {
		super.display();
		System.out.println("월 근무일 :" +workday);
	}
}

public class Ex_06_10_최지훈 {

	public static void main(String[] args) {
		int i;
		
		FullTime f = new FullTime("F001","성유리",500,30);
		Contract c = new Contract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","이진",300,7);
	
		f.display();
		System.out.println("연봉 :"+f.getMonthPay());
		c.display();
		System.out.println("연봉 :"+c.getMonthPay());
		p.display();
		System.out.println("연봉 :"+p.getMonthPay());
		
		Employee2 [] arr = {new FullTime("F001","성유리",500,30), 
				new Contract("C001","이효리",400,3), 
				new PartTime("P001","이진",300,7) };
		
		for(i=0;i<arr.length;i++) {			      
			action((arr[i]));
	                                     }
//System.out.println(getMonthPay());
	}
	static void action(Employee2 r) {
		if(r instanceof FullTime) {    //업캐스팅
			FullTime f = (FullTime)r; //다운캐스팅
			 f.display();
			 System.out.println("연봉 :"+f.getMonthPay());
		 }
		 else if(r instanceof Contract) {  //r이 SingRobot을 다룰수 있는가? true이면
			 Contract c = (Contract)r;   //다운캐스팅이 가능하다
			 c.display();
			 System.out.println("연봉 :"+c.getMonthPay());
		 }
		 else if(r instanceof PartTime) {
			 PartTime p = (PartTime)r;
			 p.display();
			 System.out.println("연봉 :"+p.getMonthPay());
		 }
	}
}


//