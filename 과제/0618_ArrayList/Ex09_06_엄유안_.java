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



public class Ex09_06_엄유안_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
	
		int i;
		String name, tel, inputName, inputTel, reTel;
		
		while(true) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료"); 
			int select = sc.nextInt();
			boolean flag = false;
			
			
			switch(select) {
					
			case 1: System.out.print("이름을 입력하세요 : ");
					name = sc.next();
					System.out.print("전화번호를 입력하세요.");
					tel = sc.next();
					list.add(new Card(name, tel));
					break;
			
					
			case 2:  flag = false;
				     System.out.print("이름을 입력하세요: ");
				     inputName = sc.next();
				    	for(i=0; i<list.size();i++) { 
				    		if(list.get(i).getName().equals(inputName))
				   				{
				   					System.out.println("삭제되었습니다.");
				   					list.remove(i);
				   					flag=true;
				   					break;
				   				}
				    	}	
				    	if (flag==false) {
			    		System.out.println("이름을 잘못 입력하였습니다.");
			    		continue;
				   		}
	
			case 3: flag = false;
				    System.out.println("이름을 입력하세요: ");
				    inputName = sc.next();
				    for(i=0; i<list.size(); i++) {
				    	if(list.get(i).getName().equals(inputName)) {
				    		System.out.println("수정하실 전화번호는 : ");
				    		reTel = sc.next();
				    		System.out.println("수정되었습니다.");
				    		list.add(new Card(inputName, reTel));
				    		break;
				    	}
				    }
				    if (flag==false) {
		    			System.out.println("이름을 잘못 입력하였습니다.");
		    			inputTel = sc.next();
		    			continue;
		    	}
		  
			case 4: while(true){flag = false;
					System.out.println("이름     "+"  전화번호");
					for (i=0; i<list.size(); i++) {
						System.out.println(list.get(i).toString());
						break;
					}
			}
			default:{flag = false;
					System.out.println("프로그램을 종료합니다.");
					break;
					// 4번은 4번만 나오고, 5번은 5번만 나오는 방법을 잘모르겠어요..
					// case끼리 반복문으로도 감싸보고, 혼자만 또 감싸보고, 다해봤는데,,,도무지 모르겠어요ㅜㅜ
					}             	
			}//큰 while 
			break;
		}
	
	} 
}

//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : kim
//전화번호를 입력하세요 : 1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : park
//전화번호를 입력하세요 : 3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : park
//수정하실 전화번호는 : 7777
//수정되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		7777
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : choi
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : park
//삭제되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : hong
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
//프로그램을 종료합니다.
