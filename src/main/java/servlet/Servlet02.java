package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")  // 访问路径为：http://localhost:8080/项目名/loginServlet
public class Servlet02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h2>这是 GET 请求，页面用于测试。</h2>");
        System.out.println("处理 GET 请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h2>POST 登录成功！</h2>");
        resp.getWriter().write("<p>用户名：" + username + "</p>");
        resp.getWriter().write("<p>密码：" + password + "</p>");

        System.out.println("处理 POST 请求：用户名 = " + username + "，密码 = " + password);
    }
}
