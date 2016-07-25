<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../global/meta.jsp" %>
<html>
<head>
    <title>userList</title>
</head>
<body>
<div>
    <input type="button" value="add" id="add"/>
    <br/>
    <c:forEach items="${userList}" var="user" varStatus="status">
        <div>
            No.${status.index + 1}:${user.name}
            <input name="uId" value="${user.id}" type="hidden"/>
            <input type="button" value="edit" name="edit"/>
            <input type="button" value="delete" name="delete"/>
        </div>
    </c:forEach>
</div>
<script type="text/javascript">
    $("#add").on("click", function () {
        to(ctx + "/user/userForm");
    });

    $("input[name='edit']").on("click", function () {
        var id = $(this).parent().find("input[name='uId']").val();
        var url = ctx + "/user/userForm?id=" + id;
        window.location.href = url;
    });

    $("input[name='delete']").on("click", function () {
        var id = $(this).parent().find("input[name='uId']").val();
        var parent = $(this).parent();
        var url = ctx + "/user/delete";
        var param = {
            id: id
        };
        $.ajax({
            url: url, data: param, success: function (data) {
                if (data.success) {
                    alert("删除成功");
                    $(parent).remove();
                }
                else{
                    alert("删除失败");
                }
            }, dataType: "json"
        });
    });
</script>
</body>
</html>
