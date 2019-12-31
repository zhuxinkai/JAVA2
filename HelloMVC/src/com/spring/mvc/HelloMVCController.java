package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * <h3>HelloMVC</h3>
 * <p>mvc</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-31 18:06
 **/


@Controller
public class HelloMVCController extends AbstractController {


    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("index");
    }
}
