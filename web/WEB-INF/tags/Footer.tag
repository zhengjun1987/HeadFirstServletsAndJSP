<%@attribute name="page_dept" required="true" %>
<%@ tag body-content="scriptless" %>
<%--
  Created by IntelliJ IDEA.
  User: zhengjun
  Date: 2019/6/1
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<h2>
    <center>联系我们</center>
</h2>
<h4>
    <center>${page_dept}</center>
</h4>
<h4>
    <center>
        <jsp:doBody/>
    </center>
</h4>
<h4>
    <center>${initParam.mainEmail}</center>
</h4>
