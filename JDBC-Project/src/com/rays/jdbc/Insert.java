package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	
	public static void main(String[] args) throws Exception {
		
//		Step 1 : Load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Step 2 : Make connection to the Database
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		
//		Step 3 : Create Statement
		
		Statement s = c.createStatement();
		
		int i = s.executeUpdate(" insert into employee values(9,'Rahul','Patel',31,'Pune','Cognigant',45000,7 )");
		
		System.out.println("Data Addition Successful : " + i);
		

	}

}
