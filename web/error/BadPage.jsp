<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="ErrorPage.jsp" %>--%>
<html>
<head>
    <title>Bad</title>
</head>
<body>
About to do a risky thing:
<c:catch var="ex">
    <% int x = 10/0; %>
</c:catch>
<br>
If you see this, we survived from ${ex.toString()}.
Message: ${ex.localizedMessage}
</body>
</html>
