import java.util.ArrayList;
import java.util.Scanner;

class Card {
	private String name ;
	private String phone ;
	public Card() {
		super();
	}
	public Card(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Card [name=" + name + ", phone=" + phone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
public class Ex09_06_�̱⼱ {

	public static void main(String[] args) {
		ArrayList<Card> list2 = new ArrayList<Card>();
		Card c1 ;
		String name="", phone="";
		int iCount=0, pos=0,i1;
		int cCount=0;
		boolean keepGoing = true;
		String sel="";
		String yesFlag="";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.print("Select work 1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.���� : ");
				sel = sc.next();
				if(sel.equals("1") || sel.equals("2") || sel.equals("3") || sel.equals("4") || sel.equals("5")  ) {
					System.out.println("�ùٸ� �޴� ����");
					break;
				}
				else {
					System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�. �߸��� ����");
				}
				
			}while(true);
			
//			���õ� ���� ���� ���� ����
			switch(sel) {
			case "1" :   //1.�����߰�
				System.out.print("���� �̸� �Է� Input Name : ");
				name = sc.next();
				System.out.print("���� ��ȭ��ȣ Input Telephone Number : ");
				phone = sc.next();
				list2.add(new Card(name,phone));
				System.out.println(""+list2.get(iCount).toString());
				iCount++;				
				break;
			case "2" :  //2.���Ի���
				System.out.print("Input Delete Name : ");
				name = sc.next();
				i1 = 0;
				boolean successDelete = false ;
				cCount = list2.size();
				for(i1=0; i1 < list2.size() && !successDelete ; i1++) {
					if(list2.get(i1).getName().equals(name)) {
						System.out.println("Delete list2.get(i1).toString() : "+list2.get(i1).toString());  
						list2.remove(i1);
						successDelete = true;
						iCount--;
					}					
				}
				if(!successDelete) {
					System.out.println("��ġ�ϴ� Card ���� �����ϴ�.");
				}
				break;
			case "3" :   //3.���Լ���
				System.out.print("������ ���� �̸� : ");
				name = sc.next();
				i1 = 0;
				boolean successUpdate = false ;
				cCount = list2.size();
				for(i1=0; i1 < list2.size() && !successUpdate ; i1++) {
					if(list2.get(i1).getName().equals(name)) {
						System.out.println("Before Update list2.get(i1).toString() : "+list2.get(i1).toString());  
						System.out.print("������ ��ȣ�� ��������. : ");
						phone = sc.next();
						list2.get(i1).setPhone(phone);
						System.out.println("After Update list2.get(i1).toString() : "+list2.get(i1).toString());  
						successUpdate = true;
					}					
				}
				if(!successUpdate) {
					System.out.println("��ġ�ϴ� Card ���� �����ϴ�.");
				}
				break;
			case "4" :   //4.���Ժ���
				System.out.println("���� ���⸦ ���� �̸� �Է� : ");
				name = sc.next();
				if(name.equals("all")) {
					System.out.println("��ü ���� ����");
					for(i1=0;i1<list2.size();i1++) {
						System.out.println(""+list2.get(i1).toString());
					}
					break;
				}
				i1 = 0;
				boolean successExgist = false ;
				cCount = list2.size();
				for(i1=0; i1 < list2.size() && !successExgist ; i1++) {
					if(list2.get(i1).getName().equals(name)) {
						System.out.println("�Էµ� �̸� ���� ���� list2.get(i1).toString() : "+list2.get(i1).toString());  
						successExgist = true;
					}					
				}
				if(!successExgist) {
					System.out.println("��ġ�ϴ� Card ���� �����ϴ�.");
				}				
				break;
			case "5" :   //5.����
				keepGoing = false;
				System.out.println("Good Bye!");
				break;				
			} // switch
			
		} while (keepGoing);
		System.out.println("Good Bye!2");
		sc.close();
		
		

	}

}


//1.�����߰� 2.���Ի��� 3. ���Լ��� 4.���Ժ��� 5.����