package week9;
import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		super("GridLayout ±¸±¸´Ü");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(10,10));
		
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
			String text = Integer.toString((i)*(j));
			JButton button = new JButton(text);
			contentPane.add(button);
			}
		}
		
		setSize(800, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
