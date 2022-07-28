<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="mytag" uri="tag_rqiang"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<% request.setCharacterEncoding("utf-8");%>
	<body>
		<%
			List<String> list = new ArrayList<String>();
			list.add("rq");
			list.add("boli");
			list.add("jh");
			request.setAttribute("list", list);
		%>
		<mytag:attribute name="list" scope="request">
			<mytag:iterate id="url" name="list" scope="request">
				<h3>网站${url}</h3>
			</mytag:iterate>
		</mytag:attribute>
		
	</body>
</html>