<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/25
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<%@ page import="beerV1.Dog" %>
<html>
<head>
    <title>Beer Recommendation JSP</title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
<%! static int count = 0;%>
<%!
    static int getCount() {
        return ++count;
    }
%>
<%=5 > 3 %>
<p>
<%=false %>
<p>
<%=27 %>
<p>
<%=getCount() %>
<p>
<%=getCount() %>
<p>
<%=27 * 42 %>
<p>
<%="27"%>
<p>
<%=new String[3]%>
<p>
<%=Math.random()%>
<p></p>
<%
    List styles = (List) request.getAttribute("styles");
    for (Object style : styles) {
        out.print("<br> Try " + style);
    }
    Dog dog = (Dog) getServletConfig().getServletContext().getAttribute("dog");
    out.println("\nDog's breed is " + dog.getBreed());
    out.println("\nE-mail:" + request.getAttribute("adminEmail"));
    out.println("\nE-mail:" + getServletConfig().getServletContext().getInitParameter("mainEmail"));

    pageContext.setAttribute("foo", 22.4f);
    Float foo = (Float) pageContext.getAttribute("foo");

    Object findFoo = pageContext.findAttribute("foo");
%>
</body>
</html>
