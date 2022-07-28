<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="com.rqiang.DAO.factory.*, com.rqiang.DAO.vo.*"%>
<%@ page import="java.text.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册页面</title>
	</head>
	<% request.setCharacterEncoding("UTF-8");%>
	<body>
		<%
			Emp emp = new Emp();
			emp.setempno(Integer.parseInt(request.getParameter("empno")));
			emp.setEname(request.getParameter("ename"));
			emp.setJob(request.getParameter("job"));
			emp.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
			emp.setSal(Float.parseFloat(request.getParameter("sal")));
			try{
				if(DAOFactory.getIEmpDAOInstance().doCreate(emp)){
		%>
			<h3>雇员信息添加成功！</h3>
		<%
				}else{
		%>
			<h3><%=DAOFactory.getIEmpDAOInstance().doCreate(emp)%></h3>
			<h3><%=emp.toString()%></h3>
			<h3>雇员信息添加失败！</h3>
		<%
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</body>
</html>