<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%!
			int count = 0;			
		%>
		<%
			response.setHeader("refresh", "2");
		%>
		<h3>已经访问了<%=count++%>次了</h3>
	</body>
</html>