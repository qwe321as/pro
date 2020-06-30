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
	public String toString() {//object�� public�̴ϱ� object�� �ޱ����� public�� ����
		return id+"/"+pw;
	}

}
public class Ex09_04_�輱�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person [] p = {new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")
		};

		ArrayList<Person> list = new ArrayList<Person>();//������ person���� return�ؼ� �޴°Ŵ� ���� Ex09_03���� String ��ü����� <String>�Ἥ �ٷ� �޾����� 
		//		list.add(p1);									//���⼱ <Person>�� �ּҸ� �ޱ⿡ ���� object���� �ּҸ� �޾ƾ��ؼ� person�� �ּҸ� �ޱ����� public�޼��带 ����Ѵ�.
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
			System.out.print("���?");
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
//���?y
//ID:won
//PW:9988
//���?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]






