package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from user where id = 15");

		System.out.println("User Deleted successfully.. " + i);
	}


}
