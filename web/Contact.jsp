<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contact Us</title>
</head>
<body>
<%--<%@ include file="Header.jsp" %>--%>
<jsp:include page="Header.jsp">
    <jsp:param name="subTitle" value="We take the sting out of SOAP."/>
</jsp:include>
<br>
<em>We can help.</em><br><br>
Contact us at:${initParam.mainEmail}
<br>
<%@ include file="Footer.html"%>
</body>
</html>
