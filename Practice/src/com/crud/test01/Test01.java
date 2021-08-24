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
		String sql = " SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO  "
				   + " FROM EMP ";//앞뒤 ""안에 문장안에 공백 무조건 넣어야 한다.쿼리문 안에 세미콜론 쓰면 안됨.
		Statement stmt = con.createStatement();
		//4. query 리턴 및 실행
		ResultSet rs = stmt.executeQuery(sql);
		//Result 객체 = 
		while(rs.next()) {
			System.out.printf("%2d %10s %10s %6d %10s %7.0f %7.2f %3d \n",
					rs.getInt("EMPNO"),//위에 작성한 컬럼 이름이나
					rs.getString(2),	//위에 작성한 컬럼 번호를 적는다.
					rs.getString("JOB"),
					rs.getInt(4),
					rs.getDate("HIREDATE"),
					rs.getDouble(6),
					rs.getDouble("COMM"),
					rs.getInt(8));
		}
		//5. db종료
		rs.close();
		stmt.close();
		con.close();
		
		
		
	}

}
