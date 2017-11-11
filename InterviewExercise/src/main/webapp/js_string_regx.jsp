<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function test() {
		var str = "abcdefg";
		if (/efg/.test(str))//判断是否存在efg
		{
			var efg = str.substr(str.indexOf("efg"), 3);
			alert(efg);
		}
	}
</script>
</head>
<body>

</body>
</html>