<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./login.chain" method="post">
		<label for="id">ID: <input type="text" name="id" id="id"> </label>
		<label for="pass">PASS: <input type="text" name="pass" id="pass"></label>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
		<input type="button" value="회원가입">
	</form>
	
</body>
</html>