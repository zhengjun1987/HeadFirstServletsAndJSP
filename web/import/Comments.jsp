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
    <jsp:include page="/import/InputComments.jsp"/>
</c:if>

<c:choose>
    <c:when test="${requestScope.userType eq 'member'}">
        Now you can stop even if you <em>do</em> drive insanely fast.
    </c:when>
    <c:when test="${requestScope.userType eq 'guest'}">
        Our brakes will never lock up, no matter how bad a driver you are.
    </c:when>
    <c:otherwise>
        Our brakes are the best.
    </c:otherwise>
</c:choose>
</body>
</html>
