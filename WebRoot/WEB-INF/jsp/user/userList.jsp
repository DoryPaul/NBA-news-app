<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<script type="text/javascript">
function deleteUser(){
	//提交form
	document.userForm.action="${pageContext.request.contextPath }/deleteUser.action";
	document.userForm.submit();
}
function queryUser(){
	//提交form
	document.userForm.action="${pageContext.request.contextPath }/findUser.action";
	document.userForm.submit();
}
</script>
<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body> 
<jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
  <div class="container">   
当前用户：${username }，
<c:if test="${username!=null }">
 <a href="${pageContext.request.contextPath }/login.action">退出</a>
 <a href="register.action">新增用户</a>
</c:if>
<form name="userForm" action="${pageContext.request.contextPath }/userList.action" method="post">

查询条件：
<table class="table table-bordered" >
<tr>
<td>
用户名：<input name="user.username"  class="form-control" />
</td>
<td><input type="button" value="查询" onclick="queryUser()" class="btn btn-default"/>
<input type="button" value="删除" onclick="deleteUser()" class="btn btn-default"/>
</td>
</tr>
</table>
    
用户列表：
<table  class="table table-striped table-bordered table-hover table-condensed">
<thead>
<tr>
	<th>选择</th>
	<th>用户名</th>
	<th>密码</th>
	<th>操作</th>
</tr>
</thead>
<tbody>
<c:forEach items="${userList}" var="user">

<tr>	
	<td><input type="checkbox" name="user_id" value="${user.id}"/></td>
	<td>${user.username }</td>
	<td>${user.password }</td>
	<td><a href="userupdate.action?id=${user.id}">重置</a></td>

</tr>

</c:forEach>
</tbody>
</table>
</div>
</form>
</body>

</html>