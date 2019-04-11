<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>게시판</title>

</head>
<body>
	<form id="writeForm">
		<div align="center">
			<table width="80%">
				<tr>
					<td>제목: <input type="text" id="subject" name="subject"
						style="width: 50%;" placeholder="제목" value="${boardView.subject}" />
						<input type="button" id="save"  onclick="add()" value="저장">
					</td>
				</tr>
				<tr>
					<td><textarea name="content" id="content" rows="10">${boardView.content}</textarea>
					</td>
				</tr>
				<tr>
					<td>
						<button id="list" name="list">게시판</button>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
<script src="https://code.jquery.com/jquery-3.3.0.min.js"></script>
<script type="text/javascript">
	function add() {
		
		var params = $("#writeForm").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
		$.ajax({
			url : 'bbListWriteadd',
			type : 'POST',
			data : params,
			dataType : 'json',
			success : function(result) {
				if (result) {
					location.href='bbList'
				}
			},
		});
	}
</script>
</html>