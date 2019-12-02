package com.filter;

import javax.servlet.*;
import java.io.IOException;

public class ChartSetFilter implements Filter {
    String encoding = null;   //字符编码

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      encoding=filterConfig.getInitParameter("encoding");    //获取初始化参数，这个方式获取的是web.xml 中的注册值。
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(encoding != null){
            servletRequest.setCharacterEncoding(encoding);
            servletResponse.setContentType("text/html;charset="+encoding);
        }
        filterChain.doFilter(servletRequest,servletResponse);   //传递给下一个过滤器
    }

    @Override
    public void destroy() {
        encoding = null;

    }
}
