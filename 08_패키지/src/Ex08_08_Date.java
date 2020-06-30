import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_08_Date {
	public static void main(String[] args) {

		Date now = new Date();
//		Date now = new Date(120,5,17);
//		Date now = new Date("2020/6/17");
		System.out.println(now); 
		System.out.println(now.toString()); // 참조변수 == 참조변수.toString()
		
		System.out.println(now.getMonth());
		System.out.println(now.getDay()); // 3
		System.out.println(now.getDate());
		System.out.println(now.getMinutes());
		
		SimpleDateFormat sdf1,sdf2,sdf3;
		
		sdf1 = new SimpleDateFormat("YY-MM-d일 E요일");
		System.out.println(sdf1.format(now));
		
		sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		System.out.println(sdf2.format(now));
		
		sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 h:m:s a");
		System.out.println(sdf3.format(now));
				
	}
}










