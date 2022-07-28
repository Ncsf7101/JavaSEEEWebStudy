<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.rqiang.EL.Dept"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			Dept dept = new Dept();
			dept.setDeptno(1);
			dept.setDname("rqiang");
			dept.setLoc("瑞金");
			request.setAttribute("dept", dept);
		%>
		<h4>
			第一个参数:${requestScope.dept.deptno}<br />
			第二个参数:${requestScope.dept.loc}<br />
			第三个参数:${requestScope.dept.dname}<br />

		</h4>>
	</body>
</html>