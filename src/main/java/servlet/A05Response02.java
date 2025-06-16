package servlet;
/*
    resp的输出功能
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/A05Response02")
public class A05Response02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("02");

        //输出普通字符
        PrintWriter writer = resp.getWriter();
        writer.write("hello");

        //输出html
        resp.setHeader("content-type", "text/html");//告诉浏览器，用下面的格式解析。
        writer.write("<h1>hello</h1>");

        //输出文件，字节流


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
