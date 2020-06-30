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
	public String toString() { //부모가 public이면 자식은 public이상을 써야한다,이거 안 쓰면 다 주소로 나옴.
		return id+"/"+pw;
	}
}

public class Ex09_04_원태찬 {
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
		    System.out.println(list.toString()); //toString()은 주소를 불러옴. 그래서 오버라이딩을 클래스 안에서 함.
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
		    System.out.println("계속?");
		    list.add(new Person(inputId,inputPw)); //add+객체사용.
		    String j=sc.next();
		    if(j.equals("y")) {
		    	continue;
		    }
		    else if(j.equals("n")) {
		    	break;
		    }else {
		    	System.out.println("y또는 n만 눌러주세요.");
		    	continue;
		    }
	
	}while(true);
		    System.out.println(list);
		    		    
		    

}
}
