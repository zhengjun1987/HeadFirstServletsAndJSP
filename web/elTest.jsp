<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tester</title>
</head>
<body>
<jsp:useBean id="person" type="foo.Person" scope="request"/>
<h1>${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name}, ${person.dog.toys[1].name} and ${person.dog.toys[2].name}.</h1>
<p></p>
<div class="tipBox">
    <b>Tip of the Day:</b><br/><br/>
    ${applicationScope.currentTip}
    <p>
        ${pageContext.request.method}
    </p>
</div>
</body>
</html>
