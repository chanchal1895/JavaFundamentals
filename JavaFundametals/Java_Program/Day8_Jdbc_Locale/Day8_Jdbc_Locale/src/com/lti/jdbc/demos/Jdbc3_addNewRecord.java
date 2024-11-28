package com.lti.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//execute and executeUpdate

public class Jdbc3_addNewRecord {
	public static void main(String[] args) throws SQLException {
String url = "jdbc:oracle:thin:@localhost:1521/XE";	// orcl or XE or OSE		
		Statement stmt;
		Connection  conn=DriverManager.getConnection(url,".....",".....");		
		
		//executeQuery 
		
		 try
		 {
		stmt= conn.createStatement();
		int i = stmt.executeUpdate("Insert into PRODUCTS values(108,'Screen',500)");
		System.out.println("record inserted : "+i);
		 }
		 catch(SQLException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 finally
			{
				try
				{	
				conn.close();}
				catch(Exception e)
				{System.out.println(e);}
			}
		
	}
	 
}
/*
String ddl1="drop table test";
//	String ddl2="create table student(rollno int,sname varchar(20),div varchar(5),percent numeric(4,2))";
	stmt.execute(ddl1);
	 System.out.println("table droped  ");*/