<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>커피 등록</h2>
	
	<form method="post" action="/coffeeSave">
		<div id="formWrap">
			<div class="inputField">
				<label for="itemName">커피 메뉴명 : </label>
				<input type="text" name="itemName" id="itemName">
			</div>
			<div class="inputField">
				<label for="price">가격 : </label>
				<input type="number" name="price" id="price">
			</div>
			<div class="inputField">
				<label for="">디카페인 : </label>
				<div class="radioField">
					<input type="radio" name="decaffein" value="0" checked>카페인
					<input type="radio" name="decaffein" value="1">디카페인
				</div>
			</div>
			<button id="bt">등록</button>
		</div>
	</form>

</body>
</html>