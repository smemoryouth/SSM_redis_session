<%--
  Created by IntelliJ IDEA.
  User: shilei
  Date: 2019/2/17
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<h1>Tomcat1的主页面</h1>
当前登陆用户：${user}
<table border="1">
    <caption>用户列表信息</caption>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <c:forEach var="user" items="${users}" varStatus="status">
        <tr>
        <td>${status.index+1}</td>
        <td>${user.value.name}</td>
        <td>${user.value.pwd}</td>
        <td>${user.value.age}</td>
        <td>${user.value.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
