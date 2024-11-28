package com.lti.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc92_ScollableResultSet {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1522/XE";	// orcl or XE or OSE		
		
		Connection  conn=DriverManager.getConnection(url,"..........","............");		
		if (conn != null) 
		{
			System.out.println("Connected");
			//conn.close();
		}
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select prdid from Products");
		
		System.out.println(rs.next());		
		 System.out.println(rs.getInt("prdid"));
		 
		System.out.println(rs.relative(2));
		 System.out.println(rs.getInt("prdid"));
		 
		System.out.println(rs.relative(-2));
		 System.out.println(rs.getInt("prdid"));
		 
		System.out.println(rs.relative(4));
		 System.out.println(rs.getInt("prdid"));

		/*
		 * System.out.println(rs.absolute(-1)); // moves to the last row
		 * System.out.println(rs.getInt("prdid"));
		 * 
		 * System.out.println(rs.absolute(2)); System.out.println(rs.getInt("prdid"));
		 * System.out.println(rs.absolute(0)); System.out.println(rs.absolute(5));
		 * System.out.println(rs.getInt("prdid"));
		 */

		conn.close();
	}

}
