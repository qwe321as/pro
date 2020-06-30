import java.util.ArrayList;
import java.util.Scanner;
//Object ㅡ> public String toString() 
class Person{
	String id;
	String pw;
	Person(String id,String pw){
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() { //퍼블릭을 써야함
		return id+"/"+pw;
	}
	public String getId() {
		return id;
		
	}
}


public class Ex09_04_박근주 {

	public static void main(String[] args) {

		//		Person p1 = new Person("kang","0210");
		//		Person p2 = new Person("park","1020");
		//		Person p3 = new Person("IRENE","0329");
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<Person>();
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(p3);
		Person[] p = {new Person ("kang","0210"),
				new Person("park",""+ "1020"),
				new Person("Irene","0329")};


		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);

		}

		System.out.println(list.toString());
		//System.out.println(list.get(1));
		System.out.println(list.get(0));
		Person one = list.get(1);
		System.out.println("one: "+one);

		for(i=0;i<p.length;i++) { 
			System.out.println(list.get(i));
		}

		do{
			System.out.print("id:");
			String idput = sc.next();
			System.out.print("pw:");
			String pwput = sc.next();


			list.add(new Person (idput,pwput));


			boolean ch = true;
			do {
				System.out.print("계속?(y or n):");
				String or = sc.next();
				if(or.equalsIgnoreCase("y")) {
					
					break;
				}
				else if (or.equalsIgnoreCase("n")){
					System.out.println(list);
					
					ch = false;
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 해주세요");
				}

			}while(true);

			if(ch==true) {
				continue;
			}
			else {
				break;
			}
			

		}while(true);
		
		do {
		String searchId;
		boolean flag = false;
		System.out.print("찾는 id 입력: ");
		searchId = sc.next();
		for(i=0;i<list.size();i++) {
			
			if(list.get(i).getId().equals(searchId)) {
				System.out.println("결과:"+list.get(i));
				flag = true;
			}
			
		}
		if(flag == false) {
			System.out.println("찾는 아이디 없음");
			
		}
		boolean flag1 = true;
		do {
		System.out.print("계속?(y or n)");
		String cc = sc.next();
		if(cc.equalsIgnoreCase("y")) {
			break;
		}
		if(cc.equalsIgnoreCase("n")){
			flag1= false;
			break;
		}
		else {
			System.out.println("잘못 입력하셨습니다");
			continue;
		}
		}while(true);
		if(flag1==true) {
			continue;
		}
		
		
		if(flag1==false) {
			break;
		}
		
		}while(true); //
		//스캐너 입력 person 객체로 만들어서 추가
		System.out.println("프로그램 종료");
//		System.out.println(list.size());


	}

}
