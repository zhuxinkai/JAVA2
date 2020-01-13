package com.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <h3>HelloMVC</h3>
 * <p>interceptor</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-13 15:42
 **/
/*
拦截的粒度上，如果需要以方法为粒度，则需要在方法的命名上，规范化。
RequestMapping 上，再增加一层子目录。


preHandle  如果返回false 则被拦截了。

最终的拦截器用于异常的分析和监控。

多层次拦截器的执行顺序。

 */

public class myInterceptor implements HandlerInterceptor{
    @Override
    /*
    在Controller 执行之前 ，返回值的类型是boolean ,如果返回的是false;表示拦截。， true 表示放行。
    一般做权限的拦截。例如根据jwt的token ,cookie 信息等。
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
         System.out.println("前置拦截");
        return true;
    }

    @Override
    /*
    Controller 执行完之后进行拦截。 ModerandView  （视图解析） 之前。
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {


        Map<String,Object> map = modelAndView.getModel();
        map.put("test","appending something.....");
        System.out.println("后置拦截");

    }

    @Override
    /*
    最终拦截。执行时机，在视图解析器，解析页面完成之后。
    做一些异常监控。问题跟踪



     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    System.out.println("最终拦截器");
    System.out.println("---------------------------------------------------------------------");
   e.printStackTrace();
        // 如果没有异常，那么 e.printStackTrace(); 则会报空指针
    System.out.println("---------------------------------------------------------------------");


    }
}
