<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
		%>
	<center>
		<table border="1">
		<tr>
			<td>头名称</td>
			<td>头内容</td>
		</tr>
		<%
			Enumeration enu = request.getHeaderNames();
			while(enu.hasMoreElements()){
		%>
				<tr>
		<%
				String en = (String) enu.nextElement();
				String ev = request.getHeader(en);
		%>	
				<td><%=en%></td>
				<td>
					<%=ev%>
				</td>
				</tr>
		<%
		}
		%>
	</table>
	</center>
	</body>
</html>