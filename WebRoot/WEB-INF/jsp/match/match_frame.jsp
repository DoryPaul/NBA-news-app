<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图片</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/style.css">

<script src="js/jquery-1.12.3.min.js"></script>
<script src="js/PicCarousel.js"></script>
  </head>
  
  <body>
  <div class="container">
<div class="poster-main A_Demo">
	<div class="poster-btn poster-prev-btn"></div>
	<ul class="poster-list">
		<li class="poster-item"><img src="img/1.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/2.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/3.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/4.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/5.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/6.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/7.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/8.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/9.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/10.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/11.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/12.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/13.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/14.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/15.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/16.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/17.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/18.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/19.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/20.jpg" width="100%" ></li>
		<li class="poster-item"><img src="img/21.jpg" width="100%" ></li>
	</ul>
	<div class="poster-btn poster-next-btn"></div>
</div>

<script>

$(".A_Demo").PicCarousel("init");

</script>
</div>

  </body>
</html>
