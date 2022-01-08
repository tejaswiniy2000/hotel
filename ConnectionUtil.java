package com.cognizant.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	
	private static String url="jdbc:mysql://localhost:3306/hotel";
	private static String user="root";
	private static String password="teja@1234";
	
	public static Connection getConnection() {
		
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
