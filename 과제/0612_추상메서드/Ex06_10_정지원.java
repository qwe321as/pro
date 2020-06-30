abstract class Employee2{
	String empno;
	String name;
	int pay;
	void info() {
		System.out.println("사번:"+empno,"이름:"+name,"금액:"+pay);
		
	}
	Employee2(String empno,String name,int pay){
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}
}
class FullTime extends Employee2{
	int bonus;
	void getMonthpay() {
		System.out.println(pay/(double)12+bonus/(double)12);
	}
	
	FullTime(String empno,String name,int pay,int bonus){
		super(empno,name,pay);
		this.bonus=bonus;
	}
	
	
}
class Contract extends Employee2{
	int hireYear;
	void getMonthpay() {
		System.out.println(pay/(double)12*hireYear);
	}
	
	Contract(String empno,String name,int pay,int hireYear){
		super(empno,name,pay);
		this.hireYear=hireYear;
	}
	
}
class PartTime extends Employee2{
	int workDay;
	void getMonthpay() {
		System.out.println(pay*workDay);
	}
	PartTime(String empno,String name,int pay,int workDay){
		super(empno,name,pay);
		this.workDay=workDay;
	}
	
}
public class Ex06_10_정지원 {

	public static void main(String[] args) {
		
		FullTime f=new FullTime("F001","성유리",500,30);
		Contract c=new Contract("C001","이효리",400,3);
		PartTime p=new PartTime("P001","이진",300,7);
		f.empno();
		f.name();
		f.pay();
		f.bonus();
		System.out.println("**********");
		c.empno();
		c.name();
		c.pay();
		c.hireYear();
		System.out.println("===========");
		p.empno();
		p.name();
		p.pay();
		p.workDay();
		
		
	
			
		
//		Employee2 f=new FullTime("F001","성유리",500,30);
//		Employee2 c=new Contract("C001","이효리",400,3);
//		Employee2  p=new PartTime("P001","이진",300,7);
//		
		Employee2[] e = {new FullTime(),new Contract(),new PartTime()};
		

	}

}
