<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="false"%>
<html>
<head>
<title>게시판</title>

<style>
.mouseOverHighlight {
	border-bottom: 1px solid blue;
	cursor: pointer !important;
	color: blue;
	pointer-events: auto;
}
</style>
</head>
<body>
	<form class="form-inline" id="frmSearch" action="/board/list">
		<input type="hidden" id="startPage" name="startPage" value="">
		<!-- 페이징을 위한 hidden타입 추가 -->
		<input type="hidden" id="visiblePages" name="visiblePages" value="">
		<!-- 페이징을 위한 hidden타입 추가 -->
		<div align="center">
			<table width=81%>
				<tr>
					<td align="right">
						<button type="button" id="write" name="write" onclick="javascript:boardwrite();">글 작성</button>
					</td>
				</tr>
			</table>
			<table border="1" width=80% >
				<tr>
					<th width="10%">No</th>
					<th width="50%">제목</th>
					<th width="20%">작성자</th>
					<th width="20%">작성일</th>
				</tr>
				<c:choose>
					<c:when test="${fn:length(boardList) == 0}">
						<tr>
							<td colspan="4" align="center">조회결과가 없습니다.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="boardList" items="${boardList}" varStatus="status">
							<tr>
								<td align="center">${boardList.idx}</td>
								<td><a name="subject" class="mouseOverHighlight"
									content_id="${boardList.idx}">${boardList.subject}</a></td>
								<td align="center">${boardList.uidx}</td>
								<td align="center">${boardList.indate}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>
			<br>
			<div id="pagination"></div>
		</div>
	</form>
</body>
<script type="text/javascript">
	function boardwrite(){
		alert();
		location.href = "bbListWrite";
	}
</script>
</html>