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

public class Test_���̸� {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		String name,retry;
		int kor,eng,i;
		while(true) {

			System.out.print("�̸�:");
			name = sc.next();
			System.out.print("����:");
			kor = sc.nextInt();
			System.out.print("����:");
			eng = sc.nextInt();
			Student s = new Student(name,kor,eng);
			list.add(s);

			System.out.print("���?(y/n):");
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
			System.out.print("ã�� �̸� : ");
			name = sc.next();
			
			for(i=0;i<list.size();i++) {
				//Student s = list.get(i);
				if(list.get(i).getName().equals(name)) {
					System.out.println("����:"+list.get(i).getKor());
					System.out.println("����:"+list.get(i).getEng());
					flag = true;
					break;
				}
			}
			if(flag == false)
				System.out.println("ã�� �̸� ����");
			
			System.out.print("���?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
		System.out.println("���α׷��� �����մϴ�.");
	}

}

//�̸�:kim
//����:33
//����:44
//���?(y/n) : y
//�̸�:park
//����:77
//����:88
//���?(y/n) : n
//[kim/33/44, park/77/88]
//
//kim/33/44
//park/77/88
//
//ã�� �̸� : park
//����:77
//����:88
//���?y
//ã�� �̸� : choi
//ã�� �̸� ����
//���?n
//���α׷��� �����մϴ�.




