<%@ page contentType="text/html" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			if(session.getAttribute("userid")!=null){
				out.print("欢迎" + session.getAttribute("userid"));
			}else{
				out.print("未发现该用户");
			}
		%>
		<h2><a href="login.jsp"><%=session.getId()%></a></h2><br>
		<h2><a href="login.jsp">登录</a></h2><br>
		<h2><a href="logout.jsp">注销</a></h2><br>
		
	</body>
</html>