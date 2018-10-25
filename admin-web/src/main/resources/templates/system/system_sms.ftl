<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>角色列表页</title>
	<#include "../layout/stylesandscripts.ftl">
</head>
<body>
<div class="layui-layout layui-layout-admin">
	<#include "../layout/header.ftl">

	<#include "../layout/menu_navigation.ftl">

	<div class="layui-body">
		<!-- 内容主体区域 -->
		<div style="padding: 15px;">
			<span class="layui-breadcrumb">
  				<a href="">短信管理</a>
  				<a><cite>发送短信</cite></a>
			</span>
		</div>
	</div>
	<#include "../layout/footer.ftl">
</div>




<script>
    //JavaScript代码区域
    layui.use(['element','table','form'], function(){
        var element = layui.element;
        var table=layui.table;
		var form=layui.form;
    });
</script>
</body>
</html>