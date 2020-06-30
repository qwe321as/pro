class Man{
	private String name;
	int age;

	Man(){

	}
	Man(String name,int age){
		this.name = name;
		this.age = age;
	}

	String getName(){
		return name;
	}
	
	void display() {
		System.out.println(name+","+age);
	} // 

} //Man
class Worker{
//	String name;
//	int age;
	String company;
	Man m;
	
	Worker(){
		
	}
	Worker(String name,int age,String company){
//		this.name = name;
//		this.age = age;
		m = new Man(name,age);
		this.company = company;
	}
	void display() {
//		System.out.println(m.name);
		System.out.println(m.getName());
		System.out.println(m.age);
		System.out.println(company);
	}
}

public class Ex06_04_포함 {
	public static void main(String[] args) {

		Worker w = new Worker("찬열",22,"중앙");
		w.display();
	}

}




