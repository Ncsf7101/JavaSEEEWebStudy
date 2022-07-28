<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="com.rqiang.DAO.factory.*, com.rqiang.DAO.vo.*"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册页面</title>
	</head>
	<% request.setCharacterEncoding("UTF-8");%>
	<body>
		<%
			try{
				String keyWord = request.getParameter("kw");
				if(keyWord == null){
					keyWord = "";
				}
				List<Emp> emps = DAOFactory.getIEmpDAOInstance().findAll(keyWord);
				Iterator<Emp> iter = emps.iterator();
		%>
		<center>
			<form action="emp_list.jsp" method="post">
				请输入从查询关键字<input type="text" name="kw"/>
				<input type="submit" value="查询">
			</form>
			<table border="1" width="80%">
				<tr>
					<td>雇员编号</td>
					<td>雇员姓名</td>
					<td>雇员职位</td>
					<td>雇员日期</td>
					<td>基本工资</td>
				</tr>
		<%	
			while(iter.hasNext()){
				Emp emp = iter.next();
		%>
				<tr>
					<td><%=emp.getempno()%></td>
					<td><%=emp.getEname()%></td>
					<td><%=emp.getJob()%></td>
					<td><%=emp.getHiredate()%></td>
					<td><%=emp.getSal()%></td>
				</tr>
		<%
			}
		%>
			</table>
		</center>
		<%
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</body>
</html>