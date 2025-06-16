<%@ page language="java" contentType="text/html; charset=GBK" %>
<%@ page import="util.RegisterFormBean" %>

<html>
<head>
    <title>�û�ע��</title>
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
    <h3>�û�ע��</h3>
    <div id="outer">
        <div class="group">
            <div class="ch">������</div>
            <div class="ip">
                <input type="text" name="name" value="${formBean.name}" />
                <span>${formBean.errors.name} ${DBMes}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">���룺</div>
            <div class="ip">
                <input type="text" name="password" />
                <span>${formBean.errors.password}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">ȷ�����룺</div>
            <div class="ip">
                <input type="text" name="password2" />
                <span>${formBean.errors.password2}</span>
            </div>
        </div>
        <div class="group">
            <div class="ch">���䣺</div>
            <div class="ip">
                <input type="text" name="email" />
                <span>${formBean.errors.email}</span>
            </div>
        </div>
    </div>
    <div id="bt">
        <input type="submit" value="ע��" />
        <input type="reset" value="����" />
    </div>
</form>
</body>
</html>
