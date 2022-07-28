<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
		<%
			String str = (String) application.getAttribute("name");
		%>
		<h2><%=str%></h2>
	</body>
</html>