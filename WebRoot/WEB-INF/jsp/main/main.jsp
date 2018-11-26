<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
  </head>
  
  <body>
    <jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
    
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h1>欢迎来到NBA首页</h1>
            <p>Welcome to the NBA！
              <br>
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center text-primary">Player</h1>
            <p class="text-center">This is why we play！</p>
          </div>
        </div>
        <div class="row">
          <div class="col-md-4">
            <img src="http://nbachina.qq.com/media/img/players/head/260x190/101108.png"
            class="center-block img-circle img-responsive">
            <h3 class="text-center">Chris Paul</h3>
            <p class="text-center">Point Guard</p>
          </div>
          <div class="col-md-4">
            <img src="http://nbachina.qq.com/media/img/players/head/260x190/201939.png"
            class="center-block img-circle img-responsive">
            <h3 class="text-center">Stephen &nbsp;Curry</h3>
            <p class="text-center">Point Guard</p>
          </div>
          <div class="col-md-4">
            <img src="http://china.nba.com/media/img/players/head/260x190/201142.png"
            class="center-block img-circle img-responsive">
            <h3 class="text-center">Kevin Durant</h3>
            <p class="text-center">Small Forward</p>
          </div>
        </div>
       
      </div>
        
    </div>
   <div>
   
   </div>
  </body>
</html>
