<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<form method="post" action="/login">
		아이디 : <input type="text" name="userId"> <br>
		비밀번호 : <input type="password" name="userPw"> <br>
		<button>로그인</button>
	</form>

</body>
</html>