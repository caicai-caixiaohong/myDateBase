<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do">
		姓名：<input name="name" type="text" placeholder="请输入姓名"><br>
		密码：<input name="password" type="password" placeholder="请输入密码">
		<br><button>登录</button>${msg}
	</form>
</body>
</html>