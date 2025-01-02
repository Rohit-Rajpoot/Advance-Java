package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate(
				"insert into user values(15, 'Demo', 'Demo', 'demo@gmail.com', 'demo123', 'Indore', '2001-02-02')");

		System.out.println("User added successfully.. " + i);
	}


}
