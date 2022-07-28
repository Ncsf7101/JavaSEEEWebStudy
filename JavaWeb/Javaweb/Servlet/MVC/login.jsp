<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<script language="JavaScript">
			function validate(f){
				var userid = f.userid.value;
				var userpwd = f.userpwd.value;
				if(!(/^\w{5,15}$/.test(userid))){
					alert("用户ID必须是5~15位!");
					f.userid.focus();
					return false;
				}
				if(!(/^\w{5,15}$/.test(userpwd))){
					alert("用户pwd必须是5~15位!");
					f.userpwd.focus();
					return false;
				}
				return true;
			}
		</script>
	</head>
	<% request.setCharacterEncoding("utf-8");%>
	<body>
		<h2>用户登录程序</h2>
		<%
			List<String> info = (List<String>) request.getAttribute("info");
			if(info != null){
				Iterator<String> iter = info.iterator();
				while(iter.hasNext()){
					
		%>
			<h4><%=iter.next()%></h4>
		<%
			}
		}
		%>
		<form action="LoginServlet" method="POST" onSubmit="return validate(this)">
			用户ID: <input type="text" name="userid"/><br />
			密&nbsp;&nbsp;码: <input type="password" name="userpwd"/><br />
			<input type="submit" value="登录">
			<input type="reset" value="重置">
			
		</form>
	</body>
</html>