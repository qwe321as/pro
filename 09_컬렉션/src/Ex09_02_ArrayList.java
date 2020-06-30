import java.util.ArrayList;

public class Ex09_02_ArrayList {
	public static void main(String[] args) {
//		Object(toString())
//			|
		String s = "hello";
		System.out.println("s:"+s.toString());
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("al.size():"+al.size());
		al.add("윤아");//0
		al.add("태연");
		al.add("수영");
		al.add("효연");
		al.add("수영");
		
		System.out.println("al:"+al.toString());
		System.out.println("al.size():"+al.size());
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		
		al.add(1,"서현");
		System.out.println("al:"+al.toString());
//		length:배열의 방의 갯수
//		length():문자열의 갯수
//		size():컬렉션 저장공간의 크기 
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("아이유");
		add.add("수지");
		
		al.addAll(add);
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		String str = al.remove(1);
		boolean b = al.remove("수영");
		System.out.println(str+","+b);
		
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		al.add("수영");
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		ArrayList<String> rm = new ArrayList<String>();
		rm.add("수영");
		
		al.removeAll(rm);
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		int pos = al.indexOf("효연");
		System.out.println("pos:"+pos);
		
		pos = al.indexOf("웬디");
		System.out.println("pos:"+pos);
		
		boolean isExist = al.contains("효연");
		System.out.println("isExist:"+isExist);
		
		isExist = al.contains("웬디");
		System.out.println("isExist:"+isExist);
		
		al.set(1, "유리");
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		
		al.clear();
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		
		
		
		
		
		System.out.println("\n\n\n");
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(10));
		al2.add(20); // 20->new Integer(20)
		al2.add(30);
		System.out.println("al2:"+al2.toString());
		System.out.println("al2.size():"+al2.size());
		System.out.println(al2.get(1));
		
	}

}



