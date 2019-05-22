<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
Welcome to our page!
<% if (request.getParameter("userName") == null) {%>
<jsp:forward page="HandleIt.jsp"/>
<% }%>
Hello, ${param.userName}
</body>
</html>
