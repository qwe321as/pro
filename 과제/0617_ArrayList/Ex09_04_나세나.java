import java.util.ArrayList;
//Object->public String toString()
import java.util.Scanner;

class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() {
		return id + "/" + pw;
	}

}

public class Ex09_04_나세나 {

	public static void main(String[] args) {


		//베열로 만들기
		Person[] p= {new Person("kim", "1234"),
				new Person("park", "5678"),
				new Person("choi", "9999")};


		ArrayList<Person> list=new ArrayList<Person>();    //내가 만든 클래스 객체도 자료형타입으로 만들수 있음

		//반복문 써서 추가하기
		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}

		//		System.out.println(list.toString());
		//		System.out.println(list.get(1));
		//		Person one=list.get(1);  //Person의 참조변수
		//		System.out.println("one:"+one.toString());  

		//		for(i=0;i<p.length;i++) {
		//			System.out.println(list.get(i));
		//		}
		//		

		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("Id입력:");
			String id=sc.next();
			System.out.print("Pw입력:");
			String pw=sc.next();
			list.add(new Person(id, pw));

			System.out.print("계속?");
			String ddd=sc.next();
			if(ddd.equals("n")) {
				System.out.println(list);
				break;
			}

		} while(true);


	}

}




//여기부터 과제시작
//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]
