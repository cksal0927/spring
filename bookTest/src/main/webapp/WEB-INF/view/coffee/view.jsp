<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 정보 보기</title>

<!-- jquery CDN -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="/css/info.css">
<script src="/javascript/info.js"></script>

</head>
<body>

	<div id="wrap">
		<a href="/coffee">HOME</a>
		<table id="viewBox">
			<tr>
				<td class="fieldName">커피 이름</td>
				<td class="value">${coffee.itemName }</td>
			</tr>
			<tr>
				<td class="fieldName">가격</td>
				<td class="value">
					<fmt:setLocale value="en_us"/>
					<fmt:formatNumber value="${coffee.price }" type="currency"/>
				</td>
			</tr>
			<tr>
				<td class="fieldName">디카페인</td>
				<td class="value">${coffee.decaffein }</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" id="modify">수정</button>
					<button type="button" id="del">삭제</button>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>