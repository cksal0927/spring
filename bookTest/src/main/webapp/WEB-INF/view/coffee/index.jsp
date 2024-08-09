<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 메뉴</title>

<link rel="stylesheet" href="/css/coffee.css">

</head>
<body>

	<div id="wrap">
		<h2>카페 메뉴 관리</h2>
		
		<div id="mainTitle">
			<h3>등록 메뉴 목록</h3>
			<a href="/coffeeReg" id="enroll">메뉴 등록</a>
		</div>
		<div id="bookListWrap">
			<ul id="bookList">
				
				<c:forEach var="row" items="${list }">
					<li class="blist">
						<span class="itemName"><a href="/coffee/view?=${row.coffeeId }">${row.itemName }</a></span>
						<span class="price">${row.price }</span>
						<span class="decaffein">${row.decaffein }</span>
					</li>
				</c:forEach>
				
			</ul>
		</div>
	</div>

</body>
</html>