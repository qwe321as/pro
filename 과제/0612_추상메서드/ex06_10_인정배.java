abstract class employee1 {
	String empno; String name; int pay; int day;
	void asdf(String empno, String name, int pay, int day) {
		this.empno = empno;
		this.name=name;
		this.pay=pay;
		this.day=day;
	}
	void ffff() {
		System.out.println("�����ȣ:"+empno+"\n�̸�:"+name+"\n�ݾ�:"+pay+"\n���ѳ�¥: "+day+"��");
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
		System.out.println("�޴� �ݾ�="+pay/(day*12)+bouce/(day*12));

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
		System.out.println("�޴� �ݾ�="+pay*day/12);
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
		System.out.println("�޴� �ݾ�="+pay*day);
	}
}



public class ex06_10_������ {
	public static void main(String[]args) {
		employee1 f = new FullTime("f001","������",500,30);
		employee1 a = new Contract("c001","������",400,30);
		employee1 s = new PartTime("p001","������",300,7);
		//����� ����
		//4�� �� ������ ����ϴ� �޼��� 

		// p001,����,300,7
		//2100.0
		//c001, ��ȿ�� 400,3
		//100
		//f001 ������
		//500 30
		//44.16666666666666666666666664
		employee1[] arr = {new FullTime("f001","������",500,30),
				new Contract("c001","������",400,30),
				new PartTime("p001","������",300,7)};
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
