<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>比赛左部</title>
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
    <div class="container">
   <!--  <ul>
    <li><a href="match.action?id=1" target="match">录入比赛信息</a></li>
      <li> <a href="match.action?id=2" target="match">未完成比赛</a></li>
      <li> <a href="match.action?id=3" target="match">已结束比赛</a></li>
       </ul>    -->
   <div class="row">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" id="myNav">
                <li><a href="match.action?id=1" target="match">录入比赛信息</a></li>
                <li><a href="match.action?id=2" target="match">未完成比赛</a></li>
                <li><a href="match.action?id=3" target="match">已结束比赛</a></li>
               
            </ul>
        </div>
        <div class="col-xs-9">
        </div>
        </div>
        </div>
        <script type="text/javascript">
        $(function(){
        $("#myNav li").click(function(){
          $(this).siblings('li').removeClass('active');  // 删除其他兄弟元素的样式

        $(this).addClass('active');  
        })
        })
        </script>
  </body>
</html>
