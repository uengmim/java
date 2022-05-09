import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); // MyPanel 패널을 컨텐트팬으로 사용
		
		setSize(500,500);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { // 패널에 도형을 그린다.
			super.paintComponent(g); // JPanel의 paintComponent() 호출
			for(int i=0; i<4; i++)
			{
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(i*60+10,10,50,50); // (10,10) 위치에 50x50 크기의 사각형 그리기
			
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