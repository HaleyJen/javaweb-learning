

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
  <title>邮件查看</title>
</head>
<body>
<jsp:useBean id="email" class="pojo.Email" />
<jsp:setProperty name="email" property="*" />

<jsp:useBean id="encoding" class="util.CharactorEncoding" />

<div id="container">
  <div id="title">
    邮件标题：<%= encoding.toString(email.getTitle()) %>
  </div>
  <div id="content">
    邮件内容：<%= encoding.toString(email.getContent()) %>
  </div>
</div>
</body>
</html>

