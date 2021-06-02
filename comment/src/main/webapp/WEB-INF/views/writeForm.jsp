<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>쓰기 페이지</p>
	
	<form action="./write.chain" method=post>	
		<input name="content" type="text" placeholder="커멘트 200자 이하입니다." />&nbsp;&nbsp;
		<input type="submit" value="쓰기" />
	</form>
</body>
</html>