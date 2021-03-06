package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Member {

	// 스캐너 객체 생성.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 선택, 수정, 삭제 기준은 "이름".
		while (true) {
			System.out.println("번호선택");
			System.out.println("1: 전체출력");
			System.out.println("2: 선택출력");
			System.out.println("3: 추가");
			System.out.println("4: 수정");
			System.out.println("5: 삭제");
			System.out.println("6: 종료");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("전체출력");
				selectList();
				break;
			case 2:
				System.out.println("선택출력");
				selectOne();
				break;
			case 3:
				System.out.println("추가");
				insert();
				break;
			case 4:
				System.out.println("수정");
				update();
				break;
			case 5:
				System.out.println("삭제");
				delete();
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
			}
		}
	}
	// 1. driver 연결
	// 2. 계정연결
	// 3. query준비
	// 4. query실행 및 리턴
	// 5. db 종료

	private static void delete() {
		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh1";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3. query준비
		System.out.println("삭제할 이름: ");
		String name = sc.next();
		String sql = " DELETE FROM MEMBER " + "	WHERE NAME = ? ";

		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			// 4. query실행 및 리턴
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. db 종료
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void update() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh1";
		Connection con = null;
		try {
			// Connection con = DriverManager.getConnection(url,user,pw);
			// 위처럼 만들면 con변수를 try외부에서 사용못하더라
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("수정할 이름");
		String name = sc.next();
		System.out.println("수정할 전번");
		String phone = sc.next();
		System.out.println("수정할 주소");
		String addr = sc.next();
		System.out.println("수정할 이멜");
		String email = sc.next();

		String sql = " UPDATE MEMBER " + " SET PHONE = ?, SET ADDR = ?, SET EMAIL = ? " + " WHERE NAME = ? ";
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, phone);
			pstm.setString(2, addr);
			pstm.setString(3, email);
			pstm.setString(4, name);

			int res = pstm.executeUpdate();// 해당 코드에 대해서도 찾아볼 필요가 있다.
			if (res > 0) {
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void insert() {
		// 1.driver연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh1";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3.query 준비
		System.out.println("입력할 이름: ");
		String name = sc.next();
		System.out.println("입력할 번호: ");
		String phone = sc.next();
		System.out.println("입력할 주소: ");
		String addr = sc.next();
		System.out.println("입력할 이멜: ");
		String email = sc.next();

		String sql = " INSERT INTO MEMBER " + " VALUES (?, ?, ?, ?) ";

		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, phone);
			pstm.setString(3, addr);
			pstm.setString(4, email);
			
			//4.query실행 및 리턴
			int res = pstm.executeUpdate();
			if(res>0) {
				System.out.println("추가성공");
			}else {
				System.out.println("추가실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			//5.db종료
		}
		finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void selectOne() {
		// 1.driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. 계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh1";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. query 준비
		System.out.println("선택출력할 이름 입력 : ");
		String name = sc.next();// 이름기준검색
		String sql = " SELECT NAME, PHONE, ADDR, EMAIL " + " FROM MEMBER " + " WHERE NAME = ? ";
		PreparedStatement pstm = null;
		ResultSet rs = null;// ResultSet을 왜 써야 하는지 기억이 나지 않는다.
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);

			// 4.query실행 및 리턴
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("NAME") + " \t " + rs.getString("PHONE") + " \t " + rs.getString("ADDR")
						+ " \t " + rs.getString("EMAIL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			// 5.db종료
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void selectList() {
		// 1.
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				// 2.
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "kh";
				String password = "kh1";
				Connection con = null;
				
				try {
					con = DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				// 3.
				String sql = " SELECT NAME, PHONE, ADDR, EMAIL FROM MEMBER ORDER BY NAME ";
				
				Statement stmt = null;
				//Statement stmt = con.CreateStatement();
				//위 값은 기본값인 null로 해놓고 
				//try안에서 한번 더 재정의 했다.
				ResultSet rs = null;
				
				try {
					stmt = con.createStatement();
					
					// 4.
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getString(1) + " \t " 
										 + rs.getString(2) + " \t " 
										 + rs.getString(3) + " \t "
										 + rs.getString(4));
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					// 5.
					try {
						rs.close();
						stmt.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
	
			}
}
