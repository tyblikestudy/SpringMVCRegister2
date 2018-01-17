<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVCRegister/user/defaultUserRegister" method="post">
		用户名：<input type="text" name="name" ><br>
		密 码：<input type="password" name="password" ><br>
		性别：<input type="text" name="text"><br>
		职业：<select>
			<option value="老师">老师</option>
			<option value="学生">学生</option>
			<option value="教练">教练</option>
		</select>
		<br>
		<input type="submit" value="注册">
		<input type="reset" value="重置">
	</form>
	${mess }
</body>
</html>