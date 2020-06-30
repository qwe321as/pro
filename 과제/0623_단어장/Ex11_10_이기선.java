import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex11_10_이기선 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String iStr = "";
		String fileName = "";
		int sel = 0;
		int iCnt=0;
		boolean keepGoing=true;
		boolean appendON = true;
		boolean appendOFF = false;
		boolean wordFind = false;
		String word ="";
		String meaning ="";
		String queryStr = "";
		String vocaStr = "";
		FileWriter fw = null;
		FileReader fr = null ;
		BufferedReader br = null ; 
		Scanner sc = null ; 
		BufferedWriter bw1 = null;
		BufferedReader br1 = null;
		System.out.print("Input your Vocablary Book name : ");
		br= new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		sc=new Scanner(System.in);
//		fileName = sc.next();
		try {
			fileName = br.readLine();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
//		br.close();
		
//		try {
//			fw = new FileWriter(fileName,true);
//			fr = new FileReader(fileName);
//			fw.close();
//			fr.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		do {
			System.out.print("Choice Your work 1.단어입력  2.단어검색  3.종료");
//			sel = sc.nextInt(); //br.read
			try {
				iStr = br.readLine();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			sel = (int) (iStr.charAt(0)-'0');
			System.out.println("sel : "+sel);
			if(sel !=1 && sel !=2 && sel !=3) {
				System.out.println("선택오류");
				continue;
			}
//			br= new BufferedReader(new InputStreamReader(System.in));
			
			switch (sel) {
			case 1 :   // 1. 단어입력
				System.out.print("Input your Vocablary like Word/Meaning : ");
				try {
					iStr = br.readLine();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					fw = new FileWriter(fileName,true);
					bw1 = new BufferedWriter(fw);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Input String : "+iStr);
				try {
					bw1.write(iStr+"\n");
					bw1.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					bw1.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Write success "+iStr);
				break;
			case 2 :  // word Search
				System.out.print("Input your word which you want to fine : ");
				try {
					queryStr = br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 단어장 open
				try {
//					File f1 = new File(fileName);
					System.out.println(" error 1001 : "+fileName);
					fr=new FileReader(fileName);					
					br1 = new BufferedReader(fr);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wordFind = false;
				
				do {
					try {
						vocaStr = br1.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(vocaStr.startsWith(queryStr)) {
						word = queryStr ;
						meaning = vocaStr.substring(queryStr.length()+1, vocaStr.length());
						System.out.println("Word : "+word+"   Meaning : "+meaning);
						wordFind = true;
					} else {
						continue;
					}
				}while(!wordFind && vocaStr!=null);
				if(wordFind == false) {
					System.out.println("찾는 단어가 없습니다.");
				}
				try {
					br1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 : // 3.종료
				System.out.println("종료  GoodBye!");
				keepGoing = false;
				break;
			default :
				break;
			}
			
			
		} while(keepGoing);
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


//1. 파일에 단어 입력
//2. 해당하는 뜻입력
//3. 1. 단어입력  2. 단어 검색  3. 종료
