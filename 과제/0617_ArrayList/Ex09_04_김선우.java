import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;

	Person(String id, String pw){
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() {//object는 public이니까 object를 받기위해 public을 쓴다
		return id+"/"+pw;
	}

}
public class Ex09_04_김선우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person [] p = {new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")
		};

		ArrayList<Person> list = new ArrayList<Person>();//지금은 person에서 return해서 받는거다 전의 Ex09_03에선 String 객체만들어 <String>써서 바로 받았지만 
		//		list.add(p1);									//여기선 <Person>의 주소를 받기에 상위 object에서 주소를 받아야해서 person의 주소를 받기위한 public메서드를 써야한다.
		//		list.add(p2);
		//		list.add(p3);
		//		System.out.println(list);
		int i,j;
		for(i=0;i<3;i++) {
			list.add(p[i]);
		}
		System.out.println(list);
		System.out.println(list.get(1));

		Person one = list.get(1);
		System.out.println("one:"+one.toString());

		for(i=0;i<3;i++) {
			System.out.println(list.get(i));
		}
		Scanner sc = new Scanner(System.in);
		String inputId,pw;
		String retry;

		do {
			
			System.out.print("id:");
			inputId = sc.next();
			System.out.print("pw:");
			pw = sc.next();
			
			list.add(new Person (inputId, pw));
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equalsIgnoreCase("y")) {
				continue;
			}
			if(retry.equalsIgnoreCase("n")) 
				break;
		}while(true);

		System.out.println(list);
	}
}
//[kim/1234, park/5678, choi/9999]
//park/5678
//one:park/5678
//kim/1234
//park/5678
//choi/9999


//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]






