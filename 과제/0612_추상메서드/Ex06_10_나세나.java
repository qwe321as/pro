abstract class Employee2{
	String empno;
	String name;
	int pay;
	abstract void getMonthPay();

	Employee2 (String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}

	void display(){
		System.out.println();
		System.out.println("���:"+empno);
		System.out.println("�̸�:"+name);
		System.out.println("�ݾ�:"+pay);
	}


}//Employee2

class FullTime extends Employee2{
	double bonus;

	FullTime (String empno, String name, int pay, double bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}
	void display() {
		super.display();
		System.out.println("���ʽ�:"+(int)bonus);
		
	}
	

	void getMonthPay() {
		bonus=(pay/(double)12)+(bonus/(double)12);
		System.out.println("getMonthPay:"+bonus);

	}

	//  (pay/(double)12)+(bonus/(double)12)

} //FullTime

class Contract extends Employee2{
	double hireyear;

	Contract(String empno, String name, int pay, double hireyear){
		super(empno, name, pay);
		this.hireyear=hireyear;
	}
	
	void display() {
		super.display();
		System.out.println("���Ⱓ:"+(int)hireyear);	
	}


	//  pay/(double)12	
	

	void getMonthPay() {
		hireyear=pay/(double)12*hireyear;
		System.out.println("getMonthPay:"+hireyear);
	}

}//Contract
class PartTime extends Employee2{
	int workDay;

	PartTime(String empno, String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay=workDay;
	}

	void display() {
		super.display();
		System.out.println("�� �ٹ���:"+workDay);
	}

void getMonthPay() {
	workDay=pay*workDay	;
	System.out.println("getMonthPay:"+(double)workDay);

	}


	//    pay*workDay	

}//PartTime
public class Ex06_10_������ {

	public static void main(String[] args) {
		
		
		
		FullTime f=new FullTime("F001","������",500,30);
		Contract c=new Contract("C001","��ȿ��",400,3);
		PartTime p=new PartTime("P001","����",300,7);

		f.display();
		f.getMonthPay();
		c.display();
		c.getMonthPay();
		p.display();
		p.getMonthPay();
		
		System.out.println();
		System.out.println("*************************");
		System.out.println("��ü�迭�� ����ϱ�");
		System.out.println("*************************");
		//��ü�迭
		Employee2[] em = {new FullTime("F001","������",500,30),
				new Contract("C001","��ȿ��",400,3),
				new PartTime("P001","����",300,7)};
		
		int i;
		for(i=0;i<em.length;i++) {
			em[i].display();
			em[i].getMonthPay();
		}
		
		
		
		
		
		


		//		 ������ �غ���, �� 3���� ��ü�� �迭�ε� ���
		//		 4������ ����ϴ� �޼���

		//		System.out.println(getMonthPay());
		//		 
		//		 P001, ����, 300, 7
		//		 2100.0
		//		 
		//		  C001, ��ȿ��, 400, 3
		//		  100.0
		//		  
		//		  F001, ������, 500, 30
		//		 44.1666666666664

	}

}
