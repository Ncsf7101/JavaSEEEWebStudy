<%@ page contentType="text/html" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册页面</title>
	</head>
	<body>
		<form action="emp_insert_do.jsp" method="post">
			雇员编号:<input type="text" name="empno"/><br>
			雇员姓名:<input type="text" name="ename"/><br>
			雇员职位:<input type="text" name="job"/><br>
			雇员日期:<input type="text" name="hiredate"/><br>
			基本工资:<input type="text" name="sal"/><br>
			<input type="submit" value="注册" />
			<input type="reset" value="重置" />
		</form>
	</body>
</html>