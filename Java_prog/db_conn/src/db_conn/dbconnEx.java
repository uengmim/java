package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnEx {

	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String user="root";
			String password="kbc0924";
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̹� ã��");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			String sql = "insert into student(id, name, dept) values('yunghee','�迵��','�������а�')";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ��ã��");
		} catch (SQLException e) {
			System.out.println("Connection ����");
		}
	}

}
