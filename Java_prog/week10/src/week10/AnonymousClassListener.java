package week10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{

	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("치킨");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getText());
				if(b.getText().equals("먹고싶다"))
					b.setText("치킨");
				else
					b.setText("먹고싶다");
				
				
			}
		});

		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
