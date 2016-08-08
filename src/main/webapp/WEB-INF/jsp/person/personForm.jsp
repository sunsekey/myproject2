<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>personForm</title>
</head>
<body>
<div>
    <form id="userForm" action="${ctx}/person/save">
        <input type="hidden" name="id" value="${person.id}"/>
        姓名：<input type="text" name="name" value="${person.name}"/><br/>
        年龄：<input type="number" name="age" value="${person.age}"/><br/>
        性别：<input type="radio" name="sex" value="1" <c:if test="${person.sex == 1}">checked</c:if>>male
        <input type="radio" name="sex" value="2" <c:if test="${person.sex == 0}">checked</c:if>/>female<br/>
        <input type="submit" value="提交"/>
    </form>
    <a href="${ctx}/person/personList">返回列表</a>
</div>
</body>
</html>
