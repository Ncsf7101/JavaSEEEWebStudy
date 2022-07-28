<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Rqiang</title>
	</head>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="reg" scope="request" class="com.rqiang.JavaWeb.JavaBean.Register"/>
	<jsp:setProperty name="reg" property="*"/>
	<body>
		<%
		if(reg.isValidate()){
		%>
			<jsp:forward page="success.jsp"/>
		<%
		}else{
		%>
			<jsp:forward page="index.jsp"/>
		<%
		}
		%>
	</body>
</html>