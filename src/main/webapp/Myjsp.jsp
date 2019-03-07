<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/03/04
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="a">
        ${a.id}
        ${a.name}
        ${a.age}
        ${a.mail}
    </c:forEach>
</body>
</html>
