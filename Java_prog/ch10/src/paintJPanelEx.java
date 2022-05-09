import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		setTitle("JPanel�� paintComponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); // MyPanel �г��� ����Ʈ������ ���
		
		setSize(500,500);
		setVisible(true);
	}

	// JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { // �гο� ������ �׸���.
			super.paintComponent(g); // JPanel�� paintComponent() ȣ��
			for(int i=0; i<4; i++)
			{
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawRect(i*60+10,10,50,50); // (10,10) ��ġ�� 50x50 ũ���� �簢�� �׸���
			
			g.setColor(Color.PINK); 
			g.drawRect(i*60+10,70,50,50); 
			
			g.setColor(Color.BLACK); 
			g.drawRect(i*60+10,130,50,50); 
			
			g.setColor(Color.GREEN); 
			g.drawRect(i*60+10,190,50,50); 
			
			g.setColor(Color.RED); 
			g.drawRect(i*60+10,250,50,50); 

			}
		}	
	}
	
	public static void main(String [] args) {
		new paintJPanelEx();
	}
} 