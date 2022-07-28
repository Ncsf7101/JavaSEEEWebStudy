<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>	
<html>
	<head>
		<meta charset="utf-8">
		<title>login_check</title>
	</head>
	<body>
		<%!
			public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
			public static final String DBURL = "jdbc:mysql://localhost:3306/db_javaweb";
			public static final String DBUSER = "root";
			public static final String DBPWD = "123456";
		%>
		<%
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String id = null;
			boolean flag = false;
		%>
		<%
		try{
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
			String sql = "SELECT userid, password FROM user Where userid=? AND password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("userid"));
			pstmt.setString(2, request.getParameter("userpwd"));
			rs = pstmt.executeQuery();
			if(rs.next()){
				id = rs.getString(1);
				flag = true;
			}
			
		}catch(Exception e){
			out.print(e);
		}finally{
			try{
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e){}
		}
		if(flag){
		%>
			<jsp:forward page="login_success.jsp">
				<jsp:param name="name" value="<%=id%>"></jsp:param>
			</jsp:forward>
		<%
		}else{
		%>
			<jsp:forward page="login_failure.jsp"/>
		<%
		}
		%>

	</body>
</html>
		
		