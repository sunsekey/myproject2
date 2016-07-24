<%--
  Created by IntelliJ IDEA.
  User: Sunsekey
  Date: 2016/7/6
  Time: 21:38
  定义页面全局变量
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/javascript" src="${ctx}/resources/js/myproject2/global/global.js"></script>--%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<input id="pageContext" value="${ctx}" type="hidden"/>
