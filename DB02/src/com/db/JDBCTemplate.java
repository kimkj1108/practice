package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//중복되는 코드를 하나로 모았다.
public class JDBCTemplate {
	
	public static Connection getConnection() {
		//1.driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "kh";
		String pw = "kh1";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
