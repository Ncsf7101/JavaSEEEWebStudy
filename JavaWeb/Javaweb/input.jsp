<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			String str = request.getParameter("info");
		%>
		<%=str%>
	</body>
</html>

<%//out.println("<h1>" + new String(str.getBytes("iso-8859-1"), "UTF-8") + "</h1>");%>