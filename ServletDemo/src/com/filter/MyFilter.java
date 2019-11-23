package com.filter;



import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class MyFilter implements Filter {
//定义来访数量
    private int count;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String param = filterConfig.getInitParameter("count");    //获取初始化参数，在web.xml 中的。
        count = Integer.valueOf(param);  //将参数字符串转成int


    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        count++;
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        ServletContext context = req.getSession().getServletContext();
        context.setAttribute("count",count);
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
