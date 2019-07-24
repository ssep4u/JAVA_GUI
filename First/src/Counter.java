import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Counter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		Dimension dim = new Dimension(500, 300);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		double windowsWidth = res.getWidth();
		double widnowsHeight = res.getHeight();
		frame.setPreferredSize(dim);
//		frame.setLocation(200,100);
		frame.setLocation(((int)windowsWidth-500)/2, ((int)widnowsHeight-300)/2);

		JPanel panel = new JPanel();
		JLabel lbId = new JLabel("아이디 : ");
		JTextField tfId = new JTextField(20);
		JLabel lbPassword = new JLabel("password : ");
		JTextField tfPassword = new JTextField(20);
		JLabel lbGender = new JLabel("성별 : ");
		JRadioButton rbFemale = new JRadioButton("여자");
		JRadioButton rbMale = new JRadioButton("남자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbFemale);
		bg.add(rbMale);
		JLabel lbMeal = new JLabel("식사 : ");
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		JLabel lbEdu = new JLabel("학력 : ");
		String[] edu = {"초졸", "중졸"};
		JComboBox<String> cxEdu = new JComboBox<>(edu);
		cxEdu.addItem("고졸");
		JButton bts = new JButton("알미~");
		ImageIcon ii = new ImageIcon("src/images/signup.JPG");
		ImageIcon ii작은 = new ImageIcon(ii.getImage().getScaledInstance(324/8, 304/8, Image.SCALE_DEFAULT));
		JLabel lbSignup = new JLabel(ii작은);
		ImageIcon ii깐쇼새우 = new ImageIcon("src/images/깐쇼새우.jpg");
		ImageIcon ii작은깐쇼새우= new ImageIcon(
				ii깐쇼새우.getImage().getScaledInstance(930/4, 647/4, Image.SCALE_DEFAULT));
		JButton bt깐쇼새우 = new JButton(ii작은깐쇼새우);
		
		panel.add(lbId);
		panel.add(tfId);
		panel.add(lbPassword);
		panel.add(tfPassword);
		panel.add(lbGender);
		panel.add(rbFemale);
		panel.add(rbMale);
		panel.add(lbMeal);
		panel.add(cbChicken);
		panel.add(cbPizza);
		panel.add(lbEdu);
		panel.add(cxEdu);
		panel.add(bts);
		panel.add(lbSignup);
		panel.add(bt깐쇼새우);
		

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}












