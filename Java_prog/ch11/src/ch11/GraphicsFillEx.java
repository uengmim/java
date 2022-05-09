package ch11;

import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	public GraphicsFillEx() {
		setTitle("fillXXX 사용  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(550, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.setColor(Color.BLUE);
			//g.fillRect(100,100,50,50); // 빨간색 사각형 칠하기
			g.setColor(new Color(0,128,255));
			g.fillOval(100,100,300,300);
			g.setColor(Color.WHITE);
			g.fillOval(125,180,250,220);
			g.setColor(Color.WHITE);
			g.fillOval(180,150,50,80);
			g.setColor(Color.WHITE);
			g.fillOval(270,150,50,80);
			g.setColor(Color.BLACK);
			g.drawOval(180,150,50,80);
			g.setColor(Color.BLACK);
			g.drawOval(270,150,50,80);
			g.setColor(Color.BLACK);
			g.fillOval(280,190,15,15);
			g.setColor(Color.BLACK);
			g.fillOval(205,190,15,15);
			g.setColor(Color.BLACK);
			g.drawLine(250,250,250,350);
			g.setColor(Color.BLACK);
			g.drawLine(100,180,180,250);
			g.setColor(Color.BLACK);
			g.drawLine(80,270,180,270);
			g.setColor(Color.BLACK);
			g.drawLine(100,330,180,290);
			g.setColor(Color.BLACK);
			g.drawLine(400,180,320,250);
			g.setColor(Color.BLACK);
			g.drawLine(410,270,320,270);
			g.setColor(Color.BLACK);
			g.drawLine(400,330,320,290);
			g.setColor(Color.RED);
			g.fillOval(230,230,40,40);
			g.setColor(Color.WHITE);
			g.fillOval(250,240,10,10);
			g.setColor(new Color(242,43,32));
			g.fillArc(150, 240, 200, 150, 180, 180);
			g.setColor(new Color(247,114,106));
			g.fillArc(190,340,120,50,90,360);
			
			//g.setColor(new Color(170,190,220));
			//int []x ={30,10,30,60};
			//int []y ={250,275,300,275};
			//g.fillPolygon(x, y, 4);	// 오렌지색 다각형 칠하기		
		}
	}
	
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
} 