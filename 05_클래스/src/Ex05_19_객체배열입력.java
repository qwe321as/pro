import java.util.Scanner;

class Man{
	private String name;
	private int age;
	Man(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	String show() {
		return name+","+age;
	}
}

public class Ex05_19_��ü�迭�Է� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		
		
		
		
//		System.out.print("�̸�:");
//		name = sc.next();
//		System.out.print("����:");
//		age = sc.nextInt();
//		
//		Man m1 = new Man(name,age);
//		System.out.println(m1.show());
		
		Man[] m = new Man[3];
		int i;
		for(i=0;i<3;i++) {
			System.out.print("�̸�:");
			name = sc.next();
			System.out.print("����:");
			age = sc.nextInt();
			m[i] = new Man(name,age);
		}
		
		for(i=0;i<3;i++) {
			System.out.println(m[i].show());
		}
	}

}





