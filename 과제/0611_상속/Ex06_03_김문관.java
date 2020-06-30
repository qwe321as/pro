class Person{
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

class Student extends Person{
	int kor,eng;
	
	
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.kor = kor;
		this.eng = eng;
	}
	
	void show() {
		super.show();
		System.out.println("국어점수 :" + kor);
		System.out.println("영어점수 :" + eng);
	}
	
}

class Employee extends Person{
	String company, part;
	
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	
	void show() {
		super.show();
		System.out.println("회사명 :" + company);
		System.out.println("부서명 :" + part);
	}
	
	
}



public class Ex06_03_김문관 {

	public static void main(String[] args) {
		
		Person pe = new Person("김문관",30);
		pe.show();
		System.out.println("=========================");
		
		Student st = new Student("휘성",38,50,90);
		st.show();
		System.out.println("=========================");
		
		Employee em = new Employee("박효신",42,"중앙정보인재개발원","영업부");
		em.show();
		System.out.println("=========================");

	}

}
