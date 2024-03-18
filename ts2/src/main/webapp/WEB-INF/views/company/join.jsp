<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>회사 가입</h2>

<form action="join" method="post" autocomplete="off">
 아이디* <input type="text" name="comId" required><br><br>
 비밀번호* <input type="password" name="comPw" required><br><br>
 회사명* <input type="text" name="comName" required><br><br>
 주소<br>
 <input type="text" name="comPost" placeholder="우편번호" size="6" maxlength="6"><br><br>
 <input type="text" name="comAddr1" placeholder="기본주소"><br><br>
 <input type="text" name="comAddr2" placeholder="상세주소"><br><br>
 전화번호 <input type="tel" name="comTel"><br><br>
 사업자번호* <input type="text" name="comBs"><br><br>
 지역 <input type="text" name="comRegion"><br><br>
 이메일<input type="email" name="comEmail"><br><br>
 <button type="submit"> 가입하기</button>
</form>