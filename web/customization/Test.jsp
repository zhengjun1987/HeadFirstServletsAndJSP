<%@ taglib prefix="myadvice" uri="http://hpface.com/advice" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/30
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自定义标签</title>
</head>
<body>
    <myadvice:advice user="${param.userName}"/>
    <hr>
    <%-- body-content设置为empty之后标签的体要么为空，要么只能有<jsp:attribute>标签 --%>
    <myadvice:advice>
        <jsp:attribute name="user">Liu Jianming</jsp:attribute>
    </myadvice:advice>
</body>
</html>
