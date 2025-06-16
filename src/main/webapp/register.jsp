<%--
  Created by IntelliJ IDEA.
  User: Jen
  Date: 2025/6/5
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入其他文件--%>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>注册新用户</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<h2 class="title">注册新用户</h2>
<form action="RegisterServlet" method="post" class="form">
  用户名*：<input type="text" name="username" placeholder="请输入用户名"><br/>
  邮箱*：<input type="email" name="email" placeholder="请输入邮箱"><br/>
  密码：<input type="password" name="password" placeholder="请输入密码"><br/>
  收货人：<input type="text" name="receiverName" placeholder="请输入收货人"><br/>
  联系电话：<input type="text" name="phone" placeholder="请输入联系电话"><br/>
  收货地址：<input type="text" name="address" placeholder="请输入收货地址"><br/>
  <input type="submit" value="提交">
</form>

<%@ include file="footer.jsp" %>
</body>
</html>
