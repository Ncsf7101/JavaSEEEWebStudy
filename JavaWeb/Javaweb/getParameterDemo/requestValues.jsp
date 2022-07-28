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
			<td>参数名称</td>
			<td>参数内容</td>
		</tr>
		<%
			Enumeration enu = request.getParameterNames();
			while(enu.hasMoreElements()){
		%>
				<tr>
		<%
				String e = (String) enu.nextElement();
		%>	
				<td><%=e%></td>
				<td>
		<%
				if(e.startsWith("**")){
					String para[] = request.getParameterValues(e);
					for(String p:para){
		%>
						<%=p%>、
		<%
					}
				}else{
		%>
					<%=request.getParameter(e)%>
		<%
				}
		%>
				</td>
				</tr>
		<%
		
		}
		%>
	</table>
	</center>
	</body>
</html>