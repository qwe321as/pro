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


public class Ex09_05_���� {
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

	System.out.println(list.toString()); //Array�� toString��<>toString�� ���⶧���� ���⼱ Person3�� toString�� ���´�. 		
	//Person3 toString�� ���������������鰪�� �ȳ����Ƿ� .toString�� �������࿩�Ѵ�.
	//�������Ҷ� �θ��� ���������ں��� ���ų� ���ƾ��ϴµ� Person3�� �θ�� Object�̱⿡ public�������.
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
		System.out.println("id�� �Է��ϼ���.");
	 id = sc.next();		
		System.out.println("��й�ȣ�� �Է��ϼ���");
	 pw = sc.next();	
	 list.add(new Person3(id,pw));
	System.out.println("����Ͻðڽ��ϱ�?");	
	qw = sc.next();
	if(qw.equalsIgnoreCase("y")) {
		System.out.println("����ϰڽ��ϴ�.");
		continue;
	}
	else if(qw.equalsIgnoreCase("n")) {
		System.out.println("�����ϰڽ��ϴ�.");
		System.out.println(list);
		break;
	}
	 
	}while(true);
	
	
}
}
