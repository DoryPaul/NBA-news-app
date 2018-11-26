<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_change.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	 <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
  </head>
  
  <body>
    <div class="container"> 
   <form action="userupdate.action" method="post">
    <input type="hidden" name="id" value="${user.id }"/>
    修改用户信息：
<table class="table table-striped table-bordered table-hover table-condensed">
<tr>
	<td>用户名</td>
	<td><input type="text" name="username"  class="form-control" value="${user.username }"/></td>
</tr>
<tr>
	<td>密码</td>
	<td><input type="text" name="password"  class="form-control" value="${user.password }"/></td>
</tr>
<tr>
	<td>身份等级</td>
	<td><input type="text" name="identity" class="form-control" value="${user.identity }"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交" class="btn defalut-btn"/>
</td>
</tr>
</table>
    
    </form>
    </div>
  </body>
</html>
