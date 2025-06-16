package servlet;
/*
    Cookie的接收和使用
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/A06Cookie")
public class A06Cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1 创建Cookie
        Cookie cookie = new Cookie("username", "HaleyJen");

        //2 发送
        resp.addCookie(cookie);

        //3 接收所有cookie
        Cookie[] cookies = req.getCookies();

        //4 遍历输出
        String name, value;
        for (Cookie cookie1 : cookies){
            name = cookie1.getName();
            if ("username".equals(name)){
                value = cookie1.getValue();
                System.out.println(name + " " + value);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
