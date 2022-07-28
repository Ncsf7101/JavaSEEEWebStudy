<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<% 
			Set set = (Set) this.getServletContext().getAttribute("online");
		%>
		<h2>在线用户列表</h2>
		<%=set.size()%>
		<%
			//从application中取出所有用户的保存列表
			Iterator iter = set.iterator();
			while(iter.hasNext()){
		%>
				<%=iter.next()%>、
		<%
			}
		%>
	</body>
</html>