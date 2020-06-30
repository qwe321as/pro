import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex12_08_image extends JFrame{

	JRadioButton[] radio = new JRadioButton[3];
	String[] fruit = {"사과","배","체리"};
	
	JLabel imageLabel = new JLabel();
	
	ImageIcon[] image = {
						new ImageIcon("images/apple.jpg"),
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg")
						};
	
	Ex12_08_image(){
		
		Container contentPane = getContentPane();
		// BorderLayout
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
//		JRadioButton r1 = new JRadioButton();
//		JRadioButton r2 = new JRadioButton();
//		JRadioButton r3 = new JRadioButton();
		
		ButtonGroup group = new ButtonGroup();
		for(int i=0;i<radio.length;i++) {
			radio[i] = new JRadioButton(fruit[i]);
			group.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new ImageItemEvent());
		}
		
		contentPane.add(radioPanel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		
		radio[0].setSelected(true);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(350,400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // 생성자
	
	class ImageItemEvent implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			}
			else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			}
			else {
				imageLabel.setIcon(image[2]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new Ex12_08_image();
	}

} // Ex12_08_image


