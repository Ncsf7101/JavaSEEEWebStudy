<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<% 
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("filename");
			String content = request.getParameter("filecontent");
			String filename = this.getServletContext().getRealPath("/")
				+ "note" + File.separator + name;
			File file = new File(filename);
			if(!file.getParentFile().exists()){
				out.print("不存在父文件夹");
				file.getParentFile().mkdir();
			}
			PrintStream ps = null;
			ps = new PrintStream(new FileOutputStream(file));
			ps.println(content);
			ps.close();
		%>
		<%
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\n");
			StringBuffer buf = new StringBuffer();
			while(scan.hasNext())
			{
				buf.append(scan.next()).append("<br>");
			}
		%>
		<%=buf%>
	</body>
</html>