abstract class Shape{ // 추상클래스
	Shape(){
		System.out.println("Shape 생성자");
	}
	void make() {
		System.out.println("도형 그리기");
	}
	abstract void draw(); // 미완성 메서드(추상메서드)
	abstract void delete();
	
}//Shapes

class Circle extends Shape{
	
//	Circle(){
//		super();
//	}
	
	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
//	void draw() {
//		System.out.println("원을 그린다.");
//	}
//	
	void delete() {
		System.out.println("원을 지운다.");
	}
}//Circle

class Triangle extends Shape{
	
	void draw() {
		System.out.println("삼각형을 그린다.");
	}

	@Override // 어노테이션(annotation)
	void delete() {
		System.out.println("삼각형을 지운다.");
	}
	
}// Triangle

public class Ex06_09_추상클래스 {
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




