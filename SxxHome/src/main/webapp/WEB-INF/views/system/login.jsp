<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>思学行后台管理</title>
<meta name="viewport" content="width=device-width">
<link href="${pageContext.request.contextPath}/public/css/base.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/public/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="login">
<form action="Userlogin" method="post" id="form">
	<div class="logo"></div>
    <div class="login_form">
    	<div class="user">
        	<input class="text_value" value="" name="name" type="text" />
            <input class="text_value" value="" name="password" type="password"/>
        </div>
        <button class="button" id="submit" type="submit">登录</button>
    </div>
    
    <div id="tip"></div>
    <div class="foot">
    Copyright © 2018-2028  All Rights Reserved. More Templates 
    </div>
    </form>
</div>
<script>var basedir='public/ui/';</script>
<script src="${pageContext.request.contextPath}/public/ui/do.js"></script>
<script src="${pageContext.request.contextPath}/public/ui/config.js"></script>
<script>
Do.ready('form', function() {
	$("#form").Validform({
			ajaxPost:true,
			postonce:true,
			tiptype:function(msg,o,cssctl){
				if(!o.obj.is("form")){
					var objtip=o.obj.siblings(".Validform_checktip");
					cssctl(objtip,o.type);
					objtip.text(msg);
				}else{
					var objtip=o.obj.find("#tip");
					cssctl(objtip,o.type);
					if(o.type==2){
						window.location.href='index.php?r=admin/index/index';
					}else{
						objtip.text(msg);
					}
				}
			}
	});
});

</script>
</body>
</html>

