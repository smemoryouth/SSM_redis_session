<%--
  Created by IntelliJ IDEA.
  User: shilei
  Date: 2019/2/17
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<h1>Tomcat1的登录页面</h1>
<form action="/login" method="post">
    <input type="text" name="name" placeholder="用户名"><br>
    <input type="password" name="pwd" placeholder="密码"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
