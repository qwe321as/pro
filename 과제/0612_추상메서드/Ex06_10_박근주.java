abstract class Employee1{
	String empno;
	String name;
	int pay;
	abstract double getMonthPay();
	public Employee1(){
		
	}
	
	 Employee1(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	void display() {
		System.out.println("사번:"+empno);
		System.out.println("이름:"+name);
		System.out.println("페이:"+pay);
	}
	
}


class FullTime extends Employee1{
	
	//정규직(pay/(double)12)+ (bonus/(double)12)
	
	int bouns;
	
	FullTime(String empno,String name, int pay, int bouns){
		super(empno,name,pay);
		this.bouns = bouns;
		
	}
	void display() {
		super.display();
		  System.out.println("보너스" + bouns);
	}

	double getMonthPay() {
		return (pay/(double)12) + (bouns/(double)12);
	}
	
	
	
}
class Contract extends Employee1{
	int hireYear;
	double money2;
	//계약직pay/(double)12
	Contract(String empno,String name,int pay,int hireyear){
		super(empno,name,pay);
		this.hireYear = hireyear;
		
	}
	
	void display() {
		super.display();
		System.out.println("계약기간:"+hireYear);
		
	}
double getMonthPay() {
	return pay/(double)12*hireYear;
	
	}
}
class PartTime extends Employee1{
	//일용직pay*workDay
	int workDay;
	double money3;
	
	PartTime(String empno,String name,int pay,int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
		money3= pay*workDay;
		
	}
	
	void display() {
		super.display();
		System.out.println("workday:"+workDay);
		
	}
double getMonthPay() {
		return pay*workDay;
	}
}


public class Ex06_10_박근주 {

	public static void main(String[] args) {
		FullTime f = new FullTime("F001","성유리",500,30);
		Contract c = new Contract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","이진",300,7);
		f.display();
		System.out.println(f.getMonthPay());
		System.out.println("============================");
		c.display();
		System.out.println(c.getMonthPay());
		System.out.println("============================");
		p.display();
		System.out.println(p.getMonthPay());
		System.out.println("============================");
		
		//Employee1 ff = new FullTime("F001", "성유리", 500, 30);
		//Employee1 cc = new Contract("C001","이효리",400,3);
		//Employee1 pp = new PartTime("P001","이진",300,7);
		
		int i;	
		Employee1[] arr = { 
				new FullTime("F001", "성유리", 500, 30),  //arr[0]
				new Contract("C001","이효리",400,3), //a[1]
				new PartTime("P001","이진",300,7) // Employee1[2]
		};
		
		
		
		//double i = (double)1;  1.0
		//int i = (int)1.1;  1
		
		
		for(i=0;i<arr.length;i++) {
			allShow(arr[i]);
			
		}
		
		
		
		//}
		
		// 위 3개의 객체를 배열로 만들어서 해보기
		//4개의 변수를 출력하는 메서드
		//System.out.println(getMonthPay());
		//P001, 이진,300,7
		// 2100.0
		//C001 이효리,400,3
		//100.0
		//F001 , 성유리,500,30
		//4.16666666

		
	}//main
	
	static void allShow(Employee1 y) {
		System.out.println("배열============");
		if(y instanceof FullTime) {
			FullTime ft = (FullTime) y;
			ft.display();
			System.out.println(ft.getMonthPay());
		}
		else if (y instanceof Contract) {
			Contract ct = (Contract) y;
			ct.display();
			System.out.println(ct.getMonthPay());
		}
		
		else if (y instanceof PartTime) {
			PartTime pt = (PartTime) y;
			pt.display();
			System.out.println(pt.getMonthPay());
		}
		
	}
	

}
