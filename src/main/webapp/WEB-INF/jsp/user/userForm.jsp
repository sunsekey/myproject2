<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/13
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userForm</title>
    <%@include file="../common/common.jsp" %>
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
<%--<script type="text/javascript">

    $(function () {
        alert("");
    });
    function serializeObject(form){
        var o={};
        $.each(form.serializeArray(),function(index){
            if(o[this['name']]){
                o[this['name']]=o[this['name']]+","+this['value'];
            }
            else{
                o[this['name']]=this['value'];
            }
        });
        return o;
    }
</script>--%>
</body>
</html>
