package servlet;


import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import pojo.UserBean;
import util.DBUtil;
import util.RegisterFormBean;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=GBK");
        request.setCharacterEncoding("GBK");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");

        RegisterFormBean formBean = new RegisterFormBean();
        formBean.setName(name);
        formBean.setPassword(password);
        formBean.setPassword2(password2);
        formBean.setEmail(email);

        //判断用户名、邮箱等格式
        if (!formBean.validate()) {
            request.setAttribute("formBean", formBean);
            request.getRequestDispatcher("/register02.jsp").forward(request, response);
            return;
        }

        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setEmail(email);

        //根据数据库，判断用户名是否存在
        boolean b = DBUtil.getInstance().insertUser(userBean);
        if (!b) {
            request.setAttribute("DBMes", "你注册的用户名已存在");
            request.setAttribute("formBean", formBean);
            request.getRequestDispatcher("/register02.jsp").forward(request, response);
            return;
        }

        request.getSession().setAttribute("userBean", userBean);
        response.setHeader("Refresh", "3;URL=loginSuccess.jsp");
        response.getWriter().print("恭喜你注册成功，3秒钟后自动跳转");
    }
}
