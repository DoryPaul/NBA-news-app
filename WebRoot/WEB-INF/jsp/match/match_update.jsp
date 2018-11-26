<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'match_update.jsp' starting page</title>
    
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
    <form action="match_update.action" method="post">
    <input type="hidden" name="matchid" value="${match.id }"/>
    <table class="table table-striped table-bordered table-hover table-condensed">
    <tr>
        <td>项目</td>
    <td>客队</td>
    <td>主队</td>
    </tr>
    <tr>
        <td>球队名</td>
    <td><input type="text" class="form-control" name="player1"  value="${match.player1}"/></td>
    <td><input type="text" class="form-control" name="player1"  value="${match.player2}"/></td>
    </tr>
     <tr>
        <td>得分</td>
    <td><input type="text" class="form-control" name="score" value="${match.score}"/></td>
    <td><input type="text" class="form-control" name="score" value="${match.score}"/></td>
    </tr>
    <tr>
        <td>支持率</td>
    <td><input type="text" class="form-control" name="team1support" value="${match.time}"/></td>
    <td><input type="text" class="form-control" name="team2support" value="${match.time}"/></td>
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
