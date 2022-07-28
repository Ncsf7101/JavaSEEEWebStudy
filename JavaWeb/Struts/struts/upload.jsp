<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.jx3hyun.com/struts/bean" prefix="bean"%>
<%@ taglib uri="http://www.jx3hyun.com/struts/html" prefix="html"%>
<%@ taglib uri="http://www.jx3hyun.com/struts/logic" prefix="logic"%>
<html:html lang="true">
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<% request.setCharacterEncoding("Utf-8");%>
	<body>
		<html:form action="/struts/input.do" method="post" enctype="multipart/form-data">
			请选择要上传的文件:<html:file property="photo"></html:file>
			<html:submit value="上传"></html:submit>
		</html:form>
	</body>
</html:html>