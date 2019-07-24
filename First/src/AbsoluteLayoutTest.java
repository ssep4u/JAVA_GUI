

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayoutTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//TODO: 창 내용 배치
		JButton temp;
		for(int i = 0; i < 10;i++) {
			temp = new JButton("Button"+i);
			temp.setBounds(50*i, 30*i, 100, 100);
			panel.add(temp);
		}

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}






