<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册界面</title>
    <meta http-equiv="content-type"content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
      <form action="${pageContext.request.contextPath }/register.action" method="post">
     用户名：<input type="text" name="resname"><br>
     密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text" name="respassword"><br>
      用户类型：<select name="identity" ">
                   <option selected>=请选择用户类型=</option>
                   <option value="manager">manager</option>
                   <option value="yonghu">yonghu</option>
</select><br>
     <input type="submit" value="新增用户"> 
     </form>
  </body>
</html>
