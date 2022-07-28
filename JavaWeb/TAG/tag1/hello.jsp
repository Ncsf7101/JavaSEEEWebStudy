<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="mytag" uri="tag_rqiang"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<% request.setCharacterEncoding("utf-8");%>
	<body>
		<h1><mytag:date format="yyyy-MM-dd HH:mm:ss!SSS"/></h1>
	</body>
</html>