<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리</title>

<link rel="stylesheet" href="/css/default.css">

</head>
<body>

	<div id="wrap">
		<h2>도서 관리</h2>
		
		<div id="mainTitle">
			<h3>등록 도서 목록</h3>
			<a href="/bookWrite" id="enroll">도서 등록</a>
		</div>
		<div id="bookListWrap">
			<ul id="bookList">
			
				<c:forEach var="row" items="${list }">
					<li class="blist">
						<span class="title"><a href="/book/view?id=${row.bookId }">${row.bookTitle }</a></span>
						<span class="auth">${row.bookAuthor }</span>
						<span class="bookCode">${row.bookId }</span>
						<span class="category">${row.publisher }</span>
					</li>
				</c:forEach>
			
				<li class="blist">
					<span class="title">노인과 바다</span>
					<span class="auth">어니스트 헤밍웨이</span>
					<span class="bookCode">A77392</span>
					<span class="category">중편소설</span>
				</li>
				<li class="blist">
					<span class="title">데미안</span>
					<span class="auth">헤르만 헤세</span>
					<span class="bookCode">L92104</span>
					<span class="category">장편소설</span>
				</li>
				<li class="blist">
					<span class="title">로미오와 줄리엣</span>
					<span class="auth">셰익스피어</span>
					<span class="bookCode">R42847</span>
					<span class="category">로맨스/희곡</span>
				</li>
				<li class="blist">
					<span class="title">돈키호테</span>
					<span class="auth">미겔 데 세르반테스</span>
					<span class="bookCode">M36018</span>
					<span class="category">모험/판타지</span>
				</li>
				<li class="blist">
					<span class="title">죄와 벌</span>
					<span class="auth">표도르 도스토옙스키</span>
					<span class="bookCode">S47291</span>
					<span class="category">심리소설/범죄/철학</span>
				</li>
			</ul>
		</div>
	</div>

</body>
</html>