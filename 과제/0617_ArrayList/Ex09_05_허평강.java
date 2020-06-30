import java.util.ArrayList;
import java.util.Scanner;

//Object -> public String toString()
class Person3{
	String id;
	String pw;

	Person3(String id,String pw){
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() {
		return id+"/"+pw;
	}

}


public class Ex09_05_허평강 {
public static void main(String[] args) {
	Person3[] p ={new Person3("kim","1234"),
			new Person3("park","5678"),
			new Person3("choi","9999")
	};
	

	ArrayList<Person3> list = new ArrayList<Person3>();
	int i;
	for(i=0;i<p.length;i++) {
		list.add(p[i]);
	}
	
	//		list.add(p1);
	//		list.add(p2);
	//		list.add(p3);

	System.out.println(list.toString()); //Array의 toString은<>toString을 쓰기때문에 여기선 Person3의 toString이 나온다. 		
	//Person3 toString을 정립해주지않으면값이 안나오므로 .toString을 정립해줘여한다.
	//정립을할때 부모의 접근제어자보다 높거나 같아야하는데 Person3의 부모는 Object이기에 public을써야함.
	//System.out.println(list.get(1));
	Person3 one = list.get(1);
	System.out.println("one:"+one.toString());
	
	for(i=0;i<p.length;i++) {
		System.out.println(list.get(i));
	}
	
	String id,pw;
	String qw;
	Scanner sc = new Scanner(System.in);
	
	do{
		System.out.println("id를 입력하세요.");
	 id = sc.next();		
		System.out.println("비밀번호를 입력하세요");
	 pw = sc.next();	
	 list.add(new Person3(id,pw));
	System.out.println("계속하시겠습니까?");	
	qw = sc.next();
	if(qw.equalsIgnoreCase("y")) {
		System.out.println("계속하겠습니다.");
		continue;
	}
	else if(qw.equalsIgnoreCase("n")) {
		System.out.println("종료하겠습니다.");
		System.out.println(list);
		break;
	}
	 
	}while(true);
	
	
}
}
