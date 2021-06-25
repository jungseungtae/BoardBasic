<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 <title>댓글 수정하기</title>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		var formObj = $("form[name='updateForm']");
		
		$(".cancel_btn").on("click", function() {
			location.href = "/board/readView?bno=${replyUpdate.bno}"
							+ "&page=${scri.page}"
							+ "&perPageNum=${scri.perPageNum}"
							+ "&searchType=${scri.searchType}"
							+ "&keyword=${scri.keyword}";
		})
	})
</script>
<body>
	<div id="root">
		<header>
			<h1>게시판</h1>
		</header>
		<hr />
	</div>
	<div><%@include file="nav.jsp %></div>
	<hr />
	
	<section id="container">
		<form name="updateForm" role="form" method="post" action="/board/replyUpdate">
			<input type="hidden" name="bno" value="${replyUpdate.bno}" readonly="readonly">
			<input type="hidden" name="rno" value="${replyUpdate.rno}" readonly="readonly">
			<input type="hidden" name="page" value="${replyUpdate.page}" readonly="readonly">
			<input type="hidden" name="perPageNum" value="${replyUpdate.perPageNum}" readonly="readonly">
			<input type="hidden" name="searchType" value="${replyUpdate.searchType}" readonly="readonly">
			<input type="hidden" name="keyword" value="${replyUpdate.keyword}" readonly="readonly">
			
		</form>
	</section>
	
</body>
</html>