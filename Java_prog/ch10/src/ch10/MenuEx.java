package ch10;

import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu �����  ����");
		createMenu(); // �޴��� �����Ͽ� �����ӿ� ����
		setSize(250,200);
		setVisible(true);
	}
	
	// �޴��� ����� �����ӿ� �����Ѵ�.
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); // �޴��� ����
		JMenu screenMenu = new JMenu("Screen"); // Screen �޴� ����
		JMenu editMenu = new JMenu("Edit"); // Edit �޴� ����

		// Screen �޴��� �޴������� ���� ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); // �и��� ����
		screenMenu.add(new JMenuItem("Exit"));
		
		editMenu.add(new JMenuItem("copy"));
		editMenu.add(new JMenuItem("cut"));
		editMenu.add(new JMenuItem("paste"));
		editMenu.add(new JMenuItem("delete"));

		// �޴��ٿ� �޴� ����
		mb.add(screenMenu); // Screen �޴� ����
		mb.add(editMenu); // Edit �޴� ���� ����
		mb.add(new JMenu("Source")); // Source �޴� ���� ����
		mb.add(new JMenu("Project")); // Project �޴� ���� ����
		mb.add(new JMenu("Run")); // Run �޴� ���� ����

		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}
	
	public static void main(String [] args) {
		new MenuEx();
	}
}