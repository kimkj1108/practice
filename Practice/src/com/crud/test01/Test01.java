package com.crud.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. dirver 연결 (ojdbc6.jar!)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "kh";
		String password = "kh";
		
		//자바와 db가 연결되는 통로.
		Connection con = DriverManager.getConnection(url, user, password);
					
		//3. query 준비
		String sql = "";
		Statement stmt = con.createStatement();
		//4. query 리턴 및 실행
		ResultSet rs = stmt.executeQuery(sql);
		//Result 객체 = 
		while(rs.next()) {
			System.out.printf();
		}
		
		
		
	}

}
