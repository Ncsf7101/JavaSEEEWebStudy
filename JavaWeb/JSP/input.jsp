<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			String str = request.getParameter("info");
			out.println(new String("<h1>" + str.getBytes("iso-8859-1"), "UTF-8") + "</h1>");
		%>
	</body>
</html>