package com.globallogic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public Connection getConnection() 
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "admin";
			String url = "jdbc:mysql://localhost:3306/frandzz";
			 con=DriverManager.getConnection(url,username,password);
					
		}
		catch(Exception e) {
			//TODO://handleexception
		}
		return con;
	}
}
