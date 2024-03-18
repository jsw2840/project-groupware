package com.TrueSpot.ts2.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TrueSpot.ts2.dto.AttachDto;
import com.TrueSpot.ts2.dto.CompanyDto;
import com.TrueSpot.ts2.vo.PaginationVO;
@Repository
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(CompanyDto companyDto) {
		sqlSession.insert("company.insert",companyDto);
		
	}

	@Override
	public CompanyDto selectOne(String comName) {
		return sqlSession.selectOne("company.find",comName);
	}

	@Override
	public boolean update(CompanyDto companyDto) {
		return sqlSession.update("company.update",companyDto)>0;
	}

	@Override
	public boolean delete(String comId) {
		return sqlSession.delete("company.delete",comId)>0;
	}

	@Override
	public List<CompanyDto> selectListByPage(PaginationVO vo) {
		return sqlSession.selectOne("company.selectListByPage",vo);
	}

	@Override
	public int countList(PaginationVO vo) {
		return sqlSession.selectOne("company.countList",vo);
	}

	@Override
	public void connect(String comId, int attachNo) {
		Map<String,Object> params = new HashMap<>();
		params.put("comId",comId);
		params.put("attachNo", attachNo);
		sqlSession.update("company.connect",params);
	}

	@Override
	public boolean deleteImage(String comId) {
		return sqlSession.delete("company.deleteImage",comId)>0;
	}

	@Override
	public AttachDto findImage(String comId) {
		return sqlSession.selectOne("company.findImage",comId);
	}

}
