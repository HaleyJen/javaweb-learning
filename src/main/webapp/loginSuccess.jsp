<%--
  Created by IntelliJ IDEA.
  User: haley
  Date: 2025/6/8
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="pojo.UserBean" %>

<html>
<head>
    <title>login successfully</title>
    <style type="text/css">
        #main { width: 500px; height: auto; }
        #main div { width: 200px; height: auto; }
        ul { padding-top: 1px; padding-left: 1px; list-style: none; }
    </style>
</head>
<body>
<%
    if (session.getAttribute("userBean") == null) {
%>
<jsp:forward page="register.jsp" />
<%
        return;
    }
%>
<div id="main">
    <div id="welcome">��ϲ�㣬ע��ɹ�</div>
    <ul>
        <li>�������: ${userBean.name}</li>
        <li>�������: ${userBean.email}</li>
    </ul>
</div>
</body>
</html>
