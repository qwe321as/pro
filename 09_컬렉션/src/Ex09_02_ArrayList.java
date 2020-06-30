import java.util.ArrayList;

public class Ex09_02_ArrayList {
	public static void main(String[] args) {
//		Object(toString())
//			|
		String s = "hello";
		System.out.println("s:"+s.toString());
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("al.size():"+al.size());
		al.add("����");//0
		al.add("�¿�");
		al.add("����");
		al.add("ȿ��");
		al.add("����");
		
		System.out.println("al:"+al.toString());
		System.out.println("al.size():"+al.size());
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		
		al.add(1,"����");
		System.out.println("al:"+al.toString());
//		length:�迭�� ���� ����
//		length():���ڿ��� ����
//		size():�÷��� ��������� ũ�� 
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("������");
		add.add("����");
		
		al.addAll(add);
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		String str = al.remove(1);
		boolean b = al.remove("����");
		System.out.println(str+","+b);
		
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		al.add("����");
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		ArrayList<String> rm = new ArrayList<String>();
		rm.add("����");
		
		al.removeAll(rm);
		System.out.println("al:"+al.toString());
		System.out.println(al.size());
		
		int pos = al.indexOf("ȿ��");
		System.out.println("pos:"+pos);
		
		pos = al.indexOf("����");
		System.out.println("pos:"+pos);
		
		boolean isExist = al.contains("ȿ��");
		System.out.println("isExist:"+isExist);
		
		isExist = al.contains("����");
		System.out.println("isExist:"+isExist);
		
		al.set(1, "����");
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



