<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%!
			int second = 3;
		%>
		<h2><%=second--%>秒后跳转界面，如果还没跳转请点击<a href="responseRefresh.jsp">这里</a></h2>
		<%
			if(second != 0){
				response.setHeader("refresh", "1");
			}
			else{
				response.setHeader("refresh", "1;URL=responseRefresh.jsp");
			}
		%>
	</body>
</html>