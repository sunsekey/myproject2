<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>userForm</title>
</head>
<body>
<div>
    <form id="userForm" action="${ctx}/user/save">
        姓名：<input type="text" name="name" value="${user.name}"/><br/>
        账号：<input type="text" name="account" value="${user.account}"/><br/>
        密码：<input type="password" name="password" value="${user.password}"/><br/>
        年龄：<input type="number" name="age" value="${user.age}"/><br/>
        性别：<input type="radio" name="sex" value="001"/>male
        <input type="radio" name="sex" value="002"/>female<br/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>
