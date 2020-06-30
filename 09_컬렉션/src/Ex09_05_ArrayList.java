import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;

	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + ", price=" + price + "]";
	}

}

public class Ex09_05_ArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Music> list = new ArrayList<Music>();
		String retry;
		int i;
		while(true) {
			System.out.print("제목:");
			String title = sc.next();
			System.out.print("가수:");
			String singer = sc.next();
			System.out.print("가격:");
			int price = sc.nextInt();

			Music m = new Music(title,singer,price);
			list.add(m);
			System.out.print("계속?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}

		System.out.println(list.toString());
		System.out.println();
		
		boolean flag = false;
		
		while(true) {
			flag = false;
			System.out.print("찾는 제목 입력:");
			String searchTitle = sc.next();
			
			for(i=0;i<list.size();i++) {
				if(list.get(i).getTitle().equals(searchTitle)) {
					System.out.println(list.get(i).getTitle() + 
										"의 가수명은 " +
										list.get(i).getSinger());
					flag = true;
					break;
				}
			}
			
			if(flag == false)
				System.out.println("찾는 제목이 없습니다.");
			
			
			System.out.print("계속?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}//while
		
		System.out.println("프로그램을 종료합니다.");
	}

}
//제목:aaa
//가수:bbb
//가격:1000
//계속?y
//제목:ccc
//가수:ddd
//가격:2000
//계속?n
//[aaa/bbb/1000, ccc/ddd/2000]
//찾는 제목 입력:ccc
//ccc의 가수명은 ddd
//계속?y
//찾는 제목 입력:xxx
//찾는 제목이 없습니다.
//계속?n
//프로그램을 종료합니다.