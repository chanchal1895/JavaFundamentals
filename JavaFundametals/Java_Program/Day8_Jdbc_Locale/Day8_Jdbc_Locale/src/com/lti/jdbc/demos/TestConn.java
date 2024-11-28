package com.lti.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {
	
	public static void main(String[] args) throws SQLException  {
		
		//String url = "jdbc:oracle:thin:@localhost:1521/XE";	// orcl or XE or OSE	
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE";	// orcl or XE or OSE		
		
		Connection  conn=DriverManager.getConnection(url,"....",".....");		
		if (conn != null) 
		{
			System.out.println("Connected");
			conn.close();
		}	
		
	}

}
