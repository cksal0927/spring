<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>도서 정보 입력</h2>
	
	<form method="get" action="/detail">
		도서명 : <input type="text" name="title"> <br>
		저자 : <input type="text" name="writer"> <br>
		출판사 : <input type="text" name="publish"> <br>
		<button>입력</button>
	</form>

</body>
</html>