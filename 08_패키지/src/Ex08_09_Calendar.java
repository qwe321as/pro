import java.util.Calendar;

public class Ex08_09_Calendar {
	public static void main(String[] args) {

//		Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("cal:"+cal);
		System.out.print("���� ��¥�� " + cal.get(Calendar.YEAR)+"��");
		System.out.print(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"����");
		String[] week = {"","��","��","ȭ","��","��","��","��"};
		
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"����");
		
	}
}




