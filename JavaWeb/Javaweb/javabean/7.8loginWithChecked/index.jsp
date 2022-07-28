<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Rqiang</title>
	</head>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="reg" scope="request" class="com.rqiang.JavaWeb.JavaBean.Register"/>
	
	<body>
		<form action="check.jsp" method="post">
			用户名: <input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>">
			<%=reg.getErrorMsg("errname")%><br>
			年&nbsp;&nbsp;龄:<input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>">
			<%=reg.getErrorMsg("errage")%><br>
			E-Mail:<input type="text" name="email" value="<jsp:getProperty name="reg" property="email"/>">
			<%=reg.getErrorMsg("erremail")%><br>
			<input type="submit" value="注册"><input type="reset" value="重置">
		</form>
	</body>
</html>