
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.*;

public class MenuItemActionListener  extends JFrame {
	private JTextArea ta = new JTextArea();
	
	public MenuItemActionListener() {
		super("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(ta));
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenu fileMenu = new JMenu("����");
		JMenuItem save = new JMenuItem("����");
		fileMenu.add(save);
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta.getText().length() == 0) {
					JOptionPane.showMessageDialog(MenuItemActionListener.this, 
							"�Էµ� ������ �����ϴ�.",
							"Warning", JOptionPane.WARNING_MESSAGE);
					return;
				}
				String fileName = JOptionPane.showInputDialog(MenuItemActionListener.this, 
						"������ ���ϸ��� �Է��ϼ���");
				if(fileName == null) {
					JOptionPane.showMessageDialog(MenuItemActionListener.this,
							"������ �������� �ʽ��ϴ�.",
							"Warning", JOptionPane.WARNING_MESSAGE);
					return;					
				}
				try {
					FileWriter fout = new FileWriter(fileName); // ���� ��Ʈ�� ����
					String t = ta.getText(); // �Էµ� �ؽ�Ʈ�� ���ڿ��� ����
					StringTokenizer st = new StringTokenizer(ta.getText(), "\n"); // ���� ������ �и�
					while(st.hasMoreTokens()) {
						fout.write(st.nextToken()); // �� ���� ����
						fout.write("\r\n"); // ���� ���� ���� �ٷ� �Ѿ�� ���� ����
					}
					fout.close(); // ���� ��Ʈ�� �ݱ�
				} catch (IOException e1) {}
			}
		});
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		setJMenuBar(mb);		
	}
	
	public static void main(String[] args) {
		new MenuItemActionListener();

	}

}
