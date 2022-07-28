<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Rqiang</title>
	</head>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="reg" scope="request" class="com.rqiang.JavaWeb.JavaBean.Register"/>
	<body>
		用户名:<jsp:getProperty name="reg" property="name"/>
		年&nbsp;&nbsp;龄:<jsp:getProperty name="reg" property="age"/>
		E-mail:<jsp:getProperty name="reg" property="email"/>
	</body>
</html>