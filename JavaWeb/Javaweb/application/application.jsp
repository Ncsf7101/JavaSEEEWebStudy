<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>

		<h2><%=application.getRealPath("/")%></h2>
		<h2><%=this.getServletContext().getRealPath("/")%></h2><br>
	</body>
</html>