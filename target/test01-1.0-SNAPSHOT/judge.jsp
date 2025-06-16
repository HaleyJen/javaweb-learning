
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    <jsp:useBean id="username" class="pojo.Username" scope="page" />
        1、使用pojo.Username，创建对象。（这个对象，是用来保存“封装”，表单数据的。）
        2、将对象命名为username。
        3、scope="page"为生命周期，及当前页面有效。
    <jsp:setProperty name="username" property="*" />
        将表单中提供的数据，用对象全部封装。
    <jsp:getProperty name="username" property="username" />
        使用对象的方法，及get方法。（因为变量默认采用封装，只有用方法获取）

--%>
<jsp:useBean id="username" class="pojo.Username" scope="page" />
<jsp:setProperty name="username" property="*" />

<html>
<head>
    <title>验证反馈页面</title>
</head>
<body style="font-size: 20px;">
用户名：<jsp:getProperty name="username" property="username" /><br/>
是否有效：<jsp:getProperty name="username" property="isval" /><br/>
提示信息：<jsp:getProperty name="username" property="tip" />
</body>
</html>

