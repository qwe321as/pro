
class Person{
	String name;
	int age;
	

	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	void dispaly(){
		System.out.print(" 이름:" + name + "  나이:" + age);
	
		
	}
}

class Student extends Person{
	int kor, eng;

	Student(String name, int age, int kor, int eng){
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		
	}

	void display(){
		super.dispaly();
		System.out.println("국어점수:" + kor + " 영어점수:" +  eng);
		System.out.println();
	}
}
class Empolyee extends Person{
	String company, part;
	
	Empolyee(String name, int age, String company, String part){
		super(name, age);
		this.company = company;
		this.part = part;
	}

	void display(){
		super.dispaly();
		System.out.println("  회사:" + company + "  부서:" + part);
		System.out.println();
	}
	

}
public class Ex06_03_박시양 {
	public static void main(String[] args) {


		Person pe = new Person("효연", 12);
		pe.dispaly();
		Student st = new Student("윤아", 29, 100, 100);
		st.display();
		Empolyee me = new Empolyee("이승기", 42, "삼성", "연구부");
		me.display();

	}
}