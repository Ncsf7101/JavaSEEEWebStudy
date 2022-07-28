<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<center>
			<h1>登陆操作</h1><hr>
			<h2>登陆成功</h2>
			<h2>欢迎<%=request.getParameter("name")%>回来</h2>
			<h2><a href="login.html">退出</a></h2>
		</center>
	</body>
</html>