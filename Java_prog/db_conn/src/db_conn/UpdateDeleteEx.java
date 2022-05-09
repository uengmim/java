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
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			String sid = "apple";
			String sname = "사과";
			String sdept = "과일";
			System.out.println(stmt.toString());
			stmt.executeUpdate("insert into student(id, name, dept) values('" + sid + "' , '" + sname + "' , '" + sdept + "')");
			 printTable(stmt);
			//stmt.executeUpdate("update student set id='tamjung' where id='kdoil'"); //데이터 수정
			//printTable(stmt);
			//stmt.executeUpdate("delete from student where name='tamjung'"); // 레코드 삭제
			//printTable(stmt);
		
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류");
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
