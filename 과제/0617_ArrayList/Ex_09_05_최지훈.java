import java.util.ArrayList;
import java.util.Scanner;

class Person2{
	String id;
	String pw;
	
	Person2(String id,String pw){
		this.id=id;
		this.pw=pw;
	}
	public String toString() { 
       
		return id+"/"+pw;
}
}
public class Ex_09_05_������ {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Person2> list = new ArrayList<Person2>();
		do {
			
			
			System.out.print("���̵� �Է��ϼ���");
			String inputid = sc.next();
			System.out.println("�н����带 �Է��ϼ���");
			String inputpw = sc.next();
			
			
			
			Person2[] p = {new Person2(inputid,inputpw)};
			
			for(int i=0;i<p.length;i++) {
			list.add(p[i]);
			}
			
		
		System.out.println("�������� n / ����Ϸ��� y");
		String end = sc.next();
		if(end.equals("y")) {
			continue;
		}
		else if(end.equals("n")) {
			
			break;
		}
		
		}while(true);
		System.out.println("���ݱ��� �Է¹��� ���̵�� �н������ "+list);
		
	
	}//main

}
