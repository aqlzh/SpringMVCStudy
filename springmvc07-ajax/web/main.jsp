<%--
  Created by IntelliJ IDEA.
  User: LZH.create
  Date: 2020/8/24
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<span>${username}</span>

<p>
    <a href="${pageContext.request.contextPath}/user/goOut">注销</a>
</p>
</body>
</html>
