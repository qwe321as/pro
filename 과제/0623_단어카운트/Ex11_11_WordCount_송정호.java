import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_11_WordCount_송정호 {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> hm = new HashMap<String, Integer>();
		ArrayList<String> al = new ArrayList<String>();

		try {

			BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));

			String line;
			int lineLeng = 0;
			int arrLeng = 0;
			int wordCnt = 0;

			while((line = br.readLine()) != null) {

				lineLeng++;

				System.out.print(line + " ");

				String word[] = line.split(" ");

				for(int i = 0; i < word.length; i++) {

					arrLeng++;
					
					al.add(word[i]);

					hm.put(word[i], 0);
				}
			}
			
			System.out.println();
			System.out.println();
			System.out.println("라인 길이 : " + lineLeng);
			System.out.println("=======================");
			System.out.println("배열 길이 : " + arrLeng);
			System.out.println("set : " + hm.keySet());
			System.out.println(arrLeng + " / " + hm.size());

			Iterator<String> iter = hm.keySet().iterator();
			while(iter.hasNext()) {

				String str = iter.next();

				for(int i = 0; i < al.size(); i++) {

					if(str.equals(al.get(i))) {

						wordCnt++;
					}
				}
				
				hm.put(str, wordCnt);
				wordCnt = 0;
				
				System.out.println(str + " : " + hm.get(str));
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

//공백으로 쪼개서(split) 배열 생성 247개
//중복 단어 카운트  
//map이용 (키와 값으로 구성)

//데이터 한줄 출력
//라인 길이
//========
//배열 길이
//set : [단어]
//247/69
//단어 : 카운트
//단어 : 카운트
//단어 : 카운트