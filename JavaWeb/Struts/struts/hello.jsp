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
		<html:errors/>
		
		<html:messages id="info" message="true">
			${info}
		</html:messages>
		
		<logic:present name="msg" scope="request">
			<h2>${msg}</h2>
		</logic:present>
			
		<html:form action="/struts/hello.do" method="post">
			请输入信息:<html:text property="info"></html:text>
			<html:submit value="显示"></html:submit>
		</html:form>
	</body>
</html:html>