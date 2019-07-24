import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderLayoutTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		JPanel panel = new JPanel();
		BorderLayout bl = new BorderLayout();
		panel.setLayout(bl);
		//TODO: 창 내용 배치
		JButton btN = new JButton("North");
		JButton btW = new JButton("West");
		JButton btC = new JButton("Center");
		JButton btE = new JButton("East");
		JButton btS = new JButton("South");
		
		panel.add(btN, BorderLayout.NORTH);
		panel.add(btW, BorderLayout.WEST);
		panel.add(btC, BorderLayout.CENTER);
		panel.add(btE, BorderLayout.EAST);
		panel.add(btS, BorderLayout.SOUTH);
		

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}











