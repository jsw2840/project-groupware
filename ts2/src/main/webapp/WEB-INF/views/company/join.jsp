<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>ȸ�� ����</h2>

<form action="join" method="post" autocomplete="off">
 ���̵�* <input type="text" name="comId" required><br><br>
 ��й�ȣ* <input type="password" name="comPw" required><br><br>
 ȸ���* <input type="text" name="comName" required><br><br>
 �ּ�<br>
 <input type="text" name="comPost" placeholder="�����ȣ" size="6" maxlength="6"><br><br>
 <input type="text" name="comAddr1" placeholder="�⺻�ּ�"><br><br>
 <input type="text" name="comAddr2" placeholder="���ּ�"><br><br>
 ��ȭ��ȣ <input type="tel" name="comTel"><br><br>
 ����ڹ�ȣ* <input type="text" name="comBs"><br><br>
 ���� <input type="text" name="comRegion"><br><br>
 �̸���<input type="email" name="comEmail"><br><br>
 <button type="submit"> �����ϱ�</button>
</form>