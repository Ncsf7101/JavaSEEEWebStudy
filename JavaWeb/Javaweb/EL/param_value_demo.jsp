<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<% request.setCharacterEncoding("utf-8");%>
	<body>
		<form action="param_value_demo.jsp" method="post">
			 <input type="checkbox" name="hab" value="Sing"/>Sing
			 <input type="checkbox" name="hab" value="Swing"/>Swing
			 <input type="checkbox" name="hab" value="Dance"/>Dance
			 <input type="checkbox" name="hab" value="Programmer"/>Programmer
			 <input type="checkbox" name="hab" value="Surf"/>Surf Internet
			 <input type="submit" value="显示"/>
		</form>
		<h3>
			第一个参数:${paramValues.hab[0]}<br />
			第二个参数:${paramValues.hab[1]}<br />
			第三个参数:${paramValues.hab[2]}<br />
			第四个参数:${paramValues.hab[3]}<br />
		</h3>
	</body>
</html>