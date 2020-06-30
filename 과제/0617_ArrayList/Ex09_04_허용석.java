import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;
	
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String toString() {
		return id+"/"+pw;
	}
	
}
public class Ex09_04_��뼮 {
	public static void main(String[] args) {
		
		String inputId,inputPw;
		ArrayList<Person> al=new ArrayList<Person>();
		
		String reStart;
		int i=0;
		boolean endFlg=true;
		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("���̵� �Է�:");
			inputId=sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id�� 3~8���� �Է��ؾ� �մϴ�.");
				continue;
			} 
			System.out.print("��� �Է�:");
			inputPw=sc.next();
			
			Person p= new Person(inputId, inputPw);
			al.add(p);

			do {
				System.out.print("���(y/n)");
				reStart=sc.next();
				if(reStart.equalsIgnoreCase("y")) {
					break;
				} else if(reStart.equalsIgnoreCase("n")) {
					endFlg=false;
					sc.close();
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			} while(endFlg);
		} while(endFlg);
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println(al.toString());
	}

}
//ID:jung
//PW:1212
//���?y
//ID:won
//PW:9988
//���?