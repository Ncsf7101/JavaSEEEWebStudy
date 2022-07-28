<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
		<%--程序顺序执行--%>
		<%
			int x = 10;
			String info = "www.baidu.com";
			out.println("<h2>x =" + x + "</h2>");
			out.println("<h2>" + info + "</h2>");
		%>
		<%
			out.println("<h2>x =" + x + "</h2>");
			out.println("<h2>" + info + "</h2>");
		%>
		<h3>info=<%=info%></h3>
	</body>
</html>