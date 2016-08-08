<%--
  Created by IntelliJ IDEA.
  User: Sunsekey
  Date: 2016/7/12
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>aftersave</title>
</head>
<body>
${msg}
<input id="back" type="button" value="返回"/>
<script type="text/javascript">
    $("#back").on("click",function(){
        window.location.href = ctx + "/person/personList"
    });
</script>
</body>
</html>
