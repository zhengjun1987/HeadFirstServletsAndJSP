<%@ taglib prefix="myadvice" uri="http://hpface.com/advice" %>
<%@ taglib prefix="classics" uri="http://mycompany.com/classic1" %>
<%@ taglib prefix="classics2" uri="http://mycompany.com/classic2" %>
<%@ taglib prefix="classics3" uri="http://mycompany.com/classic3" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/30
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自定义标签</title>
</head>
<body>
<myadvice:advice user="${param.userName}"/>
<hr>
<%-- body-content设置为empty之后标签的体要么为空，要么只能有<jsp:attribute>标签 --%>
<myadvice:advice>
    <jsp:attribute name="user">Liu Jianming</jsp:attribute>
</myadvice:advice>
<hr>
传统标记处理器1<br>
<classics:classic1/>
<hr>
传统标记处理器2<br>
<classics2:classic2/>
<hr>
传统标记处理器3<br>
<classics3:classic3>
    <h1>怎么说呢…回味一下，米划过手指抑或手指拂过米的那种触感，那是和指尖划黑板完全对立的另一个极端，
        <br>是白桃薯片在舌尖散开的桃子香气，是风吹动少年的白衬衫衣摆，是阳光洒在身上不冷不热刚好适合做梦的温度，可能这就是…初恋的味道叭。</h1>
</classics3:classic3>
</body>
</html>
