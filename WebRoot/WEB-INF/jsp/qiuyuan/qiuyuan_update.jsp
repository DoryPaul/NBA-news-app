<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qiuyuan_update.jsp' starting page</title>
    
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
	 <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/WdatePicker.js"></script>
  </head>
  
  <body>
   <div class="container"> 
   <form action="qiuyuan_update.action" method="post">
    <input type="hidden" name="id" value="${player.id }"/>
    修改球员信息：
<table class="table table-striped table-bordered table-hover table-condensed">
<tr>
	<td>球员姓名</td>
	<td><input type="text"  class="form-control" name="name" value="${player.name }"/></td>
</tr>
<tr>
	<td>球员位置</td>
	<td><%-- <input type="text"   class="form-control" name="weizhi" value="${player.weizhi }"/> --%>
	 <select id="weizhi" name="weizhi" >
  <option value="${player.weizhi }">${player.weizhi}</option> 
  <option value="控球后卫">控球后卫</option> 
  <option value="得分后卫">得分后卫</option>
  <option value="小前锋">小前锋</option>
  <option value="大前锋">大前锋</option>
  <option value="中锋">中锋</option>
  </select>
	</td>
</tr>
<tr>
	<td>球员身高</td>
	<td><input type="text"   class="form-control" name="shengao" value="${player.shengao }"/></td>
</tr>
<tr>
	<td>球员体重</td>
	<td><input type="text"  class="form-control" name="tizhong" value="${player.tizhong }"/></td>
</tr>
<tr>
	<td>出生年月</td>
	<%-- <td><input class="easyui-datebox" name="shengti" value="<fmt:formatDate value='${player.shengti}' pattern='dd/MM/yyyy'/>" data-options="sharedCalendar:'#cc'" /><br>
	<div id="cc" class="easyui-calendar"></div></td> --%>
	<td><input class="Wdate" type="text" name="data" style="width: 120px;" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" value="<fmt:formatDate value='${player.shengti}' pattern='yyyy-MM-dd'/>"/></td>
</tr>
<tr>
	<td>所属球队</td>
	<td><%-- <input type="text"   class="form-control" name="blengqiudui" value="${player.blengqiudui }"/> --%>
	<select id="blengqiudui" name="blengqiudui" >
  <option value="${player.blengqiudui }">${player.blengqiudui}</option> 
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
  </select>
	
	</td>
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
