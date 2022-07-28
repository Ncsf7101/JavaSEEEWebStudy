<%@ page contentType="text/html" pageEncoding="utf-8" import="com.rqiang2.tag.SimpleInfo"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<%@ taglib prefix="sql" uri="/WEB-INF/sql.tld"%>
	<head>
		<meta charset="utf-8">
		<title>JSP</title>
	</head>
	<body>
		<h3><c:out value="hello"></c:out></h3>
		<h3><c:out value="${ref}">
			world!
		</c:out></h3>
		<h3><c:set var="rq" value="hello"/>
		<c:set var="zrq" value="hello"/>
		<c:remove var="rq"/>
			${rq}
			<%pageContext.getAttribute("rq");
			%>
		</h3>
		<c:if test="${zrq==null}" var="a">
			111111
		</c:if>
		--------------------
		<jsp:useBean id="info" scope="request" class="com.rqiang2.tag.SimpleInfo"/>
		
		<h3><c:set target="${info}" property="content" value="hello"/>
			${info.content}
		</h3>
		<%
			String str = "www.baidu.com";
			pageContext.setAttribute("str", str);
		%>
		<c:forTokens items="www:baidu:com" delims=":" var="rq">
			${rq}、
		</c:forTokens>
		<!--c:import url="http://www.baidu.com" charEncoding="utf-8"/-->
		<fmt:setBundle basename="com.rqiang2.tag.Message" var="msg"/>
			<fmt:message key="info" var="inforef" bundle="${msg}">
					<fmt:param value="rqiang"/>
			</fmt:message>
		Info:${inforef}
		<fmt:bundle basename="com.rqiang2.tag.Message">
			<fmt:message key="name" var="nameref"/>
		</fmt:bundle>
		姓名:${nameref}
		<fmt:bundle basename="com.rqiang2.tag.Message">
			<fmt:message key="info" var="inforef">
					<fmt:param value="rqiang"/>
			</fmt:message>
		</fmt:bundle>
		Info:${inforef}
		<fmt:parseDate value="2022年12月12日 16时45分30秒123毫秒" 
			pattern="yyyy年MM月dd日 HH时mm分ss秒SSS毫秒" var="date"/>
			${date}<br />
		<fmt:timeZone value="HST">
			<fmt:formatDate value="${date}" type="both" dateStyle="full"
				timeStyle="full" var="date"/>
		</fmt:timeZone>
			HST ${date}
		<sql:setDataSource dataSource="jdbc/rqiang" var="rqiangds"/>
		<sql:query var="result" dataSource="${rqiangds}">
				SELECT * FROM user;
		</sql:query>
		<br />${result.rowCount}
	</body>
</html>