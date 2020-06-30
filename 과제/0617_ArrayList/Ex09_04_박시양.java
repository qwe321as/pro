import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;

	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() { // <--따로 안만들면 부모에게 물려받은 toString(주소값출력)
		return id + "/" + pw; //
	}


}
public class Ex09_04_박시양 {

	public static void main(String[] args) {

		//		Person p1 = new Person("kim", "1234");
		//		Person p2 = new Person("park", "5678");
		//		Person p3 = new Person("choi", "9999");
		//		
		//		ArrayList<Person> list = new ArrayList<Person>();
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(new Person("choi","9999"));
		//		System.out.println(list.toString()); // Person의  toString 리턴(위에 toString생성자 따로안만들면 주소값 리턴)


		Person[] p = { new Person("kim", "1234"),
				new Person("park", "5678"),
				new Person("choi", "9999"),
		};

		ArrayList<Person> list = new ArrayList<Person>();

		int i;
		for(i=0; i<p.length; i++) {
			list.add(p[i]);
		}

		System.out.println(list.toString());
		Person one = list.get(1);
		System.out.println("one:" + one.toString());//<--복잡
		System.out.println(list.get(1));//<--간편
		System.out.println("=============================");



		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("아이디 입력: ");
			String id2 = sc.next();

			System.out.print("비밀번호 입력:");
			String pw2 = sc.next();

			list.add(new Person(id2,pw2));


			System.out.print("계속?(y/n)");
			String ing = sc.next();

			if(ing.equalsIgnoreCase("y")) {
				continue;
			}else if(ing.equalsIgnoreCase("n")){
				System.out.println(list);
				System.out.println("종료합니다.");
				break;

			}else {
				System.out.println("y또는 n만 입력 해주세요");
			}

		}while(true);
	}

}

//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]






