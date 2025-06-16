package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet 初始化：init() 被调用");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet 处理请求：service() 被调用");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h1>Hello, Servlet!</h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet 销毁：destroy() 被调用");
    }
}
