class Person extends Object{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+","+age;
	}
	
	public boolean equals(Object obj){
//		System.out.println(obj.age);
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
			//System.out.println(p.age);
			
		}
		return false;
	}
}

public class Ex08_01_toString {
	public static void main(String[] args) {
		
		Person man = new Person("����",20);
		Person woman = new Person("����",20);
		System.out.println(man.toString());
		System.out.println(woman); //�������� == ��������.toString()
		
		System.out.println(man.equals(woman));
		System.out.println(man==woman);
		
	}

}






