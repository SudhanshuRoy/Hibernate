package com.sudhanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/web20sb101db";
		try(Connection conn=DriverManager.getConnection(url,"root","*#Mysql09")) {
//			PreparedStatement ps=conn.prepareStatement("")
			System.out.println(conn);

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
