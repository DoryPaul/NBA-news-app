<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qiuyuan_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
      <script language="javascript" type="text/javascript" src="js/WdatePicker.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <jsp:include page="/WEB-INF/jsp/head.jsp"></jsp:include>
    <div style="padding: 30px 500px 10px;">
    <form action="qiuyuan_add.action" method="post">
     <div class="input-group input-group-sm" >
        球员姓名：<input type="text" class="form-control" name="name" ><br>
        </div>
         <div class="input-group input-group-sm" >
  位&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置：
  <!-- <input type="text"  class="form-control" name="weizhi" > -->
  <select id="weizhi" name="weizhi" >
  <option value="">请选择位置</option> 
  <option value="控球后卫">控球后卫</option> 
  <option value="得分后卫">得分后卫</option>
  <option value="小前锋">小前锋</option>
  <option value="大前锋">大前锋</option>
  <option value="中锋">中锋</option>
  </select><br>
  </div>
   <div class="input-group input-group-sm" >
  身&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;高：<input type="text" class="form-control" name="shengao" ><br>
  </div>
   <div class="input-group input-group-sm" >
   体&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;重：<input type="text" class="form-control" name="tizhong" ><br>
   </div>
    <div class="input-group input-group-sm" >
   出生年月：<input class="Wdate" type="text" name="data" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})"/><br>
   </div>
    <div class="input-group input-group-sm" >
   所属球队：<!-- <input type="text" class="form-control" name="blengqiudui" ><br> -->
    <select id="blengqiudui" name="blengqiudui" >
  <option value="">请选择球队</option> 
  <option value="洛杉矶快船">洛杉矶快船</option> 
  <option value="金州勇士">金州勇士</option>
  <option value="克里夫兰骑士">克里夫兰骑士</option>
  <option value="芝加哥公牛">芝加哥公牛</option>
  <option value="俄克拉荷马雷霆">俄克拉荷马雷霆</option>
  <option value="圣安东尼奥马刺">圣安东尼奥马刺</option>
  <option value="休斯顿火箭">休斯顿火箭</option>
  <option value="犹他爵士">犹他爵士</option>
  <option value="孟菲斯灰熊">孟菲斯灰熊</option>
  <option value="丹佛掘金">丹佛掘金</option>
  <option value="新奥尔良鹈鹕">新奥尔良鹈鹕</option>
  <option value="达拉斯小牛">达拉斯小牛</option>
   <option value="萨克拉门托国王">萨克拉门托国王</option>
    <option value="明尼苏达森林狼">明尼苏达森林狼</option>
    <option value="洛杉矶湖人">洛杉矶湖人</option>
    <option value="菲尼克斯太阳">菲尼克斯太阳</option>
    <option value="波士顿凯尔特人">波士顿凯尔特人</option>
    <option value="多伦多猛龙">多伦多猛龙</option>
    <option value="华盛顿奇才">华盛顿奇才</option>
    <option value="亚特兰大老鹰">亚特兰大老鹰</option>
    <option value="密尔沃基雄鹿">密尔沃基雄鹿</option>
    <option value="印第安纳步行者">印第安纳步行者</option>
    <option value="迈阿密热火">迈阿密热火</option>
    <option value="底特律活塞">底特律活塞</option>
    <option value="夏洛特黄蜂">夏洛特黄蜂</option>
    <option value="纽约尼克斯">纽约尼克斯</option>
    <option value="奥兰多魔术">奥兰多魔术</option>
    <option value="费城76人">费城76人</option>
    <option value="布鲁克林篮网">布鲁克林篮网</option>
    <option value="波特兰开拓者">波特兰开拓者</option>
  </select><br>
   </div>
   <div class="input-group input-group-sm" >
   头像地址：<input type="text" class="form-control" name="qiuyuanpicurl" ><br>
   </div>
   <div class="input-group input-group-sm" >
   工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资：<input type="text" class="form-control" name="gongzi" ><br>
   </div>
    <div class="input-group input-group-sm" >
   场均得分：<input type="text" class="form-control" name="score" ><br>
   </div>
   <div class="input-group input-group-sm" >
   场均助攻：<input type="text" class="form-control" name="assist" ><br>
   </div>
   <div class="input-group input-group-sm" >
   场均盖帽：<input type="text" class="form-control" name="block" ><br>
   </div>
   <div class="input-group input-group-sm" >
   场均篮板：<input type="text" class="form-control" name="rebound" ><br>
   </div>
   <div class="input-group input-group-sm" >
   场均抢断：<input type="text" class="form-control" name="steal" ><br>
   </div>
   <button type="submit"  class="btn default-btn">提交</button>
    </form>
    </div>
    </body>
</html>
