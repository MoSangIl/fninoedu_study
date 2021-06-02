<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function logout(){
		location.href="./logout.chain"
		
	}
</script>
</head>
<body>
	<p>로그인 성공  ${id}님 환영합니다!</p>
	<form action="./logout.chain" method="post">
	<button id="logout" > 로그아웃 </button>
	</form>
</body>
</html>