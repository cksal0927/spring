<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 작성</title>

<link rel="stylesheet" href="/css/write.css">

</head>
<body>

	<div id="wrap">
		<a href="/">HOME</a>
		<h3 id="enrollCount">${count }권 등록 완료</h3>
		
		<form method="post" action="/enroll">
			<div id="formWrap">
				<div class="inputField">
					<lable for="bookTitle">책 제목</lable>
					<input type="text" name="bookTitle" id="bookTitle">
				</div>
				<div class="inputField">
					<lable for="bookAuthor">저자</lable>
					<input type="text" name="bookAuthor" id="bookAuthor">
				</div>
				<div class="inputField">
					<lable for="bookPrice">가격</lable>
					<input type="number" name="bookPrice" id="bookPrice">
				</div>
				<div class="inputField">
					<lable for="bookPage">페이지 수</lable>
					<input type="number" name="bookPage" id="bookPage">
				</div>
				<div class="inputField">
					<lable for="publisher">출판사</lable>
					<input type="text" name="publisher" id="publisher">
				</div>
				<button id="bt">등록</button>
			</div>
		</form>
	</div>

</body>
</html>