import java.util.ArrayList;

public class Ex09_03_ArrayList {
	public static void main(String[] args) {
// b o a m
		ArrayList<String> list = new ArrayList<String>();
		list.add("banana");
		list.add("orange");
		list.add("apple");
		System.out.println(list.toString());
		System.out.println(list.get(1));
		list.add(2,"melon");
		System.out.println(list.toString());
		
	}
}
