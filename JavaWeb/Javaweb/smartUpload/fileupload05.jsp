<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*, java.io.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.*"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="com.rqiang.JavaWeb.fileupdate.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
		
	<body>
		<% request.setCharacterEncoding("UTF-8");%>
		<%
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(new File(this.getServletContext().getRealPath("/") + "uploadtemp"));
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setFileSizeMax(3145728);
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> iters = items.iterator();
			IPTimeStamp its = new IPTimeStamp();
			while(iters.hasNext()){
				FileItem item = iters.next();
				String fieldName = item.getFieldName();
				if(!item.isFormField()){

					InputStream input = item.getInputStream();
					OutputStream output = new FileOutputStream(new File(this.getServletContext().getRealPath("/") + 
										"upload" + File.separator + its.getIPTimeRand()
										+ "." + item.getName().split("\\.")[1]));
					byte data[] = new byte[512];
					int temp = 0;
					while((temp = input.read(data,0,512)) != -1){
						output.write(data);
					}
					input.close();
					output.close();
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					}else{
						String value = item.getString();
		%>
			<li>普通参数:<%=value%></li>
		<%
			}
		}
		%>
	</body>
</html>