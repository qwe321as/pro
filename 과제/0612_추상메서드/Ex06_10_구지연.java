abstract class Employee2 {
	String empno;
	String name;
	int pay;
	
		Employee2(String empno,String name,int pay){
			this.empno=empno;
			this.name=name;
			this.pay=pay;
		}
		
		void display() {
			System.out.print(empno+",");
			System.out.print(name+",");
			System.out.print(pay+",");
		}
		abstract void getMonthPay();
	
}//Employee2

class FullTime extends Employee2{
	int bonus;
	
		FullTime(String empno,String name,int pay,int bonus){
			super(empno,name,pay);
			this.bonus = bonus;
		}
		
		void display() {
			super.display();
			System.out.println(bonus);
			System.out.println((pay/(double)12)+(bonus/(double)12));
		}
		
		void getMonthPay() { 
		}
	
}//FullTime

class Contract extends Employee2{
	int hireYear;
		
		Contract(String empno,String name,int pay,int hireYear){
			super(empno,name,pay);
			this.hireYear=hireYear;
		}
		
		void display() {
			super.display();
			System.out.println(hireYear);
			System.out.println((pay/(double)12)*hireYear);
				}
		void getMonthPay() {
		}
		
		
}//Contract

class PartTime extends Employee2{
	int workDay;
		
		PartTime(String empno,String name,int pay,int workDay){
			super(empno,name,pay);
			this.workDay=workDay;
		}
		
		void display() {
			super.display();
			System.out.println(workDay);
			System.out.println((double)pay*workDay);
		}
		
		
		
		void getMonthPay() {
		}
		
	
}//PartTime

public class Ex06_10_구지연 {
	public static void main(String[] args) {
		
		
		Employee2 f = new FullTime("F001","성유리",500,30);
		Employee2 c = new Contract("C001","이효리",400,3);
		Employee2 p = new PartTime("P001","이진",300,7);
		//위 3개의 객체를 배열로 만들어서 해보기
		
		Employee2[] em = { new FullTime("F001","성유리",500,30),
						   new Contract("C001","이효리",400,3),
						   new PartTime("P001","이진",300,7)
							};
		int i;
		for(i=0;i<em.length;i++) {
			em[i].display();
		}
		
		f.getMonthPay();
		c.getMonthPay();
		p.getMonthPay();
		
		//4개의 변수를 출력하는 메서드
		//System.out.println(getMonthPay());
	
		
		
		
		//출력결과
//	P001,이진,300,7
//	2100.0
//	
//	C001,이효리,400,3
//	100.0
//	
//	F001,성유리,500,30
//	44.16666666664
	}

}
