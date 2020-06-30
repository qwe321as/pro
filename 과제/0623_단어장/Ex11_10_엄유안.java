import java.io.*;
import java.util.*;

public class Ex11_10_엄유안 {

	public static void main(String[] args){
		String vocan = null, voc = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		try {
			FileWriter fw = new FileWriter("voca.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(true) {
				System.out.print("1.단어입력  2.단어검색  3.종료 >>  ");
				int num = sc.nextInt();
				
				if (num==1) {
					System.out.print("단어/뜻 입력>>");
					vocan=br.readLine();
					bw.write(vocan);
					bw.newLine();
				}
				
				
				else if(num==2) {
					System.out.print("검색 단어 입력>>");
					voc=br.readLine();
					if(vocan.equals(voc)) {
						StringTokenizer str = new StringTokenizer(vocan,",/:");
						
						while(str.hasMoreTokens()){
							System.out.print("단어>");
							String s = str.nextToken();
							System.out.println(s);
							System.out.print("단어의 뜻>");
							String s1 = str.nextToken();
							System.out.println(s1);
							
						}
					}
					else
						System.out.println("찾는 단어 없음");
				}
				else
					System.out.println("시스템 종료");
				
				bw.close(); // close를 해야 voca.txt에 문자가 생기는데 close를 넣으면 scanner에 문제가 있다고 떠요 ㅠㅠ
				br.close();	// 그렇다고 close를 위쪽 while moreTokens쪽으로 옮기면 반복이 안되구요..여기까지가 제 한계입니다.
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	
	
		}
}

//입력한 단어/뜻은 voca.txt에 쓰기
//1.단어입력  2.단어검색  3.종료 >>
//단어/뜻 입력>> apple/사과
//1.단어입력  2.단어검색  3.종료 >>
//단어/뜻 입력>> blue sky/파란 하늘 ---> 아까 입력했던 단어가 그대로 남아있도록 
//1.단어입력  2.단어검색  3.종료 >> -----> 새로 등록된 단어는 계속 추가되도록
//검색 단어 입력>> apple
//단어> apple --------------> "/" 슬러쉬 기준으로 쪼개서 앞과 뒤 를 가져옴
//단어의 뜻> 사과
// ㄴ> 찾는 단어 없음
// 3번 입력할때까지 계속 해옴