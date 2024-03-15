package com.TrueSpot.ts2.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TrueSpot.ts2.dto.AttachDto;

@Repository
public class AttachDaoImpl implements AttachDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int sequence() {
		return sqlSession.selectOne("attach.sequence");
	}
	
	@Override
	public void insert(AttachDto attachDto) {
		sqlSession.insert("attach.add", attachDto);
	}
	
	@Override
	public AttachDto selectOne(int attachNo) {
		return sqlSession.selectOne("attach.find", attachNo);
	}

	@Override
	public boolean delete(int attachNo) {
		return sqlSession.delete("attach.delete",attachNo) > 0;
	}
}
