package com.TrueSpot.ts2.dao;

import java.util.List;

import com.TrueSpot.ts2.dto.AttachDto;
import com.TrueSpot.ts2.dto.CompanyDto;
import com.TrueSpot.ts2.vo.PaginationVO;

public interface CompanyDao {
 void insert(CompanyDto companyDto);//회원가입
 CompanyDto selectOne(String comName);//회사명으로 조회
 boolean update(CompanyDto companyDto);//회사정보변경 
 boolean delete(String comId);//회원아이디로 삭제
 
//페이지네이션
 List<CompanyDto> selectListByPage(PaginationVO vo);//페이지네이션
 int countList(PaginationVO vo);//페이지네이션 카운트
 
 //이미지
 void connect(String comId,int attachNo);
 boolean deleteImage(String comId);
 AttachDto findImage(String comId);
}
