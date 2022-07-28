<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			List list = new ArrayList();
			list.add("玻璃");
			list.add("rqiang");
			list.add("22");
			request.setAttribute("info", list);
		%>
		<h4>
			第一个参数:${info[0]}<br />
			第二个参数:${info[1]}<br />
			第三个参数:${requestScope.info[2]}<br />
			第四个参数:${info[3]}<br />
			
		</h4>>
	</body>
</html>
<%//!--<jsp:forward page="a.jsp"/><% response.sendRedirect("b.jsp");%>