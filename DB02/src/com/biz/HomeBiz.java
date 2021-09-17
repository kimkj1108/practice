package com.biz;

import java.util.List;

//biz : Business Logic (연산, 처리)
import com.dao.HomeDao;
import com.dto.HomeDto;
public class HomeBiz {
	private HomeDao dao = new HomeDao();
	
	public List<HomeDto> selectList(){
		return dao.selectList();
	}
	public HomeDto selectOne(int h_num) {
		return dao.selectOne(h_num);
	}
	
	public int insert(HomeDto dto) {
		return dao.insert(dto);
	}
	public int update(HomeDto dto) {
		return dao.update(dto);
	}
	public int delete(int h_num) {
		return dao.delete(h_num);
	}
	
}
