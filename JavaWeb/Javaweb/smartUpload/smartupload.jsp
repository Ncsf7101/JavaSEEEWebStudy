<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="com.jspsmart.upload.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
		
	<body>
		<%
			SmartUpload smart = new SmartUpload();
			smart.initialize(pageContext);
			smart.upload();
			smart.save("upload");
		%>
	</body>
</html>