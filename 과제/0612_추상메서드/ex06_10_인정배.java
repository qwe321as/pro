abstract class employee1 {
	String empno; String name; int pay; int day;
	void asdf(String empno, String name, int pay, int day) {
		this.empno = empno;
		this.name=name;
		this.pay=pay;
		this.day=day;
	}
	void ffff() {
		System.out.println("사원번호:"+empno+"\n이름:"+name+"\n금액:"+pay+"\n일한날짜: "+day+"일");
	}

	abstract void getMonthPay(); 

}
class FullTime extends employee1 {
	public FullTime(String empno, String name, int pay, int day) {
		// TODO Auto-generated constructor stub
		this.empno = empno;
		this.name=name;
		this.pay=pay;
		this.day=day;
	}
	void ffff() {
		super.ffff();
	}

	double bouce =0.25;
	void getMonthPay() {
		System.out.println("받는 금액="+pay/(day*12)+bouce/(day*12));

	}

}
class Contract extends employee1{


	public Contract(String empno, String name, int pay, int day) {
		this.empno = empno;
		this.name=name;
		this.pay=pay;
		this.day=day;
		// TODO Auto-generated constructor stub
	}

	void ffff() {
		super.ffff();
	}

	void getMonthPay() {
		System.out.println("받는 금액="+pay*day/12);
	}

}

class PartTime extends employee1{
	public PartTime(String empno, String name, int pay, int day) {
		// TODO Auto-generated constructor stub
		this.empno = empno;
		this.name=name;
		this.pay=pay;
		this.day=day;
	}
	void ffff() {
		super.ffff();
	}
	

	void getMonthPay() {
		System.out.println("받는 금액="+pay*day);
	}
}



public class ex06_10_인정배 {
	public static void main(String[]args) {
		employee1 f = new FullTime("f001","성유리",500,30);
		employee1 a = new Contract("c001","색유리",400,30);
		employee1 s = new PartTime("p001","이유리",300,7);
		//계약직 파이
		//4개 의 변수를 출력하는 메서드 

		// p001,이진,300,7
		//2100.0
		//c001, 이효리 400,3
		//100
		//f001 성유리
		//500 30
		//44.16666666666666666666666664
		employee1[] arr = {new FullTime("f001","성유리",500,30),
				new Contract("c001","색유리",400,30),
				new PartTime("p001","이유리",300,7)};
		int i;
		for(i=0;i<3;i++) {
			action(arr[i]);
		}
		f.getMonthPay();
		a.getMonthPay();
		s.getMonthPay();
	}
	static void action(employee1 r) {
		if(r instanceof FullTime) {
			FullTime f = (FullTime)r;
			f.ffff();
		} else if(r instanceof Contract) {
			Contract a = (Contract)r;
			a.ffff();
		} else if(r instanceof PartTime) {
			PartTime s = (PartTime)r;
			s.ffff();
		} 


	}

}
