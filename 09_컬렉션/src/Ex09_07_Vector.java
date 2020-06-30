import java.util.Enumeration;
import java.util.Vector;

public class Ex09_07_Vector {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("º½");
		v.add("¿©¸§");
		v.add("º½");
		v.add("°Ü¿ï");
		
		System.out.println("v:"+v);
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			String el = en.nextElement();
			System.out.println(el);
		}
		System.out.println();
		
		for( String temp : v) {
			System.out.println(temp);
		}
	}

}








