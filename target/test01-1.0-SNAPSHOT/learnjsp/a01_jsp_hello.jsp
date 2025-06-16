
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--控制台输出--%>
<% System.out.println("hello");%>

<%--屏幕输出 --%>
<%= "Hello JSP"%>

<%--成员--%>
<%!
    int a = 10;
%>
<%=
    a
%>

</body>
</html>
