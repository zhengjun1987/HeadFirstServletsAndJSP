<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/25
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Beer Recommendation JSP</title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
<p></p>
<%
    List styles = (List) request.getAttribute("styles");
    for (Object style : styles) {
        out.print("<br> Try " + style);
    }
%>
</body>
</html>
