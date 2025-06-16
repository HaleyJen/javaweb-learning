package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/A03Request_Response")
public class A03Request_Response extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req获得数据
        String name = req.getParameter("name");// url?name=zhangSan

        //resp返回数据
        resp.setHeader("content-type", "text/html"); //设置成html
        resp.getWriter().write("<h1>" + name + ", Welcome! </h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
