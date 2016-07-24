<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>userForm</title>
</head>
<body>
<div>
    <form id="userForm" action="/myproject2/user/save">
        姓名：<input type="text" name="name"/><br/>
        账号：<input type="text" name="account"/><br/>
        密码：<input type="password" name="password"/><br/>
        年龄：<input type="number" name="age"/><br/>
        性别：<input type="radio" name="sex" value="001"/>male
        <input type="radio" name="sex" value="002"/>female<br/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>
