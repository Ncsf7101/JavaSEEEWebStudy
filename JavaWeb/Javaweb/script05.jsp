<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
		<form action="script06.jsp" method="post">
			<table border="1" width="100%">
				<tr>
					<td>输入要显示表格的行数: </td>
					<td><input type="text" name="row"/></td>
				</tr>
				<tr>
					<td>输入要显示表格的列数: </td>
					<td><input type="text" name="col" id=""></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="显示">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>	
	</body>
</html>