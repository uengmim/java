package week12;
import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	public ButtonImageEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 3 ���� �̹����� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");		
		
		// 3���� �������� ���� ��ư ������Ʈ ����
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);// pressedIcon�� �̹��� ���
		btn.setRolloverIcon(rolloverIcon);// rolloverIcon�� �̹��� ���
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ButtonImageEx();
	}
}