package web;
/*
    1、访问login。
    2、拦截所有再访问。
    3、拦截然后放行再访问
 */
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class A01Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter do");

        filterChain.doFilter(servletRequest, servletResponse);//放行

    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
