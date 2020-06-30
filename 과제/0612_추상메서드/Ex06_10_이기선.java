abstract class Emp {
	String empno ;
	String name ;
	int pay;
	
	public Emp() {
		super();
	}
	
	public Emp(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}


	abstract double getMonthPay();
} // Emp

class FullTime extends Emp  {
	int bonus;

	FullTime(String empno, String name, int pay,int bonus){
		super(empno, name, pay);
		this.bonus = bonus;
	}
	@Override
	double getMonthPay() {
		double mpay = 0;
		mpay = (this.pay + this.bonus)/(double)12 ;
		// TODO Auto-generated method stub
		System.out.println("FullTime Month Pay");
		return mpay;
	}	
}// FullTime
class Contract extends Emp {
	int hireYear;
	
	Contract(String empno, String name, int pay,int hireYear){
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	double getMonthPay() {
		double mpay;
		
		mpay = this.pay/((double)12*this.hireYear);

		return mpay;
	}
	
} // Contract

class PartTime extends Emp {
	int workDay;
	
	PartTime(String empno, String name, int pay,int workDay){
		super(empno, name, pay);
		this.workDay = workDay;
	}
	

	@Override
	double getMonthPay() {
		double mpay;
		
		mpay = (double)this.pay*this.workDay;

		return mpay;
	}
	
}
public class Ex06_10_이기선 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FullTime f = new FullTime("F001","성유리",500,30);
		Contract c = new Contract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","옥주현",30,7);
		
		System.out.println("FullTime Name"+f.name);
		System.out.println("FullTime Empno"+f.empno);
		System.out.println("FullTime Pay"+f.pay);
		System.out.printf("FullTime Monthly Pay : %.2f\n" , f.getMonthPay());
		System.out.println("========================================================================");
		System.out.println("Contracte Name"+c.name);
		System.out.println("Contract Empno"+c.empno);
		System.out.println("Contract Pay"+c.pay);
		System.out.printf("Contract Monthly Pay : %.2f\n" , c.getMonthPay());
		System.out.println("========================================================================");
		System.out.println("PartTime Name"+p.name);
		System.out.println("PartTime Empno"+p.empno);
		System.out.println("PartTime Pay"+p.pay);
		System.out.printf("PartTime Monthly Pay : %.2f\n" , p.getMonthPay());
		System.out.println("========================================================================");
		System.out.println("UpCast Case");
		
		Emp[] e1 = new Emp[3];
		
		e1[0]=new FullTime("F001","성유리",500,30);
		e1[1]=new Contract("C001","이효리",400,3);
		e1[2]=new PartTime("P001","옥주현",30,7);
		
		for(int i1 = 0 ; i1 < e1.length ; i1++) {
			if(e1[i1] instanceof FullTime) {
				FullTime f1 = (FullTime) e1[i1];
				System.out.println("FullTime Name"+f1.name);
				System.out.println("FullTime Empno"+f1.empno);
				System.out.println("FullTime Pay"+f1.pay);
				System.out.printf("FullTime Monthly Pay : %.2f\n" , f1.getMonthPay());
				System.out.println("========================================================================");
			}
			if(e1[i1] instanceof Contract ) {
				Contract c1 = (Contract) e1[i1];
				System.out.println("Contracte Name"+c1.name);
				System.out.println("Contract Empno"+c1.empno);
				System.out.println("Contract Pay"+c1.pay);
				System.out.printf("Contract Monthly Pay : %.2f\n" , c1.getMonthPay());
				System.out.println("========================================================================");
			}
			if(e1[i1] instanceof PartTime ) {
				PartTime p1 = (PartTime) e1[i1];
				System.out.println("Contracte Name"+p1.name);
				System.out.println("Contract Empno"+p1.empno);
				System.out.println("Contract Pay"+p1.pay);
				System.out.printf("Contract Monthly Pay : %.2f\n" , p1.getMonthPay());
				System.out.println("========================================================================");
			}
		}

	}

}
