import java.util.ArrayList;
import java.util.Scanner;
class Person {
	String id;
	String pwd;
	public Person(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		String strReturn="";
		strReturn=this.id+":"+this.pwd;	
		return strReturn ;
	}
}

public class Ex09_04_�̱⼱ {

	public static void main(String[] args) {

//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","1234");
//		Person p3 = new Person("choi","1234");
		
//		String[] id = {"kim","park","song","kang"};
//		String[] pw = {"1234","2345","3456","4567"};
//		
//		
//		ArrayList<Person> list = new ArrayList<Person>();
		
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		for(int i = 0 ; i < 4 ; i++) {
//			list.add(new Person(id[i],pw[i]));
//		}
//		
//		System.out.println("list.toString() : "+list.toString());
//		System.out.println("list : "+list);
//		for(int i = 0 ; i < list.size(); i++) {
//			System.out.println("list.get(i) : "+list.get(i));
//			Person one = list.get(i);
//			System.out.println("one.toString() : "+one.toString());			
//		}
//		ID : Kim
//		PW : 1212
//		��� ?  (y or n)
//		Person ��ü�� ����ؼ� �ִ´�.
//		Person ��ü�� ArrayList�� �־ ������ �Ѵ�
//		�������� n�� �Է� �ϸ� 
//		��ü �Է� �۾��� ���� �ϰ� ���� ������ �����͸� id/pw�� ��� �Ѵ�.
		ArrayList<Person> list2 = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		String id="";
		String pw = "";
		String yes="";
		int icount = 1;
		do {
			System.out.println("ID�� �Է��ϼ��� : ");
			id = sc.next();
			if(id.contentEquals("n")||id.equals("N") ){
				System.out.println("Input work End");
				break;
			}
			System.out.println("PW�� �Է��ϼ��� : ");
			pw = sc.next();
			list2.add(new Person(id,pw));
			System.out.println("Input times : "+icount);
			System.out.println("�����Ͻ÷��� y or Y�� �Է��ϼ��� : ");
			yes = sc.next();
			if(yes.contentEquals("y")||yes.equals("Y") ){
				System.out.println("Input work End");
				break;
			}
		    icount++;
					
		}while(true);
		System.out.println("Input number : "+icount);
		System.out.println("list2.toString() : "+list2.toString());		
		System.out.println("list2.size() : "+list2.size());			
		sc.close();
		
	}

}
