<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<h3>内置: <%=request.getParameter("ref")%></h3>
		<h3>EL: ${param.ref}</h3>
	</body>
</html>