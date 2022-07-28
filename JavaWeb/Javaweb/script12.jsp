<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
		<%
			String username = "Boli";
		%>
		<h1>动态包含操作</h1>
		<!--<jsp:forward page="script10.3.jsp"/>
		<jsp:forward page="script10.2.inc"/>-->
		<jsp:forward page="script11.1.jsp">
				<jsp:param name="name" value="<%=username%>"/>
				<jsp:param name="info" value="www.baidu.com"/>
		</jsp:forward>
	</body>
</html>