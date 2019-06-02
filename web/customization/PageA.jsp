<%--
  Created by IntelliJ IDEA.
  User: zhengjun
  Date: 2019/6/2
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>包含含有错误页面的父Page</title>
</head>
<body>
<%-- 这个include的页面中含有SkipPageException，但影响也就局限在这个导入的范围之内，不会影响其余部分的显示--%>
<jsp:include page="/import/Contact.jsp"/>
<%--SkipPageException只停止直接调用标记的页面--%>

<%--正常显示--%>
<mytags:Footer page_dept="包含含有错误页面的父Page"/>
</body>
</html>
