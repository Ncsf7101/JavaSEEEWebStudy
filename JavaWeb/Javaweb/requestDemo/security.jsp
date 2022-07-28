<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			if(request.isUserInRole("adminusers")){
		%>
		<h2>欢迎光临</h2>
		<%
		}
		%>
	</body>
</html>