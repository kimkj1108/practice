package com.dao;

import static com.db.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.HomeDto;

//Dao : Data Access Objdct, DB와 연결하는 코드만 작성
public class HomeDao {

	// 리스트 출력
	public List<HomeDto> selectList() {

		// 1. driver연결
		// 2. 계정연결
		Connection con = getConnection();

		// 3. Query준비
		String sql = " SELECT H_NUM, H_NAME, H_JOB " + " FROM HOME " + " ORDER BY H_NUM DESC ";
		Statement stmt = null;
		ResultSet rs = null;
		List<HomeDto> list = new ArrayList<HomeDto>();

		try {
			stmt = con.createStatement();

			// 4. Query 실행 및 리턴
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				HomeDto dto = new HomeDto();
				dto.setH_num(rs.getInt(1));
				dto.setH_name(rs.getString(2));
				dto.setH_job(rs.getString(3));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return list;

	}

	// 선택출력 : 번호기준으로 선택하여 출력한다.
	public HomeDto selectOne(int h_num) {
		Connection con = getConnection();

		String sql = " SELECT H_NUM, H_NAME, H_JOB " + " FROM HOME " + " WHERE H_NUM = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		HomeDto dto = null;

		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, h_num);

			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = new HomeDto();
				dto.setH_num(rs.getInt("H_NUM"));
				dto.setH_name(rs.getString("H_NAME"));
				dto.setH_job(rs.getString("H_JOB"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
			
		}

		return dto;
	}
	//추가
	public int insert(HomeDto dto) {
		//1.
		//2.
		Connection con = getConnection();
		
		//3.
		String sql = " INSERT INTO HOME "
				+ " VALUES";
		
		return 0;
	}
}
