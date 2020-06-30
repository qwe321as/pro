
abstract class Empolyee{



	String empno;

	String name;

	int pay;

	abstract double getMonthPay();



	Empolyee(String empno, String name, int pay){

		this.name = name;

		this.empno = empno;

		this.pay = pay;



	}



	void display() {

		System.out.println("Empno: " + empno);

		System.out.println("Name: " + name);

		System.out.println("Pay: " +  pay);



	}

}



class FullTime extends Empolyee{



	int bonus;



	FullTime(String empno, String name, int pay, int bonus){

		super(empno, name, pay);

		this.bonus = bonus;



	}



	void display() {

		super.display();

		System.out.println("Bonus: " + bonus);

		System.out.println("GetMonthPay: " + getMonthPay() + "\n");



	}



	double getMonthPay() {

		return (pay/(double)12)+(bonus/(double)12);



	}

}



class Contract extends Empolyee{



	int hireYear;



	Contract(String empno, String name, int pay, int hireYear){

		super(empno, name, pay);

		this.hireYear = hireYear;



	}



	void display() {

		super.display();

		System.out.println("hireYear: " + hireYear);

		System.out.println("GetMonthPay: " + getMonthPay() + "\n");



	}



	double getMonthPay() {

		return (pay/(double)12 * hireYear);

	}

}



class PartTime extends Empolyee{



	int workDay;



	PartTime(String empno, String name, int pay, int workDay){

		super(empno, name, pay);

		this.workDay = workDay;

	}



	void display() {

		super.display();

		System.out.println("WorkDay: " + workDay);

		System.out.println("Pay: " + getMonthPay() + "\n");



	}



	double getMonthPay() {

		return (pay*workDay);



	}

}



public class Ex06_10_�ڽþ� {



	public static void main(String[] args) {



		//                                FullTime f = new FullTime("F001","������",500, 1.2345, 30); //<==������

		//                                Contract c = new Contract("C001","��ȿ��",400,3.134,3);

		//                                PartTime p = new PartTime("P001","����",300,7.1234,7);

		//                                f.display();

		//                                c.display();

		//                                p.display();



		Empolyee[] m = { new FullTime("F001","������",500,30),

				new Contract("C001","��ȿ��",400,3),

				new PartTime("P001","����",300,7), };



		int i;

		for(i=0; i<m.length; i++) {

			m[i].display();

		}

	}

}

//                �� 3���� ��ü�� �迭�� ���� �غ���

//                

//                4���� ������ ����ϴ� �޼��� �����

//                System.out.println(getMonthPay());

//                

//                F001,������,500,30

//                44.166666666666664

//

//                C001,��ȿ��,400,3

//                100.0

//

//                P001,����,300,7

//                2100.0

//

//������: (pay/(double)12)+(bonus/(double)12)

//�����: pay/(double)12 * hireYear

//�Ͽ���: pay*workDay