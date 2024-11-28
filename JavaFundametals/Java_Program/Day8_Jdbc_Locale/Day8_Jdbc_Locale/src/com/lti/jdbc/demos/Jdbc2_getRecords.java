package com.lti.jdbc.demos;
//on command prompt >lsnrctl status - u can see port no  > not at SQL>

//select value from v$parameter where name='service_names';

//1.services are up 
//2.TNS Listener service is up 
//3. change the port number - std 1521 
//4. check what is your service name - ose XE orcl 
//5. Command prompt >lsnrctl status  ( not on sql prompt) 
//6. conn.close(); inside if 
////For LTI Systems  - 
//String url = "jdbc:oracle:thin:@localhost:1521/orcl.lntinfotech.com" // not orcl

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc2_getRecords {
	public static void main(String[] args) throws SQLException {
		
		//For LTI Systems  - 
		//String url = "jdbc:oracle:thin:@localhost:1521/orcl.lntinfotech.com" // not orcl
		
		String url = "jdbc:oracle:thin:@localhost:1521/XE";	// orcl or XE or OSE		
		
		Connection  conn=DriverManager.getConnection(url,"..........","...........");		
		if (conn != null) 
		{
			System.out.println("Connected");
			//conn.close();
		}
		
		try
		{
			Statement stmt = conn.createStatement();	
			
			ResultSet rs = stmt.executeQuery("Select * from Products where prdid=1112");
				
			while (rs.next()) 
			{
				int id = rs.getInt(1);// rs.getInt("PrdId");can specify column name
				String name = rs.getString("PRDNAME");
				float cost = rs.getFloat("PRDCOST");
				
			System.out.println("\t" + id + "  " + name + "\t" + cost + "\n");
			}
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		} 
		finally 
		{
		
			
			conn.close();
		}
	}
}
//String url = "jdbc:oracle:thin:scott@//localhost:1521/pdborcl";
	//	String url = "jdbc:oracle:thin:@localhost:1522:XE";	// orcl or XE 	
	//	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		//String url = "jdbc:sqlserver://localhost:1433;databaseName=TSQL2012";
		
/*
//oracle 

CREATE TABLE Products(
	prdId Number(4) PRIMARY KEY,
	prdName VARCHAR(20) NOT NULL,
	prdCost Number(7,2) not null
	);

INSERT INTO Products VALUES(1111,'Mobile',20000);
INSERT INTO Products VALUES(1112,'Battery',1000);
INSERT INTO Products VALUES(1113,'ScreenGuard',300);
commit;
*/
