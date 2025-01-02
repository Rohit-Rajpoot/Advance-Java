package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddUser {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		
		ps.setInt(1,16);
		ps.setString(2,"Naman");
		ps.setString(3,"Jain");
		ps.setString(4,"njain@gmail.com");
		ps.setString(5,"Naman4321");
		ps.setString(6,"Hyderabad");
		ps.setDate(7, new java.sql.Date(1999,06,22));
		
		int i = ps.executeUpdate();
		
		System.out.println("Data Added Successfully : " + i);
		
		

		
		
	}

}
