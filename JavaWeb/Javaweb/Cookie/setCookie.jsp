<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			Cookie c1 = new Cookie("rq", "riqang");	
			c1.setMaxAge(10);
			response.addCookie(c1);
		%>

	</body>
</html>