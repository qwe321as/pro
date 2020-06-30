class Person{
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void display(){
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
}
class Student extends Person{
	String name;
	int age;
	int kor,eng;
	public Student(String n, int a, int k, int e) {
		super(n,a);
		this.kor = k;
		this.eng = e;
	}
	public void display() {
		super.display();
		System.out.println("kor = "+ kor);
		System.out.println("eng = "+ eng);
		
	};
}
class Employee extends Person{
	String name;
	int age;
	String company,part;
	public Employee(String n,int a, String c, String p) {
		super(n,a);
		this.company = c;
		this.part = p;
	}
	public void display() {
		super.display();
		System.out.println("company = "+ company);
		System.out.println("part = "+ part);
	};
}


public class Ex06_03_¾ç°æ¿ø {

	public static void main(String[] args) {
		Person pe = new Person("È¿¿¬",12);
		pe.display();
		System.out.println("----------");
		Student st = new Student("À±¾Æ",29,100,100);
		st.display();
		System.out.println("----------");
		Employee em = new Employee("ÀÌ½Â±â", 42,"»ï¼º","¿¬±¸ºÎ");
		em.display();

	}

}
