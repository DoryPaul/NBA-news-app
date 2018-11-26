<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改新闻</title>
    <meta http-equiv="content-type"content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  
  <body>
     <div class="container"> 
    <form action="news_update.action" method="post">
    <input type="hidden" name="newsid" value="${newsbyid.newsid }"/>
    修改新闻信息：
<table class="table table-striped table-bordered table-hover table-condensed">
<tr>
	<td>新闻标题</td>
	<td><input type="text" class="form-control" name="newstitle" value="${newsbyid.newstitle }"/></td>
</tr>
<tr>
	<td>新闻内容</td>
	<td><input type="text"  class="form-control" name="newsdesc" value="${newsbyid.newsdesc }"/></td>
</tr>
<tr>
	<td>新闻图片地址</td>
	<td><input type="text" class="form-control" name="newspicurl" value="${newsbyid.newspicurl }"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交" class="btn default-btn"/>
</td>
</tr>
</table>
    
    </form>
    </div>
  </body>
</html>
