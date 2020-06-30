class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("ÀÌ¸§: " + name);
		System.out.println("³ªÀÌ: " + age);
	}
}
class Student extends Person{
	int kor, eng;
	
	Student(String name,int age,int kor, int eng){
		super(name,age);
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() {
		super.display();
		System.out.println("kor: " + kor);
		System.out.println("eng: " + eng);
	}
	
}
class Employee extends Person{
	
	String company;
	String part;
	
	Employee(String name, int age , String company , String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	void display() {
		super.display();
		System.out.println("company: "+company);
		System.out.println("part: "+part);
	}
}// person




public class Ex06_03_±è¹ü±Ô {

	public static void main(String[] args) {

		Person pe = new Person("È¿¿¬",12);
		pe.display();
		
		Student st = new Student("À±¾Æ",29,100,100);
		st.display();
		
		Employee em = new Employee("ÀÌ½Â±â",42,"»ï¼º","¿¬±¸¿ø");
		em.display();
		
	} // main

} // class
