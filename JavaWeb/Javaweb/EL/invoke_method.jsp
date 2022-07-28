<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<h3>ip: ${pageContext.request.remoteAddr}</h3>
		<h3>sessionId: ${pageContext.session.id}</h3>
		<h3>isNew: ${pageContext.session.new}</h3>
	</body>
</html>