<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		
		
		<%
			session.setAttribute("userid", "www.baidu.com");
		%>
		<%=session.getValue("userid")%>
	</body>
</html>
<!--<form action="login.jsp" method="post">
			用户ID：<input type="text" name="userid" />
			<input type="submit" value="登录">
		</form>
		String userid = request.getParameter("userid");
		if(!(userid==null || "".equals(userid))){
			session.setAttribute("userid", request.getParameter("userid"));
			//response.sendRedirect("list.jsp");
		}-->