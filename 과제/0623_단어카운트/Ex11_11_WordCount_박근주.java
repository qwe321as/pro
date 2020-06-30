import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_11_WordCount_�ڱ��� {

	public static void main(String[] args) throws IOException {
		//FileNotFoundException �ڽ��̶� IOException �θ� �ᵵ ����

//		String lyrics = "When I find myself"+
//				"in times of trouble"+
//				"Mother Mary comes to me"+
//				"Speaking words of wisdom let it be"+
//				"And in my hour of darkness"+
//				"She is standing right in front of me"+
//				"Speaking words of wisdom let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Whisper words of wisdom let it be"+
//				"And when the broken hearted people"+
//				"Living in the world agree"+
//				"There will be an answer let it be"+
//				"For though they may be parted"+
//				"There is still a chance that"+
//				"they will see"+
//				"There will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Yeah there will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Whisper words of wisdom let it be"+
//				"Let it be let it be"+
//				"Ah let it be yeah let it be"+
//				"Whisper words of wisdom let it be"+
//				"And when the night is cloudy"+
//				"There is still a light"+
//				"that shines on me"+
//				"Shine on until tomorrow let it be"+
//				"I wake up to the sound of music"+
//				"Mother Mary comes to me"+
//				"Speaking words of wisdom let it be"+
//				"Let it be let it be"+
//				"Let it be yeah let it be"+
//				"Oh there will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be yeah let it be"+
//				"Whisper words of wisdom let it be";

		//FileReader fr= new FileReader("lyrics.txt");
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		String str,lyrics="";
		int lineCount = 0;
		while((str = br.readLine())!=null) {
			//System.out.println(str);
			lyrics +=str+" ";
			lineCount++;
		}
		System.out.println(lyrics);
		System.out.println("lineCount:"+lineCount);

		String[] result = lyrics.split(" ");
		System.out.println(result.length);

		HashMap<String,Integer>hm = new HashMap<String,Integer>();

		for(int i = 0;i<result.length;i++) {
			if(hm.get(result[i])==null)
				hm.put(result[i],1);
			else
				  
				  hm.put(result[i],hm.get(result[i])+1);

		}
		Set<String> s = hm.keySet();
		System.out.println("s:"+s);
		System.out.println(s.size());
		
		Iterator<String> iter = s.iterator();
		while(iter.hasNext()) {
			String st = iter.next();
			System.out.println(st+":"+hm.get(st));
		}

	}//����ĥ������ �� �پ� �а� 39�����
	//���鸸���� ����� ���� ������ ����� ���ø��޼���
	//for�� 246
	// map Ű �� �ʿ� �ߺ��� ������ ���� ���� ���ϱ� 1 �ؼ� ���� �ִ´�

}
