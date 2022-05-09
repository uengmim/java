package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteEx {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root","kbc0924");
			System.out.println("DB ���� �Ϸ�");
			stmt = conn.createStatement();
			String sid = "apple";
			String sname = "���";
			String sdept = "����";
			System.out.println(stmt.toString());
			stmt.executeUpdate("insert into student(id, name, dept) values('" + sid + "' , '" + sname + "' , '" + sdept + "')");
			 printTable(stmt);
			//stmt.executeUpdate("update student set id='tamjung' where id='kdoil'"); //������ ����
			//printTable(stmt);
			//stmt.executeUpdate("delete from student where name='tamjung'"); // ���ڵ� ����
			//printTable(stmt);
		
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
		}

	}

	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(srs.getString("id"));
			System.out.print("\t|\t" + srs.getString("name"));
			System.out.println("\t|\t" + srs.getString("dept"));
		}
	}
}
