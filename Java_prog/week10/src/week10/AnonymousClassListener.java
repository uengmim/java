package week10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{

	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("ġŲ");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getText());
				if(b.getText().equals("�԰�ʹ�"))
					b.setText("ġŲ");
				else
					b.setText("�԰�ʹ�");
				
				
			}
		});

		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
