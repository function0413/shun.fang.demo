<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用Margin还是用Padding</title>
<style>
.top {
	width: 160px;
	height: 50px;
	background: #ccf;
}

.middle_2 {
	width: 160px;
	background: #cfc;
	padding: 20px 0px;
}

.middle_2 .firstChild {
	
}

.middle_2 .secondChild {
	margin-top: 15px;
}
</style>
</head>
<body>
	<div class="top"></div>
	<div class="middle_2">
		<div class="firstChild">我是firstChild，我只是想和我的父元素隔开点距离，这样看起来舒服</div>
		<div class="secondChild">我是secondChild，我要和楼上隔开点的距离。恩，能与底边有点呼吸距离就更好了。</div>
	</div>
</body>
</html>
