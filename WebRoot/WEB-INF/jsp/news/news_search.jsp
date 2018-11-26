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
    
    <title>My JSP 'news_search.jsp' starting page</title>
    
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
<form name="newssearchform" action="news_search.action" method="post" target="news">
新闻列表：
<table class="table table-striped table-hover table-condensed">
<thead>
<tr>
	<th>编号</th>
	<th>新闻标题</th>
	<th>新闻内容</th>
	<th>新闻图片地址</th>
	<th>操作</th>
</tr>
</thead>
<tbody>
<c:forEach items="${newsList}" var="newinfo">
<tr>	
	<td>${newinfo.newsid}</td>
	<td>${newinfo.newstitle }</td>
	<td>${newinfo.newsdesc }</td>
	<td>${newinfo.newspicurl }</td>
	<td><a href="news_updatequery?newsid=${newinfo.newsid}">修改</a>
	<a href="news_delete?newsid=${newinfo.newsid}">删除</a>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

</form>
</div>
  </body>
</html>
