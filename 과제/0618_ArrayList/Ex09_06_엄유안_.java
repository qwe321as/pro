import java.util.*;

class Card{
	private String name;
	private String tel;

	Card (String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}

	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String toString() {
		return name+"  "+"  "+tel;
	}
	
}



public class Ex09_06_������_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
	
		int i;
		String name, tel, inputName, inputTel, reTel;
		
		while(true) {
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����"); 
			int select = sc.nextInt();
			boolean flag = false;
			
			
			switch(select) {
					
			case 1: System.out.print("�̸��� �Է��ϼ��� : ");
					name = sc.next();
					System.out.print("��ȭ��ȣ�� �Է��ϼ���.");
					tel = sc.next();
					list.add(new Card(name, tel));
					break;
			
					
			case 2:  flag = false;
				     System.out.print("�̸��� �Է��ϼ���: ");
				     inputName = sc.next();
				    	for(i=0; i<list.size();i++) { 
				    		if(list.get(i).getName().equals(inputName))
				   				{
				   					System.out.println("�����Ǿ����ϴ�.");
				   					list.remove(i);
				   					flag=true;
				   					break;
				   				}
				    	}	
				    	if (flag==false) {
			    		System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
			    		continue;
				   		}
	
			case 3: flag = false;
				    System.out.println("�̸��� �Է��ϼ���: ");
				    inputName = sc.next();
				    for(i=0; i<list.size(); i++) {
				    	if(list.get(i).getName().equals(inputName)) {
				    		System.out.println("�����Ͻ� ��ȭ��ȣ�� : ");
				    		reTel = sc.next();
				    		System.out.println("�����Ǿ����ϴ�.");
				    		list.add(new Card(inputName, reTel));
				    		break;
				    	}
				    }
				    if (flag==false) {
		    			System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
		    			inputTel = sc.next();
		    			continue;
		    	}
		  
			case 4: while(true){flag = false;
					System.out.println("�̸�     "+"  ��ȭ��ȣ");
					for (i=0; i<list.size(); i++) {
						System.out.println(list.get(i).toString());
						break;
					}
			}
			default:{flag = false;
					System.out.println("���α׷��� �����մϴ�.");
					break;
					// 4���� 4���� ������, 5���� 5���� ������ ����� �߸𸣰ھ��..
					// case���� �ݺ������ε� ���κ���, ȥ�ڸ� �� ���κ���, ���غôµ�,,,������ �𸣰ھ��̤�
					}             	
			}//ū while 
			break;
		}
	
	} 
}

//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : kim
//��ȭ��ȣ�� �Է��ϼ��� : 1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : park
//��ȭ��ȣ�� �Է��ϼ��� : 3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : park
//�����Ͻ� ��ȭ��ȣ�� : 7777
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		7777
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : choi
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : park
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : hong
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:5
//���α׷��� �����մϴ�.
