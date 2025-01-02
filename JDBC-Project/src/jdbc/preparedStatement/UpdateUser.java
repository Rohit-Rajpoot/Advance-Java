package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateUser {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
		PreparedStatement ps = c.prepareStatement("update user set firstName = ?,lastName = ?,loginId = ?,password = ?,address = ?,dob = ? where id = ?");
		
		ps.setString(1,"Akriti");
		
        ps.setString(2,"Singh");
        
		ps.setString(3,"akriti11@gmail.com");
		
		ps.setString(4,"Akriti5555");
		
		ps.setString(5,"Noida");
		
		ps.setDate(6, new java.sql.Date(2000,11,02));
		
		ps.setInt(7, 17);
		
		int i = ps.executeUpdate();
		
		if(i == 0) {
			
			System.out.println("Record Not Found");
		}
		else {
			System.out.println("Data Updated Successfully : " + i);
		}
		
	}

}
