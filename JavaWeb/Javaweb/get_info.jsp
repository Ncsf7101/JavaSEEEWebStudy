<%@ page contentType="text/html" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<% request.setCharacterEncoding("UTF-8");%>
	<body>
		<h2>session属性: <%=session.getAttribute("name")%></h2>
		<h2>request属性: <%=request.getAttribute("info")%></h2>
	</body>
</html>