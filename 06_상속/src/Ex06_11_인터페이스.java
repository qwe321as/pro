interface Copymachine{
	public abstract void copy(); 
	int abc=1;
}

interface Printmachine{
	void print();
}

interface Faxmachine{
	void fax();
}

class Ex{
	
}

class Compound extends Ex implements Copymachine,Printmachine,Faxmachine{
	public void copy() {
		System.out.println("�����Ѵ�.");
	}
	public void print() {
		System.out.println("����Ʈ�Ѵ�.");
	}
	public void fax() {
		System.out.println("�ѽ�������.");
	}
}// Compound

public class Ex06_11_�������̽� {
	public static void main(String[] args) {
		
		final int a=1;
		
		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
		
		Printmachine p = new Compound();
		p.print();
		
		Copymachine copy = new Compound();
		copy.copy();
	}
}







