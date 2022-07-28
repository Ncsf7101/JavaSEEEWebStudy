<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form action="applicationInputContent.jsp" method="post">
			文件<input type="text" name="filename"/><br>
			内容<textarea type="filecontent" name="filecontent" cols="30" rows="3"></textarea>
			<input type="submit" value="保存"/>
			<input type="reset" value="清空"/>
		</form>

		
	</body>
</html>