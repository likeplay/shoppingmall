<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员列表列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
<table width="100%" border=1>
<tr>
	<td>id</td>
	<td>姓名</td>
	<td>密码</td>
</tr>
<c:forEach items="${itemsList }" var="item">
<tr>
	<td>${item.id }</td>
	<td>${item.name }</td>
	<td>${item.password }</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>