<%@ attribute name="subTitle" required="true" rtexprvalue="true" %>
<%@ attribute name="fontColor" required="true" %>
<%@ tag body-content="tagdependent" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 16:39
--%>
<img src="../images/timg.jpg"/><br/>
<em><strong>${subTitle}</strong></em>
<br>
<%-- 引用标签body-content --%>
<em><strong><font color="${fontColor}"> <jsp:doBody/></font></strong></em>

