<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.rqiang.JavaWeb.JavaBean.*"%>

<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			SimpleBean simple = new SimpleBean();
			simple.setName("玻璃");
			simple.setAge(25);
		%>
		<h3>姓名: <%=simple.getName()%></h3>
		<h3>年龄: <%=simple.getAge()%></h3>
	</body>
</html>