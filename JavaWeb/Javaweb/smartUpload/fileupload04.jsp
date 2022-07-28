<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.*"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
		
	<body>
		<% request.setCharacterEncoding("UTF-8");%>
		<%
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setFileSizeMax(3145728);
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> iters = items.iterator();
			while(iters.hasNext()){
				FileItem item = iters.next();
				String fieldName = item.getFieldName();
		%>
			<ul>
				<h4>表单控件名称: <%=fieldName%>--><%=item.isFormField()%></h4>
		<%
			if(!item.isFormField()){
				String fileName = item.getName();
				String contentType = item.getContentType();
				long sizeInBytes = item.getSize();
		%>
			<li>上传文件名称:<%=fileName%></li>
			<li>上传文件类型:<%=contentType%></li>
			<li>上传文件大小:<%=sizeInBytes%></li>
		<%
			}else{
				String value = item.getString();
				
		%>
			<li>普通参数:<%=value%></li>
		<%
			}
		%>
			</ul>
		<%
		}
		%>
	</body>
</html>