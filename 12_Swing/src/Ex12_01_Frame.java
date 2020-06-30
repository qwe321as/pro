import java.awt.Frame;

public class Ex12_01_Frame {
	public static void main(String[] args) {

		Frame f = new Frame("제목자리");
		
		f.setTitle("첫번째 frame");
		f.setSize(400,300); 
		f.setVisible(true);
		f.setLocation(100, 200);
	}

}
