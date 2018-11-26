<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
    <div class="container"> 
<form name="qiuyuansearchform" action="qiuyuan_search.action" method="post" target="qiuyuan">
球员列表：<a href="qiuyuan.action">新增球员</a>
<table class="table table-striped table-hover table-condensed">
<thead>
<tr>
	<th>编号</th>
	<th>球员姓名</th>
	<th>球员位置</th>
	<th>身高</th>
	<th>体重</th>
	<th>出生年月</th>
	<th>所属球队</th>
	<th>操作</th>
</tr>
</thead>
<tbody>
<c:forEach items="${playerList}" var="qiuyuan">
<tr>	
	<td>${qiuyuan.id}</td>
	<td>${qiuyuan.name }</td>
	<td>${qiuyuan.weizhi }</td>
	<td>${qiuyuan.shengao }</td>
	<td>${qiuyuan.tizhong}</td>
	<td><fmt:formatDate value='${qiuyuan.shengti}' pattern='yyyy-MM-dd'/></td>
	<td>${qiuyuan.blengqiudui}</td>
	
	<td><a href="qiuyuanbyid?id=${qiuyuan.id}">修改</a>
	<a href="qiuyuan_delete?id=${qiuyuan.id}">删除</a>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

</form>
</div>
  </body>
</html>
