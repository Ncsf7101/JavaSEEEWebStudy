<%@ page contentType="text/html" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			response.setHeader("refresh", "2;URL=login.jsp");
			session.invalidate();
		%>
		<h2><a href="login.jsp">登录</a></h2><br>
	</body>
</html>