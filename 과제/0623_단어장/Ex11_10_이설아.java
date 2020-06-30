import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_이설아 {
	public static void main(String[] args) throws IOException {
		//단어장 만들기

		//1.단어입력  :단어와 뜻은 /로 구분 
		//          입력한 단어/뜻은 파일 voca.txt에 기록되게 (공백도 같이 기록되어야함)
		//3.종료하고 다시 실행하면 , 기존에 입력했던 단어는 사라지지 않고 계속남아있게 (새로운 단어는 밑에 추가되도록)
		//2.단어검색 :voca.txt에서 한줄한줄씩 입력와서  /를 기준으로 쪼개서 비교(반복) 단어를 넣으면 ---> 단어뜻이 나올수 있도록
		//          만약에 없는 단어이면, "찾는단어 없습니다."출력

		int num;
		String text;
		boolean flag =false;
		File f = new File("voca.txt");
		
		FileWriter fw =new FileWriter("voca.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner (System.in);
		

		
		
		while(true) {
			System.out.print("1.단어입력  2.단어검색  3.종료>> ");
			num = sc.nextInt();

			switch(num) {
			case 1 : 
				System.out.print("단어/뜻 입력>> ");
					text = br.readLine();
					bw.write(text);
					bw.newLine();
				break;

			case 2 :
				Scanner sc2 = new Scanner (f);
				System.out.print("검색할 단어 입력>> ");
				text = br.readLine();
				System.out.println("단어>> " +text);
				
				while( sc2.hasNext() ) {
					flag = false;
					String str = sc2.next();    //☆★<2>
					String[] word = str.split("/");
					
					
					if(word[0].equals(text)) {
						System.out.println("단어의 뜻>> "+word[1]);
						flag=true;
						sc2.close();          //☆★<1>찾았으면 닫고 다시 객체형성 (그래야 다시첫줄부터 스캔시작 가능)
						break;
					}//if
				}//while
//				System.out.println(flag);
				if(flag==false) {
					System.out.println("찾는 단어 없음");
				}
				break;

			case 3 :
				System.out.println("프로그램을 종료합니다.");
				bw.close();
				br.close();
				System.exit(0);
				break;

			default :
				System.out.println("1~3번 사이의 숫자를 입력하세요.");
				break;

			}


		}//while










	}

}
