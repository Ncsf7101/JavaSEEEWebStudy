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
		<html:form action="/struts/simple.do" method="post">
			姓名:<html:text property="name"/><br/>
			密码:<html:password property="pwd"/><br/>
			性别:<html:radio property="sex" value="男"/>男
				<html:radio property="sex" value="女"/>女<br />
			简介:<html:textarea property="note" cols="30" rows="3"/><br />
			<html:hidden property="id" value="30"/>
			<html:submit value="提交"/>
			<html:reset value="重置"/>
		</html:form>
	</body>
</html:html>