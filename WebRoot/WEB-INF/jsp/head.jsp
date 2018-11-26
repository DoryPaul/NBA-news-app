<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>顶部</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div id="main" class="container " style="height:30px;">

		<ul class="lead nav nav-justified nav-pills">

			<li id="head_main"><a href="main.action">首页</a></li>
			<li id="head_match"><a href="matchmain.action" target="_self">比赛直播</a>
			</li>
			<li id="head_news"><a href="newsmain.action">新闻管理</a></li>
			<li id="head_player"><a href="qiuyuan_search.action">球员管理</a></li>


			<!-- <li id="head_yonghu">
<a href="userList.action">用户管理</a>
</li>
<li class="divider"></li>
<li id="head_logout">
<a href="logout.action">注销</a>
</li> -->
			<!-- <li class="dropdown"><a href="#" id="myTabDrop1"
				class="dropdown-toggle" data-toggle="dropdown">用户 <b
					class="caret"></b>
			</a>
				<ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1"> -->
					<li id="head_yonghu"><a href="userList.action">用户管理</a></li>
					<!-- <li class="divider"></li> -->
					<li id="head_logout"><a href="logout.action">注销</a></li>
				<!-- </ul></li> -->
		</ul>
	</div>

	<script type="text/javascript">
		$("#head_main").on("click", function() {
			window.location.href = "main.action"
		})
		$("#head_match").on("click", function() {
			window.location.href = "matchmain.action"
		})
		$("#head_news").on("click", function() {
			window.location.href = "newsmain.action"
		})
		$("#head_player").on("click", function() {
			window.location.href = "qiuyuan_search.action"
		})
		$("#head_yonghu").on("click", function() {
			window.location.href = "userList.action"
		})
		$("#head_logout").on("click", function() {
			window.location.href = "logout.action"
		})
	</script>
</body>

<br>
</html>

