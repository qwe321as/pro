abstract class Employee2{
	String empno;
	String name;
	int pay;
	Employee2(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;

	}

	void show() {
		System.out.println("사번:"+empno);
		System.out.println("이름:"+name);
		System.out.println("금액:"+pay);
	}
	abstract double getMonthpay();

}//EM

class  FullTime extends Employee2{
	int bonus;
	FullTime(String empno,String name,int pay,int bonus){
		super(empno,name,pay);
		this.bonus = bonus;
	}

	void show() {
		super.show();
		System.out.println("보너스"+bonus);

	}

	double getMonthpay() {
		return (pay/(double)12) + (bonus/(double)12);


	}

}// Full

class Constract extends Employee2{
	int hireYear;
	Constract(String empno,String name,int pay,int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	void show() {
		super.show();
		System.out.println("계약기간"+hireYear);
	}
	double getMonthpay() {
		return pay/(double)12*hireYear;
	}
}//Con

class PartTime extends Employee2{
	int workDay;
	PartTime(String empno,String name,int pay,int workDay){
		super(empno,name,pay);
		this.workDay = workDay;

	}

	void show() {
		super.show();
		System.out.println("월 근무일"+workDay);
	}

	double getMonthpay() {
		return pay*workDay;

	}
}



public class Ex06_10_허평강 {
	public static void main(String[] args) {


		//		

		FullTime f = new FullTime("F001","성유리",500,30);
		Constract c = new Constract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","이진",300,7);

		//위 3개 객체를 배열로 만들어서 해보기
		//4개의 변수를 출력하는 메서드
		f.show();
		System.out.println(f.getMonthpay());
		System.out.println("==================");
		c.show();
		System.out.println(c.getMonthpay());
		System.out.println("==================");
		p.show();
		System.out.println(p.getMonthpay());
		System.out.println("==================");

		
		
		


		Employee2[] arr = {
				new FullTime("F001","성유리",500,30),
				new Constract("C001","이효리",400,3),
				new PartTime("P001","이진",300,7)
		};
		
		for(int i = 0; i < arr.length; i++) {
			allShow(arr[i]);
		}
		

			

	}
	static void allShow(Employee2 a) {
		System.out.println("============배열풀기=============");
		if(a instanceof FullTime) {
			FullTime ft = (FullTime) a;
			ft.show();
			System.out.println(ft.getMonthpay());
			System.out.println("==================");
			
		}
		
		else if(a instanceof PartTime) {
			PartTime pt = (PartTime) a;
			pt.show();
			System.out.println(pt.getMonthpay());
			System.out.println("==================");
		}
		
		else if(a instanceof Constract) {
			Constract ct = (Constract) a;
			ct.show();
			System.out.println(ct.getMonthpay());
			System.out.println("==================");
		}
	}
	

}

