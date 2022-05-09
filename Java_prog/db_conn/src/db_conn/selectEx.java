package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectEx {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root","kbc0924"); 
			System.out.println("DB ���� �Ϸ�");
			stmt = conn.createStatement(); 
			ResultSet srs = stmt.executeQuery("select * from student"); 
			printData(srs, "id", "name", "dept");
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL �������");
		} 
		
	}

	private static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException {
		while (srs.next()) {
			if (!col1.equals(""))
				System.out.print(srs.getString("id")); 
			if (!col2.equals(""))
				System.out.print("\t|\t" + srs.getString("name"));
			if (!col3.equals(""))
				System.out.println("\t|\t" + srs.getString("dept"));
			else 
				System.out.println();
		}
	}
}
