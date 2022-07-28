<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<h2>
			SessionId:<%=session.getId()%><br>
			SessionLength:<%=session.getId().length()%><br>
			CookiesId:<%=request.getCookies()[0].getValue()%>
		</h2>

	</body>
</html>