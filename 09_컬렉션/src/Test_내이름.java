import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String toString() {
		return name+"/"+kor+"/"+eng;
	}
}

public class Test_내이름 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		String name,retry;
		int kor,eng,i;
		while(true) {

			System.out.print("이름:");
			name = sc.next();
			System.out.print("국어:");
			kor = sc.nextInt();
			System.out.print("영어:");
			eng = sc.nextInt();
			Student s = new Student(name,kor,eng);
			list.add(s);

			System.out.print("계속?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		
		System.out.println(list);
		
		for(i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.println(s);
			//System.out.println(list.get(i));
		}
		
		do {
			boolean flag = false;
			System.out.print("찾는 이름 : ");
			name = sc.next();
			
			for(i=0;i<list.size();i++) {
				//Student s = list.get(i);
				if(list.get(i).getName().equals(name)) {
					System.out.println("국어:"+list.get(i).getKor());
					System.out.println("영어:"+list.get(i).getEng());
					flag = true;
					break;
				}
			}
			if(flag == false)
				System.out.println("찾는 이름 없음");
			
			System.out.print("계속?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}

}

//이름:kim
//국어:33
//영어:44
//계속?(y/n) : y
//이름:park
//국어:77
//영어:88
//계속?(y/n) : n
//[kim/33/44, park/77/88]
//
//kim/33/44
//park/77/88
//
//찾는 이름 : park
//국어:77
//영어:88
//계속?y
//찾는 이름 : choi
//찾는 이름 없음
//계속?n
//프로그램을 종료합니다.




