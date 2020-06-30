class Person2{
	private String name; 
	private int age;
	private double height;
	
//	Person2(){ // default 생성자
//		
//	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void setHeight(double height) {
		this.height = height;
	}
	double getHeight() {
//		double height=1.1;
		return this.height;
	}
	
}

public class Ex05_15_setter_getter {
	public static void main(String[] args) {

		Person2 p = new Person2();
//		p.name = "길동";
//		System.out.println(p.name);
		p.setName("길동");
		p.setAge(33);
		p.setHeight(189.2);
		
		String a = p.getName();
		System.out.println(a);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
	}

}







