package com.TrueSpot.ts2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TrueSpot.ts2.dto.CompanyDto;
import com.TrueSpot.ts2.vo.PaginationVO;
@Repository
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(CompanyDto companyDto) {
		sqlSession.insert("com.join",companyDto);
		
	}

	@Override
	public CompanyDto selectOne(String comName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean edit(String comId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String comId) {
		return sqlSession.delete("com.delete",comId)>0;
	}

	@Override
	public List<CompanyDto> selectListByPage(PaginationVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countList(PaginationVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
