import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09_10_HashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // 키,값
		hm.put("아이린",new Integer(23));
		hm.put("슬기",new Integer(45));
		hm.put("웬디",new Integer(72));
		hm.put("조이",26); // 26 => new Integer(26)
		hm.put("예리",16); // 26 => new Integer(26)
		
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get("웬디"));
		System.out.println(hm.get("아이유"));
		System.out.println(hm.get("26"));
		
		System.out.println(hm.containsKey("슬기"));
		System.out.println(hm.containsKey("수지"));
		System.out.println(hm.containsKey("26"));
		
		System.out.println(hm.containsValue("슬기"));
		System.out.println(hm.containsValue("26"));
		System.out.println(hm.containsValue(26));
		System.out.println();
		
		Set key = hm.keySet();
		System.out.println("key:"+key);
		
		Collection<Integer> values = hm.values();
		System.out.println("values:"+values);
		
		int i;
//		for(i=0;i<key.size();i++) {
//			System.out.println();
//		}
		
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name+":"+hm.get(name));
		}
		
//		웬디:72
//		슬기:45
//		예리
//		아이린
//		조이

		
	}

}







