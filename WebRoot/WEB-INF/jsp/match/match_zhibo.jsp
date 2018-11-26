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
    
    <title>My JSP 'match_zhibo.jsp' starting page</title>
    
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
   
   <form action="matchzhibo.action" method="post">
   <input type="submit"  id="start" value="start" class="btn default-btn"/>
   <input type="submit" id="stop" value="stop" class="btn default-btn"/>
   <input type="submit" id="end" value="end" class="btn default-btn"/>
    <input type="hidden" name="matchid" value="${match.id }"/>
 比赛状态<input type="text" class="form-control" name="status" id="status" value="${match.status}" />
     <input type="hidden" name="name" value="${username}"/>
    <table class="table table-striped table-bordered table-hover table-condensed">
    <tr>
        <td>客队</td>
    <td> ${match.player1}   </td>
    
    </tr>
    <tr>
    <td>主队</td>
    <td> ${match.player2}   </td>
    </tr>
     <tr>
        <td>得分</td>
    <td><input type="text" class="form-control"name="score" id="team1score" value="${match.score}" />
    <input type="submit" id="change" value="修改" class="btn default-btn"/>
    <!-- <input type="submit" id="team1score1" value="1分" class="btn default-btn"/>
         <input type="submit" id="team1score2" value="2分" class="btn default-btn"/>
         <input type="submit" id="team1score3" value="3分" class="btn default-btn"/>
        <input type="submit" id="team1score4" value="减1分" class="btn default-btn"/> -->
    </td>
   <%--  <td><input type="text" class="form-control" name="score" id="team2score" value="${match.score}"/>
      <input type="submit" id="team2score1" value="1分" class="btn default-btn"/>
         <input type="submit" id="team2score2" value="2分" class="btn default-btn"/>
         <input type="submit" id="team2score3" value="3分" class="btn default-btn"/>
        <input type="submit" id="team2score4" value="减1分" class="btn default-btn"/>
    </td> --%>
    </tr>
    <tr>
        <td>比赛时间</td>
    <td><%-- <input type="text" class="form-control" name="time" id="team1support"  value="${match.time}"/> --%>
    ${match.time}
    <!-- <input type="submit" id="team1support1" value="支持" class="btn default-btn"/> --></td>
    <%-- <td><input type="text" class="form-control" name="time" id="team2support" value="${match.time}"/>
       <input type="submit" id="team2support1" value="支持" class="btn default-btn"/></td> --%>
    </tr>
    </table>
  <input type="text" class="form-control" name="content"  id="content" style="width: 85%; "/><input type="submit" value="发表"  style="width: 10%; " class="btn default-btn"/>
<br>
<table width="100%" border=1>
<c:forEach items="${zhiboList}" var="zhiboList">
${zhiboList.name }&nbsp;:&nbsp;${zhiboList.content }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value='${zhiboList.time}' pattern='yyyy-MM-dd hh:mm:ss'/><br>
</c:forEach>
</table>
    </form>
    </div>
       
 
    <script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
 <script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
/* var score1=${match.score};
var score2=${match.score};
var support1=${match.time};
var support2=${match.time}; */
var zhuangtai='${match.status}';
/* $("#team1score1").on("click",function(){
score1=score1+1;
document.getElementById("team1score").value=score1;
 })
 $("#team1score2").on("click",function(){
score1=score1+2;
document.getElementById("team1score").value=score1;
 })
 $("#team1score3").on("click",function(){
score1=score1+3;
document.getElementById("team1score").value=score1;
 })
 $("#team1score4").on("click",function(){
score1=score1-1;
document.getElementById("team1score").value=score1;
 })
 
 $("#team2score1").on("click",function(){
score2=score2+1;
document.getElementById("team2score").value=score2;
 })
 $("#team2score2").on("click",function(){
score2=score2+2;
document.getElementById("team2score").value=score2;
 })
 $("#team2score3").on("click",function(){
score2=score2+3;
document.getElementById("team2score").value=score2;
 })
 $("#team2score4").on("click",function(){
score2=score2-1;
document.getElementById("team2score").value=score2;
 })
 
 $("#team1support1").on("click",function(){
support1=support1+1;
document.getElementById("team1support").value=support1;
 })
 
 $("#team2support1").on("click",function(){
support2=support2+1;
document.getElementById("team2support").value=support2;
 }) */
 $("#start").on("click",function(){

document.getElementById("status").value='1';
 })
 $("#stop").on("click",function(){

document.getElementById("status").value='0';
 })
  $("#end").on("click",function(){

document.getElementById("status").value='2';
 })
</script> 
  </body>
</html>
