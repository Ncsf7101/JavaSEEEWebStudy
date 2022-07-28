<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<h2>hello World!</h2>
		<h2><%=config.getInitParameter("driver")%></h2>
		<h2><%=config.getInitParameter("url")%></h2>
		<h2><%=out.getBufferSize()%></h2>
		<h2><%=out.getRemaining()%></h2>
	</body>
</html>