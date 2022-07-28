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
			IPTimeStamp its = new IPTimeStamp();
			for(int i = 0; i<smart.getFiles().getCount(); i++){
				File f = smart.getFiles().getFile(i);
				String ext = f.getFileExt();
				String fileName = its.getIPTimeRand() + "." + ext;
				f.saveAs((getServletContext().getRealPath("/") + "upload" + java.io.File.separator + fileName));			
		%>
			<img src="../upload/<%=fileName%>" />
		<%
			}
		%>

		
		
	</body>
</html>