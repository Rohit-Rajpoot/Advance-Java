package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteUser {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
		PreparedStatement ps = c.prepareStatement("delete from user where id = ?");
		
		ps.setInt(1,11);
		
		int i = ps.executeUpdate();
		
        if(i == 0) {
			
			System.out.println("Record Not Found");
		}
		else {
			System.out.println("Data Updated Successfully : " + i);
		}
		
	}

}
