<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
body {
	font-family: "맑은 고딕";
	font-size: 0.75em;
	color: #333;
}
#login-form {
	width: 200px;
	margin: 100px auto;
	border: 1px solid gray;
	border-radius: 5px;
	padding: 15px;
}
/* inline이였던 요소들을 block으로 바꿈 */
#login-form input, #login-form label {
	display: block;
}
#login-form label {
	margin-top: 10px;
}

#login-form input {
	margin-top: 5px;
}
/* 애트리뷰트 선택자 */
#login-form input[type='image'] {
	margin: 10px auto;
}
</style>
<body>
	<form id="login-form" method="post">
		<label class="legend">아이디</label> 
			<input name="id" type="text" id="userid">
		<label class="legend">패스워드</label> 
			<input name="password" type="password"> 
			<input type="button" value="로그인" onclick="loginCheck()">
	</form>
</body>
<script src="https://code.jquery.com/jquery-3.3.0.min.js"></script>
<script type="text/javascript">
	function loginCheck(){
	    var params = $("#login-form").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
	    $.ajax({
	        url: 'loginCheck',
	        type: 'POST',
	        data:params,
	        dataType: 'json',
	        success: function (result) {
	            if (result){
	            	if(result.result == "1"){
	            		alert("로그인성공");
	            		location.href = "bbList";
	            	}else{
		            	alert("id와 password를 확인하세요");
	            	}
	            } 
	        },
	    });
	}
</script>
</html>