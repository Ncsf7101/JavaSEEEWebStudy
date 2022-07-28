<%@ page contentType="text/html" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%=session.isNew()%>
		<form action="login.jsp">
			用户名<input type="text" name="uname"><br>
			密&nbsp;&nbsp;码<input type="password" name="upwd"><br>
			<input type="submit" value="登录" />
			<input type="reset" value="重置" />
		</form>
		<%
			String name = request.getParameter("uname");
			String pwd = request.getParameter("upwd");
			if(!(name==null || "".equals(name)
				|| pwd==null || "".equals(pwd))){
					if("admin".equals(name) && "123456".equals(pwd)){
						response.setHeader("refresh", "2;URL=welcome.jsp");
						session.setAttribute("userid", name);
						out.print("2s后跳转");
					}else{
						out.print("账号输入错误");
					}
				}
		%>
	</body>
</html>