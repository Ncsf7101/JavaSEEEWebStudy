<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
			<table border="1" width="100%">
				<%
					int cows = 0;
					int cols = 0;
				%>
				<%
					try{
						cows = Integer.parseInt(request.getParameter("row"));
						cols = Integer.parseInt(request.getParameter("col"));
					}catch(Exception e){
					}
				%>
				<%	for(int i = 1; i<=cows; i++){ %>
				<tr>
					<%	for(int j = 1; j<=cols; j++){ %>
						<td><%=(i*j)%></td>
					<% } %>
				</tr>
				<% } %>
			</table>
	</body>
</html>