<%@ page import="customizedTag.Movie" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="simpletags" uri="http://mycompany.com" %>
<%@ taglib prefix="simpletags2" uri="http://mycompany.com/simple2" %>
<%@ taglib prefix="simpletags3" uri="http://mycompany.com/simple3" %>
<%@ taglib prefix="simpletags4" uri="http://mycompany.com/simple4" %>
<%@ taglib prefix="simpletags5" uri="http://mycompany.com/simple5" %>
<%@taglib prefix="errors" uri="http://mycompany.com/error" %>
<html>
<head>
    <title>Contact Us</title>
</head>
<body>
<%--<%@ include file="Header.jsp" %>--%>
<jsp:include page="/import/Header.jsp">
    <jsp:param name="subTitle" value="We take the sting out of SOAP."/>
</jsp:include>
<br>
<em>We can help.</em><br><br>
Contact us at:${initParam.mainEmail}
<br>

<%
    Enumeration<String> names = request.getParameterNames();
    while (names.hasMoreElements()) {
        String element = names.nextElement();
        out.println(element + " => " + request.getParameter(element));
    }
%>
<br>
<hr>
简单标记处理器1
<br>
<simpletags:simple1/>
<hr>
简单标记处理器2
<br>
<simpletags2:simple2>
    This is the body.<br>
    ${initParam.mainEmail}<br>
    <simpletags:simple1/>
</simpletags2:simple2>
<hr>
简单标记处理器3
<br>
<simpletags3:simple3>
    The message is:${message}
</simpletags3:simple3>
<hr>
简单标记处理器4
<br>
<table>
    <simpletags4:simple4>
        <tr>
            <td>${movie}</td>
        </tr>
    </simpletags4:simple4>
</table>
<hr>
简单标记处理器5
<%
    Movie movie1 = new Movie("Fight Club", "Cult");
    Movie movie2 = new Movie("Titanic", "Love");
    Movie movie3 = new Movie("the Inception", "Fiction");
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    movieList.add(movie1);
    movieList.add(movie2);
    movieList.add(movie3);
    request.setAttribute("movieList",movieList);
%>
<br>
<table>
    <simpletags5:simple5 movies="${requestScope.movieList}">
        <tr>
            <td>${movie.name}</td>
            <td>${movie.genre}</td>
        </tr>
    </simpletags5:simple5>
</table>
<hr>
简单标记处理器6
<br>
<errors:error/>
<%-- 在此处抛出异常，后续标签都停止处理 --%>
<hr>
<%-- 使用include标记导入--%>
<%--<%@ include file="Footer.html"%>--%>

<%-- 使用自定义标记导入 --%>
<mytags:Footer page_dept="安西都护府">
    ${initParam.mainEmail}
</mytags:Footer>
</body>
</html>
