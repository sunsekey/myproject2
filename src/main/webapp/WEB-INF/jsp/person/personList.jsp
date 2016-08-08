<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>personList</title>
</head>
<body>
<div>
    <input type="button" value="add" id="add"/>
    <br/>
    <c:forEach items="${personList}" var="person" varStatus="status">
        <div>
            No.${status.index + 1}:${person.name}
            [在想：
            <c:forEach items="${person.ideas}" var="idea">
                <c:if test="${commaFlag}">,</c:if>
                ${idea.content}
                <c:set var="commaFlag" scope="request" value="true"></c:set>
            </c:forEach>]
            <c:set var="commaFlag" scope="request" value="false"></c:set>
            <input name="pId" value="${person.id}" type="hidden"/>
            <input type="button" value="edit" name="edit"/>
            <input type="button" value="delete" name="delete"/>
        </div>
    </c:forEach>
</div>
<script type="text/javascript">
    $("#add").on("click", function () {
        to(ctx + "/person/personForm?id=0");
    });

    $("input[name='edit']").on("click", function () {
        var id = $(this).parent().find("input[name='pId']").val();
        var url = ctx + "/person/personForm?id=" + id;
        window.location.href = url;
    });

    $("input[name='delete']").on("click", function () {
        var id = $(this).parent().find("input[name='pId']").val();
        var parent = $(this).parent();
        var url = ctx + "/person/delete";
        var param = {
            id: id
        };
        $.ajax({
            url: url, data: param, success: function (data) {
                if (data.success) {
                    alert("删除成功");
                    $(parent).remove();
                }
                else {
                    alert("删除失败");
                }
            }, dataType: "json"
        });
    });
</script>
</body>
</html>
