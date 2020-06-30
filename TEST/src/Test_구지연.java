import java.util.*;

class Student{
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
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
		return name + "/" + kor + "/" + eng;
	}

}
public class Test_������ {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);
		String name, retry, searchName ;
		int kor, eng, i ;
		boolean flag = false;

		while(true) {
			System.out.print("name : ");
			name = sc.next();
			System.out.print("kor : ");
			kor = sc.nextInt();
			System.out.print("eng : ");
			eng = sc.nextInt();

			Student st = new Student(name,kor,eng);
			list.add(st);

			System.out.print("continue? (yes or no)");
			retry = sc.next();
			if(retry.equalsIgnoreCase("no")) 
				break;
		}//while
		System.out.println(list);
		for(i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.println(s.getName()+"/"+s.getKor()+"/"+s.getEng());
		}


		while(true) {
			flag=false;
			
			System.out.print("ã���̸�: ");
			searchName = sc.next();
			
			for(i=0;i<list.size();i++) {
				Student s = list.get(i);
				if(searchName.equalsIgnoreCase(s.getName())) {
					flag = true;
					System.out.println("kor: " + s.getKor());
					System.out.println("eng: " + s.getEng());
					System.out.println();
					System.out.println("continue? (q=����)");

				}//if
				else if(searchName.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				}
				
			}//for
			if(flag == false) {
				System.out.println("ã�� �̸��� �����ϴ�.");
				System.out.println("continue? (q=����)");
			}
			
		}//while
	

	}//main

}//class

//�̸�
//����
//����
//���?(y/n):
//	n
//	[kim/33/44, park/77/88]
//			
//			�ϳ��� ���
//			kim/33/44
//			park/77/88
//			
//			ã���̸� : park
//			����:77
//			���� : 88
//			���: y
//			n
//			���α׷��� �����մϴ�.