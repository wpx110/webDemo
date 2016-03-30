<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="index.do">mvc demo</a>
<p/>

<a href="other.do">另一种方式返回</a>
<p/>

<a href="test.do">再一种方式返回</a>
<p/>

<form action="login.do" method="post">
	name:<input type="text" name="username" />
	<p>
	password:<input type="password" name="password"/>
	<p>
	<input type="submit" value="submit" />
</form>

<form action="login2.do" method="post">
	name:<input type="text" name="username" />
	<p>
	password:<input type="password" name="password"/>
	<p>
	<input type="submit" value="submit" />
</form>

<!-- 测试拦截器，过滤器Demo -->
<form name="form" action="viewAll.do" method="post">
	name:<input type="text" name="name" />
	<p>
	password:<input type="text" name="pwd"/>
	<p>
	<input type="submit" value="submit" />
</form>

<p/>
====完整登陆后连库增删改例子=====================================
<a href="user.do?method=toLoginPage">进入登陆页面</a>
</body>
</html>