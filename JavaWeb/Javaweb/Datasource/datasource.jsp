<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="javax.naming.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.sql.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%
			String DSNAME = "java:comp/env/jdbc/rqiang";
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup(DSNAME);
			Connection conn = ds.getConnection();
		%>
		<%=conn%>
		<%
			conn.close();
		%>
	</body>
</html>