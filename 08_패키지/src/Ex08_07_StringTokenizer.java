import java.util.StringTokenizer;

public class Ex08_07_StringTokenizer {
	public static void main(String[] args) {

		StringTokenizer str = 
				new StringTokenizer("2020/6|16,15:45",",/:"); // ������
		
		int count;
		count = str.countTokens(); // �Ľ�
		System.out.println("count:"+count);
		
		while(str.hasMoreTokens()) {
			String s = str.nextToken();
			System.out.println("s:"+s);
		}
	}
}
