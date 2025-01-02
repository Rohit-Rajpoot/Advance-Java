package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AutoUserIndex {
	
	public static void main(String[] args) throws Exception {
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		
		ps.setInt(1,UserNextId.nextId());
		ps.setString(2,"Ashsish");
		ps.setString(3,"Jain");
		ps.setString(4,"ashish@gmail.com");
		ps.setString(5,"Ashish4321");
		ps.setString(6,"Canada");
		ps.setDate(7, new java.sql.Date(1998,04,22));
		
		int i = ps.executeUpdate();
		
		System.out.println("Data Added Successfully : " + i);
		
	}

}
