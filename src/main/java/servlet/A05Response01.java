package servlet;
/*
    resp的请求转发功能：1、不能共享数据；2、可以访问外界
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/A05Response01")
public class A05Response01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("01");

        //重定向
//        resp.sendRedirect("/A05Response02/A05Response02");//本地资源
        resp.sendRedirect("https://www.baidu.com"); //外部资源不需要/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
