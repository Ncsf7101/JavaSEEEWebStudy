<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="com.jspsmart.upload.*"%>
<%@ page import="com.rqiang.JavaWeb.fileupdate.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
		
	<body>
		<% request.setCharacterEncoding("UTF-8");%>
		<%
			SmartUpload smart = new SmartUpload();
			smart.initialize(pageContext);
			smart.upload();
			String name = smart.getRequest().getParameter("uname");
			IPTimeStamp its = new IPTimeStamp();
			File f = smart.getFiles().getFile(0);
			String ext = f.getFileExt();
			String fileName = its.getIPTimeRand() + "." + ext;
			//smart.save("upload");
			f.saveAs((getServletContext().getRealPath("/") + "upload" + java.io.File.separator + fileName));			
			//f.saveAs("/upload/" + fileName);
		%>
		<h2>姓名：<%=name%></h2>
		<h2>姓名：<%=fileName%></h2>
		
		<img src="../upload/<%=fileName%>" />
	</body>
</html>