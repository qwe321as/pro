import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11_11_WordCount_±è¹®°ü {

	public static void main(String[] args) throws Exception {


		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));

		String line;
		int sum = 0;
		int count = 0;
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();


		while(true) {
			if((line = br.readLine()) != null) {
				String[] cut = line.split(" ");
				count++;
				sum += cut.length;
				System.out.print(line + " ");
				
				for(int i = 0; i < cut.length; i++) {
					if(hm.containsKey(cut[i])) {
						hm.put(cut[i], hm.get(cut[i])+1);
					}else {
						hm.put(cut[i], 1);
					}
				}
				
			}else {
				break;
			}
		}

		

		System.out.println();
		System.out.println("lineCount: " + count);
		System.out.println("=========================");
		System.out.println("result length : " +  sum);
		System.out.println("set : " + hm.keySet());
		System.out.println(sum + " / " + hm.size());
		
		
		
		
		
		Iterator<String> iter = hm.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + ":" + hm.get(key));
		}
		
		br.close();

	}
}