<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			List list = (List) request.getAttribute("listdept");
			if(list != null){
		%>
				<table border="1" width="90%">
					<tr>
						<td>部门编号</td>
						<td>部门名称</td>
						<td>部门位置</td>
					</tr>
				
		<%
			Iterator iter = list.iterator();
			while(iter.hasNext()){
				pageContext.setAttribute("dept", iter.next());
		%>
			<tr>
				<td>${pageScope.dept.deptno}</td>
				<td>${pageScope.dept.loc}</td>
				<td>${pageScope.dept.dname}</td>
			</tr>
		<%
			}
		%>
			</table>
		<%
		}
		%>
		
	</body>
</html>