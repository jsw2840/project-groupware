package com.TrueSpot.ts2.dao;

import java.util.List;

import com.TrueSpot.ts2.dto.CompanyDto;
import com.TrueSpot.ts2.vo.PaginationVO;

public interface CompanyDao {
 void insert(CompanyDto companyDto);//회원가입
 CompanyDto selectOne(String comName);//회사명으로 조회
 boolean edit(String comId);//회사아이디로 정보변경 
 boolean delete(String comId);//회원아이디로 삭제
 
//페이지네이션
	List<CompanyDto> selectListByPage(PaginationVO vo);//페이지네이션
	int countList(PaginationVO vo);//페이지네이션 카운트
}
