import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// Let it be 글자수, 단어별 숫자 확인
public class Ex11_11_이기선 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al1 = new ArrayList<String>();
		Map<String,Integer> hm1 = new HashMap<String,Integer>();
		Set<String> s1 = null ;
//		Set<String> s1 = new HashSet<String>();
		Iterator itr = null;
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		BufferedReader br = null;
		String fileName = "Ex11_11_이기선.txt";
		int wordFullCnt = 0,wordCnt=0;
		String separator = "/, ";
		String word="";
		String iStr="";

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int lineCnt = 0;

		try {
			while((iStr=br.readLine())!=null) {
				lineCnt++;
				StringTokenizer st = new StringTokenizer(iStr," ,/\"+;");
				while(st.hasMoreElements()) {
					word = st.nextToken();
					word=word.trim();
					al1.add(word);
					if(hm1.containsKey(word)) {
						int wordNum = hm1.get(word);
						wordNum = wordNum + 1;
						hm1.put(word, wordNum);
					} else {
						hm1.put(word, 1);					}
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All Sentence Count : "+lineCnt);
		System.out.println("All word Count : "+al1.size());
		System.out.println("All word : "+al1.toString());
		System.out.println("All Map size : "+ hm1.size());
		System.out.println("All Map data : "+ hm1.toString());
		
		s1=hm1.keySet();
		itr=s1.iterator();
		while(itr.hasNext()) {
			String keys = (String)itr.next();
//			System.out.print("Key : "+keys+" - ");
//			System.out.println("  Value : "+hm1.get(keys));
			System.out.print(keys+" : ");
			System.out.println(hm1.get(keys));
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




