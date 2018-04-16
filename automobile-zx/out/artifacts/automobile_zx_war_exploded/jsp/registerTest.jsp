<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2018/4/15
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/UserServlet?method=register" method="post">
    手机号：<input type="text" name="phone"><br>
    验证码：<input type="text" name="checkCode"><br>
    校验码：<input type="text" name="verifyCode"><br>
    设置密码：<input type="password" name="uPassword"><br>
    <input type="submit" value="注册">

    <%--<script type="text/javascript">--%>
    <%--<c:if test="${sessionScope.row <=0 }">--%>
            <%--alert("用户已存在，请重新注册！！！")--%>
    <%--</c:if>--%>
    <%--</script>--%>
</form>
</body>
</html>
