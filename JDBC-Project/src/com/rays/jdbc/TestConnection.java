package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
	
	public static void main(String[] args) throws Exception {
		
//		Step 1 : Load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Step 2 : Make connection to the Database
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		
//		Step 3 : Create Statement
		
		Statement s = c.createStatement();
		
//		Step 4 : Execute Query And Get ResultSet
		
		ResultSet r = s.executeQuery("select * from employee");
		
		while(r.next()) {
			
			System.out.print(r.getInt(1));
			System.out.print("\t" + r.getString(2));
			System.out.print("\t" + r.getString(3));
			System.out.print("\t" + r.getInt(4));
			System.out.print("\t" + r.getString(5));
			System.out.print("\t" + r.getString(6));
			System.out.println("\t" + r.getInt(7));
			
			
			
		}
	}

}
