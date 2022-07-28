<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="mytag" uri="tag_rqiang"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<% request.setCharacterEncoding("utf-8");%>
	<body>
		<%
			String scope = "session";
			session.setAttribute("username", "rqiang");
		%>
		<mytag:attribute name="username" scope="<%=scope%>">
			<h2>找到你了<%=scope%>:${sessionScope.username}</h2>
		</mytag:attribute>
		<mytag:attribute name="username" scope="request">
			<h2>找到你了request:${sessionScope.username}</h2>
		</mytag:attribute>
	</body>
</html>