<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<script>
		function login(){
			location.href="./login.chain"
		}
	</script>
</head>
<body>
	<h1>커멘트 게시판 입니다.</h1>
	
	<P>  즐겁게 코딩 합시다!!. </P>
	
	<form action="./list.chain" method=get>
		<input type="submit" value="제출하기"/>
		<c:if test="${id==null}">
		<input type="button" value="로그인 하기" onclick=login() />
		</c:if>
		<button>제출하기, form 밖에서는 그냥 버튼</button>
	</form>
	<c:if test="${id != null}">
		<%@include file="loginOK.jsp" %>
	</c:if>
</body>
</html>
