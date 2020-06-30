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
public class Ex09_06_이기선 {

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
				System.out.print("Select work 1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료 : ");
				sel = sc.next();
				if(sel.equals("1") || sel.equals("2") || sel.equals("3") || sel.equals("4") || sel.equals("5")  ) {
					System.out.println("올바른 메뉴 선택");
					break;
				}
				else {
					System.out.println("다시 선택하여 주십시요. 잘못된 선택");
				}
				
			}while(true);
			
//			선택된 업무 별로 업무 진행
			switch(sel) {
			case "1" :   //1.명함추가
				System.out.print("명함 이름 입력 Input Name : ");
				name = sc.next();
				System.out.print("명함 전화번호 Input Telephone Number : ");
				phone = sc.next();
				list2.add(new Card(name,phone));
				System.out.println(""+list2.get(iCount).toString());
				iCount++;				
				break;
			case "2" :  //2.명함삭제
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
					System.out.println("일치하는 Card 값이 없습니다.");
				}
				break;
			case "3" :   //3.명함수정
				System.out.print("수정할 명함 이름 : ");
				name = sc.next();
				i1 = 0;
				boolean successUpdate = false ;
				cCount = list2.size();
				for(i1=0; i1 < list2.size() && !successUpdate ; i1++) {
					if(list2.get(i1).getName().equals(name)) {
						System.out.println("Before Update list2.get(i1).toString() : "+list2.get(i1).toString());  
						System.out.print("수정할 번호를 넣으세요. : ");
						phone = sc.next();
						list2.get(i1).setPhone(phone);
						System.out.println("After Update list2.get(i1).toString() : "+list2.get(i1).toString());  
						successUpdate = true;
					}					
				}
				if(!successUpdate) {
					System.out.println("일치하는 Card 값이 없습니다.");
				}
				break;
			case "4" :   //4.명함보기
				System.out.println("명함 보기를 위한 이름 입력 : ");
				name = sc.next();
				if(name.equals("all")) {
					System.out.println("전체 명함 보기");
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
						System.out.println("입력된 이름 명함 보기 list2.get(i1).toString() : "+list2.get(i1).toString());  
						successExgist = true;
					}					
				}
				if(!successExgist) {
					System.out.println("일치하는 Card 값이 없습니다.");
				}				
				break;
			case "5" :   //5.종료
				keepGoing = false;
				System.out.println("Good Bye!");
				break;				
			} // switch
			
		} while (keepGoing);
		System.out.println("Good Bye!2");
		sc.close();
		
		

	}

}


//1.명함추가 2.명함삭제 3. 명함수정 4.명함보기 5.종료