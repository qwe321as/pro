import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09_08_set {
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("bb");
		hs.add("aa");
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.contains("bb"));
		System.out.println(hs.contains("dd"));
		System.out.println(hs.remove("bb"));
		System.out.println(hs.remove("dd"));
		System.out.println(hs);
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}






