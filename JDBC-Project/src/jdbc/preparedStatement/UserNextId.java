package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserNextId {
	
	public static int nextId() throws Exception {
		
		int id = 0 ;
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
		PreparedStatement ps = c.prepareStatement("select max(id) from user");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			id = rs.getInt(1);
			
			System.out.println("Max Id : " + id);
		}
		return id + 1;
	} 

}
