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
			System.out.print("����:");
			String title = sc.next();
			System.out.print("����:");
			String singer = sc.next();
			System.out.print("����:");
			int price = sc.nextInt();

			Music m = new Music(title,singer,price);
			list.add(m);
			System.out.print("���?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}

		System.out.println(list.toString());
		System.out.println();
		
		boolean flag = false;
		
		while(true) {
			flag = false;
			System.out.print("ã�� ���� �Է�:");
			String searchTitle = sc.next();
			
			for(i=0;i<list.size();i++) {
				if(list.get(i).getTitle().equals(searchTitle)) {
					System.out.println(list.get(i).getTitle() + 
										"�� �������� " +
										list.get(i).getSinger());
					flag = true;
					break;
				}
			}
			
			if(flag == false)
				System.out.println("ã�� ������ �����ϴ�.");
			
			
			System.out.print("���?(y/n):");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}//while
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
//����:aaa
//����:bbb
//����:1000
//���?y
//����:ccc
//����:ddd
//����:2000
//���?n
//[aaa/bbb/1000, ccc/ddd/2000]
//ã�� ���� �Է�:ccc
//ccc�� �������� ddd
//���?y
//ã�� ���� �Է�:xxx
//ã�� ������ �����ϴ�.
//���?n
//���α׷��� �����մϴ�.