<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css1.css">

</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function fun() {
		var value2 = {
			"china" : [ {
				"name" : "hangzhou",
				"item" : "1"
			}, {
				"name" : "shanghai",
				"item" : "2"
			}, {
				"name" : "sichuan",
				"item" : "3"
			} ],
			"America" : [ {
				"name" : "aa",
				"item" : "12"
			}, {
				"name" : "bb",
				"item" : "2"
			} ],
			"Spain" : [ {
				"name" : "cc",
				"item" : "1"
			}, {
				"name" : "dd",
				"item" : "23"
			}, {
				"name" : "ee",
				"item" : "3"
			} ]
		};
		for ( var country in value2) {
			for ( var attr in value2[country]) {
				for ( var key in value2[country][attr]) {
					document.writeln (value2[country][attr][key]);
				}
			document.writeln("<br>");
			}
			document.writeln("<br>");
			document.writeln("<br>");
			document.writeln("<br>");
		}

	}
</script>
<body>
	<h1>JSON示例</h1>
	<button id="button1" onclick="fun()" style="color: red">按钮</button>
</body>

</html>
