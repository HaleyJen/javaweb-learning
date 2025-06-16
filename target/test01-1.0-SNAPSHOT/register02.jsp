<%@ page language="java" contentType="text/html; charset=GBK" %>
<%@ page import="util.RegisterFormBean" %>

<html>
<head>
    <title>用户注册</title>
    <style type="text/css">
        .ch { width: 80px; float: left; text-align: right; }
        .ip { margin-left: 10px; float: left; }
        #outer { width: 750px; }
        .group { overflow: hidden; margin-bottom: 10px; }
        #bt input { margin-right: 30px; }
        span { color: #ff0000; }
    </style>
</head>
<body>
<form action="ControllerServlet" method="post">
    <h3>用户注册</h3>
    <div id="outer">
        <div class="group">
            <div class="ch">姓名：</div>
            <div class="ip">
                <input type="text" name="name" value="${formBean.name}" />
                <span>${formBean.errors.name} ${DBMes}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">密码：</div>
            <div class="ip">
                <input type="text" name="password" />
                <span>${formBean.errors.password}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">确认密码：</div>
            <div class="ip">
                <input type="text" name="password2" />
                <span>${formBean.errors.password2}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">邮箱：</div>
            <div class="ip">
                <input type="text" name="email" />
                <span>${formBean.errors.email}</span>
            </div>
        </div>
    </div>
    <div id="bt">
        <input type="submit" value="注册" />
        <input type="reset" value="重置" />
    </div>
</form>
</body>
</html>
