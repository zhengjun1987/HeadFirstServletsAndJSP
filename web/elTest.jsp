<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="DiceFunctions" %>
<html>
<head>
    <title>Tester</title>
</head>
<body>
<jsp:useBean id="person" type="foo.Person" scope="request"/>
<h1>${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name}, ${person.dog.toys[1].name}
    and ${person.dog.toys[2].name}.</h1>
<p></p>
<div class="tipBox">
    <b>Tip of the Day:</b><br/><br/>
    ${applicationScope.currentTip}
    <p>
        Roll a dice: ${mine:rollIt()}
        <br>
        ${pageContext.request.method}
        ${cookie.userName.value}
        <br>

        <%--${initParam.mainEmail}--%>
    </p>


    requestScope.num > 3 == ${requestScope.num > 3}
    <br>
    requestScope["integer"] ne 4 and 6 le requestScope.num || false
    == ${requestScope["integer"] ne 4 and 6 le requestScope.num || false}
    <br>
    requestScope.integer le 12 == ${requestScope.integer le 12}
    <br>
    requestScope.num > requestScope.interger == ${requestScope.num > requestScope.interger}
    <br>
    requestScope.list[0] || requestScope["1"] and true == ${requestScope.list[0] || requestScope["1"] and true}
    <br>

    <jsp:useBean id="dog" class="foo.Dog">
        <jsp:setProperty name="dog" property="name" value="${requestScope.list[1]}"/>
    </jsp:useBean>

    dog.name and true == ${dog.name and true}
    <br/>
    42 div 0 == ${42 div 0}
</div>
</body>
</html>
