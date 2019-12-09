package com.test.zhuxinkai.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <h3>parenttest</h3>
 * <p>全局异常处理</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 09:48
 **/

@ControllerAdvice  //增强型的@Controller，当系统启动时，该类会被扫描到Spring 容器中，然后定义uploadException 方法。

public class CustomExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)   //该方法添加了@ExceptionHandler注解。
    //其中定义的MaxUploadSizeExceededException.class 表明该方法用来处理MaxUploadSizeExceededException类型的异常。

    public void uploadException (MaxUploadSizeExceededException e,HttpServletResponse response) throws IOException{
        /*方法的参数有异常实例，HttpServletResponse , 以及 HttpServletRequest , Model 等，
        返回值可以是一段JSON， 一个ModelAndView ,一个逻辑视图名等
         */

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write("上传文件大小超出限制！");
        out.flush();
        out.close();

    }
}
