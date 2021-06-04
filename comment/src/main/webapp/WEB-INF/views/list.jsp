<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		function CommWrite(){
			location.href="./write.chain" // 브라우저에게 주소 요청을 한다.
		}
	</script>
</head>
<body>
	<center>
		<h1>여기는 리스트 페이지!!</h1>
		<p> ㅎㅎㅎㅎ 안녕하세용 </p>
		<br>
		<div>
			<c:forEach items="${list}" var="comment">
			${comment.commentnum}&nbsp&nbsp${comment.id}&nbsp&nbsp${comment.content}&nbsp&nbsp${comment.commentdate}
			<a href="./delete.chain?commentNum=${comment.commentnum}">삭제</a><br>
			</c:forEach>
		</div>
		<div>
			<input type="button" value="커멘트 쓰기" onclick="CommWrite()"/>
		</div>
	</center>
</body>
</html>