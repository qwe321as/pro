import java.util.ArrayList;
import java.util.Scanner;
//Object -> public String toString()
class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() { //�θ� public�̸� �ڽ��� public�̻��� ����Ѵ�,�̰� �� ���� �� �ּҷ� ����.
		return id+"/"+pw;
	}
}

public class Ex09_04_������ {
	public static void main(String[] args) {
		
	

//		Person p1=new Person("kim","1234");
//		Person p2=new Person("park","5678");
//		Person p3=new Person("choi","9999");
		Person[] p= {
				new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")
			};
	
	int i;
		ArrayList<Person> list=new ArrayList<Person>();
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}
		    System.out.println(list.toString()); //toString()�� �ּҸ� �ҷ���. �׷��� �������̵��� Ŭ���� �ȿ��� ��.
		    System.out.println(list.get(1));
		    Person one=list.get(1);
		    System.out.println("one:"+one.toString());
		    
		    for(i=0;i<p.length;i++) {
		    	System.out.println(list.get(i));
		    }
		    Scanner sc=new Scanner(System.in);
		    
		    do{
		    
		    System.out.println("id:");
		    String inputId=sc.next();
		    System.out.println("pw:");
		    String inputPw=sc.next();
		    System.out.println("���?");
		    list.add(new Person(inputId,inputPw)); //add+��ü���.
		    String j=sc.next();
		    if(j.equals("y")) {
		    	continue;
		    }
		    else if(j.equals("n")) {
		    	break;
		    }else {
		    	System.out.println("y�Ǵ� n�� �����ּ���.");
		    	continue;
		    }
	
	}while(true);
		    System.out.println(list);
		    		    
		    

}
}
