abstract class Shape{ // �߻�Ŭ����
	Shape(){
		System.out.println("Shape ������");
	}
	void make() {
		System.out.println("���� �׸���");
	}
	abstract void draw(); // �̿ϼ� �޼���(�߻�޼���)
	abstract void delete();
	
}//Shapes

class Circle extends Shape{
	
//	Circle(){
//		super();
//	}
	
	@Override
	void draw() {
		System.out.println("���� �׸���.");
	}
//	void draw() {
//		System.out.println("���� �׸���.");
//	}
//	
	void delete() {
		System.out.println("���� �����.");
	}
}//Circle

class Triangle extends Shape{
	
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}

	@Override // ������̼�(annotation)
	void delete() {
		System.out.println("�ﰢ���� �����.");
	}
	
}// Triangle

public class Ex06_09_�߻�Ŭ���� {
	public static void main(String[] args) {

		//Shape s = new Shape();
		
		Circle c = new Circle();
		c.make(); 
		c.draw();
		c.delete();
		
		Triangle t = new Triangle();
		t.make();
		t.draw();
		t.delete();
	}

}




