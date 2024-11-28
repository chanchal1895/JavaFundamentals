package com.lti.jdbc.demos;
///statement : For running static queries which do not placeholder(?,&).
//preparedStatement :Extended from statement interface.It offers all features statement plus works with pre-compiled quries .
//CallableStatement : extended from preparedStatement -It can call procedure and function


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//executeUpdate and prepared statement 
public class Jdbc3_PreparedStmt {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521/XE";	// orcl or XE or OSE		
		
		Connection  conn=DriverManager.getConnection(url,"....",".....");		
		if (conn != null) 
		{
			System.out.println("Connected");
			//conn.close();
		}
	
			PreparedStatement pstmt = conn.prepareStatement("Insert into products values(?,?,?)");

			System.out.println("enter product details");
			
			pstmt.setInt(1,112);
			pstmt.setString(2,"abc"); // not 'charger'
			
			pstmt.setDouble(3, 89.90);

		
			int i = pstmt.executeUpdate();
			System.out.println(i + "record added ");
			
		



	}

}
