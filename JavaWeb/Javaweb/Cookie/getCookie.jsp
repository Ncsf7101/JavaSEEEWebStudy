<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			Cookie cs[] = request.getCookies();
			for(int i = 0; i<cs.length; i++){
		%>
				<h3><%=cs[i].getName()%>--><%=cs[i].getValue()%></h3>
		<%
			}
		%>

	</body>
</html>