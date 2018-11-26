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
    
    <title>My JSP 'match_end.jsp' starting page</title>
    
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
    已结束比赛列表：
<table class="table table-striped  table-hover table-condensed">
<thead>
<tr>
	<th>编号</th>
	<th>客队</th>
	<th>主队</th>
	<th>时间</th>
	<th>状态</th>
	<th>得分</th>
		<!-- <td>操作</th> -->
</tr>
</thead>
<tbody>
<c:forEach items="${matchListend}" var="match">
<tr>	
	<td>${match.id}</td>
	<td>${match.player1}</td>
	<td>${match.player2}</td>
	<td>${match.time}</td>
	<td>${match.status}</td>
	<td>${match.score}</td>
	<%-- <td><a href="match_delete.action?id=${match.matchid}">删除</a></td> --%>

</tr>
</c:forEach>
</tbody>
</table>
</div>
  </body>
</html>
