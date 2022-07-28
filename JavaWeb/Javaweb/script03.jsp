<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
			<%
				int cows = 10;
				int cols = 10;
				out.print("<table border=\"1\" width=\"100%\">");
				for(int i = 1; i<=cows; i++){
					out.print("<tr>");
					for(int j = 1; j<=cols; j++){
						out.print("<td>" + (i * j) + "</td>");
					}
					out.print("</tr>");
				}
			%>
		</table>
	</body>
</html>