abstract class Employee2{
	String empno;
	String name;
	int pay;
	 Employee2() {
		 
	 }
	Employee2(String empno,String name,int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}	
	
	abstract String show(); 
		
	 abstract double getMonthPay(); 
		
}

class Fulltime extends Employee2{
	int bouns;

	Fulltime(String empno,String name,int pay,int bouns) {
		super(empno,name,pay);
////		this.empno = empno;
////		this.name=name;
////		this.pay=pay;
		this.bouns = bouns;		
	}	
	
	String show() {
		return "번호:"+empno+"이름:"+name+"금액:"+pay+"보너스:"+bouns;
	}
	
		double getMonthPay() {
			return (pay/(double)12) + (bouns/(double)12);		
	}	
}

class Contract extends Employee2{
	int hireyear;
	
	Contract(String empno,String name,int pay,int hireyear) {
		super(empno,name,pay);
//		this.empno = empno;
//		this.name=name;
//		this.pay=pay;
		this.hireyear = hireyear;
	}
	
String show() {
	return "번호:"+empno+"이름:"+name+"금액:"+pay+"계약기간:"+hireyear ;	
	}
		
double getMonthPay() {	
	 return	(pay/(double)12*hireyear );
	}		
}

class Parttime extends Employee2{
	int workday;
	
	Parttime(String empno,String name,int pay,int workday) {
		super(empno,name,pay);
//		this.empno = empno;
//		this.name=name;
//		this.pay=pay;
		this.workday = workday;
	}
		
	String show() {
		return "번호:"+empno+"이름:"+name+"금액:"+pay+"월 근무일:"+workday;	
	}
	
double getMonthPay() {
		return (pay*workday);
	}	
}

public class Ex06_10_김기현 {
	public static void main(String[] args) {
		
		
//		Fulltime f = new Fulltime("F001","성유리",500,30);	
//		Contract c = new Contract("C001","이효리",400,3);	
//		Parttime p = new Parttime("P001","이진",300,7);	
		
		
		Employee2 e = null;
		Employee2 f = new Fulltime("F001","성유리",500,30);
		Employee2 c = new Contract("C001","이효리",400,3);	
		Employee2 p = new Parttime("P001","이진",300,7);	
		
		
		e = (Employee2)f;
		System.out.println(f.show());
		System.out.println(f.getMonthPay());
		if(f instanceof Employee2) {
			System.out.println("다운 캐스팅 가능");
		}
		
		System.out.println("-----------------");
		
		e = (Employee2)c;
		System.out.println(c.show());
		System.out.println(c.getMonthPay());
		if(c instanceof Employee2) {
			System.out.println("다운 캐스팅 가능");
		}
		
		System.out.println("-----------------");
		
		e = (Employee2)p;
		System.out.println(p.show());
		System.out.println(p.getMonthPay());
		

		if(p instanceof Employee2) {
			System.out.println("다운 캐스팅 가능");
		}
	
		System.out.println("****************");
		
		if(p instanceof Employee2) {
			System.out.println("다운 캐스팅 가능");
		}
		else if(c instanceof Employee2) {
			System.out.println("다운 캐스팅 가능");
		}
		else  {
			System.out.println("다운 캐스팅 가능");
		}
		
		/*		System.out.println("-----------------");
		

		f.show();
		System.out.println("연봉:"+f.getMonthPay());
		System.out.println();
		
		c.show();
		System.out.println("연봉:"+c.getMonthPay());
		System.out.println();

		p.show();
		
		System.out.println("연봉:"+p.getMonthPay());
*/		
		System.out.println();
		
		Employee2[] em = {new Fulltime("F001","성유리",500,30),
				new Contract("C001","이효리",400,3),
				new Parttime("P001","이진",300,7)
							};
		
		int i;
		for(i=0;i<em.length;i++) {
			System.out.println(em[i].show());
			System.out.println();
		} 
		
		//
//		super 활용해서 해보기
//		instanceof 활용해서 해보기 업캐스팅 다운캐스팅활용
		
	}

}
