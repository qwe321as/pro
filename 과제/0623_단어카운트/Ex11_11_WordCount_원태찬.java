import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;







public class Ex11_11_WordCount_원태찬 {

	public static void main(String[] args) throws Exception {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		BufferedReader in = new BufferedReader(new FileReader("aaa.txt"));

		int sum=0;
		String str="",s;
		int count=0;
		while(true){

			if((s=in.readLine())!=null) {
				String[] cut=s.split(" ");
				count++;
				sum+=cut.length;
				str=str+s;
			}

			else {
				break;
			}
		}
		System.out.println("lineCount:"+count);
		System.out.println("result.length:"+sum);

				StringTokenizer token = new StringTokenizer(str);
		
				while (token.hasMoreElements()) { 
					String up = token.nextElement().toString();
		
					
					if (map.containsKey(up)) {
						map.put(up.toLowerCase(), map.get(up) + 1);
					} else {
						map.put(up.toLowerCase(), 1);
					}

				}




				Iterator<String> keySetIterator = map.keySet().iterator();
		
				while (keySetIterator.hasNext()) {
					String key = keySetIterator.next();
					System.out.println(key + " " + map.get(key));
				} 
				
				



				in.close();
				

					



	
				}}
				


	
		
		
	
//String lyrics = "When I find myself"+
//		"in times of trouble"+
//		"Mother Mary comes to me"+
//		"Speaking words of wisdom let it be"+
//		"And in my hour of darkness"+
//		"She is standing right in front of me"+
//		"Speaking words of wisdom let it be"+
//		"Let it be let it be"+
//		"Let it be let it be"+
//		"Whisper words of wisdom let it be"+
//		"And when the broken hearted people"+
//		"Living in the world agree"+
//		"There will be an answer let it be"+
//		"For though they may be parted"+
//		"There is still a chance that"+
//		"they will see"+
//		"There will be an answer let it be"+
//		"Let it be let it be"+
//		"Let it be let it be"+
//		"Yeah there will be an answer let it be"+
//		"Let it be let it be"+
//		"Let it be let it be"+
//		"Whisper words of wisdom let it be"+
//		"Let it be let it be"+
//		"Ah let it be yeah let it be"+
//		"Whisper words of wisdom let it be"+
//		"And when the night is cloudy"+
//		"There is still a light"+
//		"that shines on me"+
//		"Shine on until tomorrow let it be"+
//		"I wake up to the sound of music"+
//		"Mother Mary comes to me"+
//		"Speaking words of wisdom let it be"+
//		"Let it be let it be"+
//		"Let it be yeah let it be"+
//		"Oh there will be an answer let it be"+
//		"Let it be let it be"+
//		"Let it be yeah let it be"+
//		"Whisper words of wisdom let it be";
// 39줄// 이 내용을 파일에 넣어놓고 파일에서 콘솔에 출력
// lyrics: 한 줄
// lineCount:39
// 공백 만나면 하나씩 끊음(split)
// result.length:247
// 단어의 빈도수: 슬래시로 끊음 
// Map 키,값