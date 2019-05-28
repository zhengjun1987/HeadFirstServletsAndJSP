<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member Comments</title>
</head>
<body>
<strong>Member Comments</strong>
<hr>This site rocks.
<hr>This site is cool.
<hr>This site is stupid.<hr>
<c:if test="${requestScope.userType eq 'member'}">
    <jsp:include page="InputComments.jsp"/>
</c:if>
</body>
</html>
