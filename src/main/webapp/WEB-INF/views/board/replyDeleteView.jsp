<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 <title>댓글 삭제하기</title>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		var formObj = $("form[name='updateForm']");
		
		$(".cancel_cnt").on("click", function() {
			location.href = "/board/readView?bno=${replyDelete.bno}"
							+ "&page=${scri.page}"
							+ "&perPageNum=${scri.perPageNum}"
							+ "&searchType=${scri.searchType}"
							+ "&keyword=${scri.keyword}";
		});
	})
</script>
<body>
	<div id="root">
		<header>
			<h1>게시판</h1>
		</header>
		<hr />
	</div>
	<div><%@include file="nav.jsp" %></div>
	<hr />
	
	<section id="container">
		<form name="updateForm" role="form" method="post" action="/board/replyDelete">
			<input type="hidden" name="bno" value="${replyDelete.bno}" readonly="readonly">
			<input type="hidden" name="rno" value="${replyDelete.rno}" readonly="readonly">
			<input type="hidden" name="page" value="${scri.page}" readonly="readonly">
			<input type="hidden" name="perPageNum" value="${scri.perPageNum}" readonly="readonly">
			<input type="hidden" name="searchType" value="${scri.searchType}" readonly="readonly">
			<input type="hidden" name="keyword" value="${scri.keyword}" readonly="readonly">
			
			<div>
				<button type="submit" class="delete_cnt">예. 삭제합니다.</button>
				<button type="button" class="cancel_cnt">아니오. 삭제하지 않습니다.</button>
			</div>
		</form>
	</section>
	
</body>
</html>